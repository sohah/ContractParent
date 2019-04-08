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

public class TransitionToRepair extends Transition {

    /**
     * The transition definition
     */
    public Exp tBody;

    /**
     * parameters of the transition
     */
    public LinkedHashMap<String, Var> tParamters = new LinkedHashMap<>();


    public TransitionToRepair(WhichTransition whichTransition, String filePath, int maxK) {
        super(whichTransition, filePath, maxK);
   //     if (whichTransition == WhichTransition.T) {
            Pair<LinkedHashMap<String, Var>, Ast> contextAndBody = ToAstPass.execute(this.transitionStrLoc.getFirst());
            tParamters = contextAndBody.getFirst();
            if (!(contextAndBody.getSecond() instanceof Exp)) {
                System.out.println("cannot have an non Expression in the body of a transition!");
                assert false;
            }
            tBody = (Exp) contextAndBody.getSecond();
     /*   } else {
            System.out.println("Repaired Transition must be type T!");
            assert false;
        }*/
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


    public String define_fun_T() {
        StringBuilder t = new StringBuilder();

        if (whichTransition == WhichTransition.T)
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
