package kcontract;

import ast.Passes.ToAstPass;
import ast.def.Ast;
import ast.def.Exp;
import ast.def.Var;
import ref.Pair;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Transition {

    /**
     * Maximum k-needed for the transition.
     */
    public int maxK;

    /**
     * Which transition is it, R or T?
     */
    public WhichTransition whichTransition;

    /**
     * The transition definition
     */
    public Exp tBody;

    /**
     * parameters of the transition
     */
    public LinkedHashMap<String, Var> tParamters = new LinkedHashMap<>();

    /**
     * a pair of a string of the transition function and its location in the string. d
     */
    public Pair<String, Pair<Integer, Integer>> transitionStrLoc;

    /**
     * Base name of free input variables
     */
    public LinkedHashSet<String> baseFreeInput = new LinkedHashSet<>();

    /**
     * base name of ConstraintInput variables.
     */
    public LinkedHashSet<String> baseConstrainedInput = new LinkedHashSet<>();

    /**
     * base name of output variables.
     */
    public LinkedHashSet<String> baseOutput = new LinkedHashSet<>();


    public Transition(WhichTransition whichTransition, String filePath) {
        this.whichTransition = whichTransition;
        extractTransitionT(filePath);

        populateBaseVars(baseFreeInput, (filePath + "FreeIN"));
        populateBaseVars(baseConstrainedInput, (filePath + "StateIN"));
        populateBaseVars(baseOutput, (filePath + "OUT"));

        Pair<LinkedHashMap<String, Var>, Ast> contextAndBody = ToAstPass.execute(this.transitionStrLoc.getFirst());
        tParamters = contextAndBody.getFirst();
        if(!(contextAndBody.getSecond() instanceof Exp)){
            System.out.println("cannot have an non Expression in the body of a transition!");
            assert false;
        }
        tBody = (Exp) contextAndBody.getSecond();
    }

    /**
     * Populates base vars into the corresponding set of vars. Base vars are defined as those vars that are used in the contract_match assertion.
     *
     * @param file
     */
    private void populateBaseVars(HashSet varSet, String file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            for (String line; (line = br.readLine()) != null; ) {
                // process the line.
                varSet.add(line);
            }
        } catch (Exception e) {
            System.out.println("problem reading input for vars");
            assert false;
        }
    }

    /**
     * Has the side effect of populating the transitionStrLoc with the string of the
     * @param path
     */
    public void extractTransitionT(String path) {
        String extractedT = null;
        try {
            extractedT = new String(Files.readAllBytes(Paths.get(path)), "UTF-8");

        } catch (IOException e) {
            System.out.println("Problem reading file. " + e.getMessage());
        }

        int start;
        int end;

        if (whichTransition == WhichTransition.T) {
            start = extractedT.indexOf("(define-fun T");
            end = extractedT.indexOf("(declare-fun %init () Bool)");
        } else { // assuming it is R transition then
            start = extractedT.indexOf("(define-fun R");
            end = extractedT.length();
        }

        transitionStrLoc = new Pair<>(extractedT.substring(start, end - 1), new Pair<>(start, end));
    }

    public String define_fun_T() {
        StringBuilder t = new StringBuilder();

        if (whichTransition == WhichTransition.T)
            t.append("\n(define-fun T (");
        else // assuming it is R transistion then
            t.append("\n(define-fun R (");

        for (Map.Entry entry : this.tParamters.entrySet()) { //reconstructing the parameter list for T
            if (!entry.getValue().toString().contains("Hole")) {
                t.append("(");
                t.append(((Var) entry.getValue()).toString());
                t.append(" ");
                t.append(((Var) entry.getValue()).type.toString());
                t.append(")");
            }
        }
        t.append(") Bool\n");

        t.append(this.tBody);
        t.append(")\n");
        return t.toString();
    }

    public String declare_Hole_Constants() {

        if (whichTransition != WhichTransition.T) {
            System.out.println("Cannot make holes for transitions that are not T");
            assert false;
        }
        ;

        StringBuilder t = new StringBuilder();

        for (Map.Entry<String, Var> entry : this.tParamters.entrySet()) {
            if (entry.getKey().contains("Hole")) {
                t.append(entry.getValue().declare_fun());
                t.append("\n");
            }
        }
        return t.toString();
    }

}
