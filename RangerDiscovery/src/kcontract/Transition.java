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

/**
 * This class contains the transition, usually we call it R, that we want to use to repair the other transition T.
 * For R, we do not need to define holes, and therefore we do not really create an AST for it. Instead we just create the
 * right string definition for it as well as those of its input and output.
 */
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


    public Transition(WhichTransition whichTransition, String filePath, int maxK) {
        this.whichTransition = whichTransition;
        this.maxK = maxK;
        extractTransitionT(filePath);

        populateBaseVars(baseFreeInput, (filePath + "FreeIN"));
        populateBaseVars(baseConstrainedInput, (filePath + "StateIN"));
        populateBaseVars(baseOutput, (filePath + "OUT"));
    }

    /**
     * Populates base vars into the corresponding set of vars. Base vars are defined as those vars that are used in the contract_match assertion.
     *
     * @param file
     */
    protected void populateBaseVars(HashSet varSet, String file) {
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
     *
     * @param path
     */
    protected void extractTransitionT(String path) {
        String extractedT = null;
        try {
            extractedT = new String(Files.readAllBytes(Paths.get(path)), "UTF-8");

        } catch (IOException e) {
            System.out.println("Problem reading file. " + e.getMessage());
        }


        int start;
        int end;
        if (whichTransition == WhichTransition.T || whichTransition == WhichTransition.HOLE) {
            start = extractedT.indexOf("(define-fun T");
            end = extractedT.indexOf("(declare-fun %init () Bool)");
        } else { // assuming it is R transition then
            extractedT = preprocessTransition(extractedT); // current preprocessing is only intended for R
            start = extractedT.indexOf("(define-fun R");
            end = extractedT.length();
        }


        transitionStrLoc = new Pair<>(extractedT.substring(start, end - 1), new Pair<>(start, end));
    }

    /**
     * used for any pre-processing on the transition before actually using it, for example to remove ranges of int variables.
     *
     * @param extractedT
     * @return
     */
    protected String preprocessTransition(String extractedT) {
        StringBuilder processedTransition = new StringBuilder();
        String[] lines = extractedT.split(System.getProperty("line.separator"));
        for (String s : lines) {
            if (!s.contains("2147483648") && !s.contains("2147483647"))
                processedTransition.append(s).append("\n");
        }

        return processedTransition.toString();
    }


    public String define_fun_T() {
        return transitionStrLoc.getFirst();
    }

}
