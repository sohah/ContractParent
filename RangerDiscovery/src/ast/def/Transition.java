package ast.def;

import ast.Passes.ToAstPass;
import ast.visitors.AstVisitor;
import ref.Pair;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

/**
 * This class contains the transition, usually we call it R, that we want to use to repair the other transition T.
 * For R, we do not need to define holes, and therefore we do not really create an AST for it. Instead we just create the
 * right string definition for it as well as those of its input and output.
 */
public class Transition extends Exp {

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
    public ArrayList<String> baseFreeInput = new ArrayList<>();

    /**
     * base name of ConstraintInput variables.
     */
    public ArrayList<String> baseConstrainedInput = new ArrayList<>();

    /**
     * base name of output variables.
     */
    public ArrayList<String> baseOutput = new ArrayList<>();

    /**
     * The transition definition
     */
    public Exp body;

    /**
     * parameters of the transition
     */
    public LinkedHashMap<String, Var> parameters = new LinkedHashMap<>();


    public Transition(WhichTransition whichTransition, String filePath, int maxK) {
        this.whichTransition = whichTransition;
        this.maxK = maxK;
        extractTransition(filePath);

        populateBaseVars(baseFreeInput, (filePath + "FreeIN"));
        populateBaseVars(baseConstrainedInput, (filePath + "StateIN"));
        populateBaseVars(baseOutput, (filePath + "OUT"));

        populateParametersAndBody();
    }

    protected void extractTransition(String filePath){} ;


    private void populateParametersAndBody() {
        Pair<LinkedHashMap<String, Var>, Ast> contextAndBody = ToAstPass.execute(this.transitionStrLoc.getFirst());
        parameters = contextAndBody.getFirst();
        if (!(contextAndBody.getSecond() instanceof Exp)) {
            System.out.println("cannot have an non Expression in the body of a transition!");
            assert false;
        }
        body = (Exp) contextAndBody.getSecond();
    }

    /**
     * Populates base vars into the corresponding set of vars. Base vars are defined as those vars that are used in the contract_match assertion.
     *
     * @param varSet
     * @param file
     */
    protected void populateBaseVars(ArrayList<String> varSet, String file) {
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



    public String define_fun() {
        return transitionStrLoc.getFirst();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) throws DiscoveryException {
        return body.accept(visitor);
    }


    public String define_fun_T(WhichTransition whichTransition) {
        StringBuilder t = new StringBuilder();

        if (whichTransition == WhichTransition.T)
            t.append("\n(define-fun T (");
        else if (whichTransition == WhichTransition.R) {
            t.append("\n(define-fun R (");
        } else {
            System.out.println("Repaired Transition must be type T!");
            assert false;
        }

        for (Map.Entry entry : this.parameters.entrySet()) { //reconstructing the parameter list for R
            t.append("(").append(((Var) entry.getValue()).toString());
            t.append(" ").append(((Var) entry.getValue()).type.toString());
            t.append(")");
        }
        t.append(") Bool\n");

        t.append(this.body);
        t.append(")\n");
        return t.toString();
    }

}
