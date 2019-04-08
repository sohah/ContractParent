package kcontract;

import ast.Passes.ToAstPass;
import ast.Passes.ToConstantHoleVisitor;
import ast.def.Ast;
import ast.def.DiscoveryException;
import ast.def.Exp;
import ast.def.Var;
import ref.Pair;

import java.util.LinkedHashMap;
import java.util.Map;

import static Transition.TransitionT.holeTransitionT;
import static Transition.TransitionT.transitionT;

public class HoleTransition extends Transition {

    /**
     * The transition definition
     */
    public Exp tBody;

    /**
     * parameters of the transition
     */
    public LinkedHashMap<String, Var> tParamters = new LinkedHashMap<>();


    public HoleTransition(WhichTransition whichTransition, String filePath, int maxK, TransitionToRepair t) {
        super(whichTransition, filePath, maxK);
        if (whichTransition != WhichTransition.HOLE) {
            System.out.println("Cannot define hole transition, for non-hole transition.");
        }
        Pair<LinkedHashMap<String, Var>, Ast> contextAndBody;
        try {
            contextAndBody = ToConstantHoleVisitor.execute(t.tBody);
            tParamters.putAll(t.tParamters);
            tParamters.putAll(contextAndBody.getFirst());
            tBody = (Exp) contextAndBody.getSecond();
        } catch (DiscoveryException e) {
            System.out.println("error creating hole transition, " + e.getMessage());
        }
    }


    public String define_fun_T() {
        StringBuilder t = new StringBuilder();

        if (whichTransition == WhichTransition.HOLE)
            t.append("\n(define-fun T (");
        else {
            System.out.println("Repaired Transition must be type T!");
            assert false;
        }

        for (Map.Entry entry : this.tParamters.entrySet()) { //reconstructing the parameter list for T
            if (!entry.getValue().toString().contains("Hole")) {
                t.append("(").append(((Var) entry.getValue()).toString());
                t.append(" ").append(((Var) entry.getValue()).type.toString());
                t.append(")");
            }
        }
        t.append(") Bool\n");

        t.append(this.tBody);
        t.append(")\n");
        return t.toString();
    }
}
