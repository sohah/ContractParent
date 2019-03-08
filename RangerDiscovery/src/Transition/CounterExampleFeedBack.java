package Transition;

import ast.Passes.RemoveHolesVisitor;
import ast.Passes.ToAstPass;
import ast.Passes.ToConstantHoleVisitor;
import ast.def.*;
import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;
import com.microsoft.z3.Model;
import com.microsoft.z3.Solver;
import ref.Pair;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static Transition.TransitionT.holeTransitionT;
import static Transition.TransitionT.transitionT;
import static Transition.TransitionT.transitionTprime;


public class CounterExampleFeedBack {

    static HashMap<String, String> cfg = new HashMap<String, String>();

    static Solver solver;
    static Context ctx;

    public CounterExampleFeedBack(){
        ctx = new Context(cfg);
        cfg.put("proof", "true");
    }


    public static void executeConstantCEFL(String expfileName) throws DiscoveryException {
        Pair<LinkedHashMap<String, Var>, Ast> contextAndBody = ToAstPass.execute(expfileName);

        transitionT.tContext.putAll(contextAndBody.getFirst());
        transitionT.tBody = (Exp) contextAndBody.getSecond();

        HashMap<Hole, Ast> instantiatedHoles;

        boolean sat = true;
        boolean done = false;

        while (sat && !done) {

            contextAndBody = ToConstantHoleVisitor.execute(transitionT.tBody);
            holeTransitionT.tContext.putAll(transitionT.tContext);
            holeTransitionT.tContext.putAll(contextAndBody.getFirst());
            holeTransitionT.tBody = (Exp) contextAndBody.getSecond();

            checkSat(holeTransitionT);
            instantiatedHoles = getModelForHoles();
            transitionTprime.tBody = (Exp) RemoveHolesVisitor.execute(instantiatedHoles, holeTransitionT.tBody);
            sat = checkSat(transitionTprime);

            done = true; // we want to stop after one  time change of constant.
        }

        if(sat)
            System.out.println("No repair was found");
        else
            System.out.println("Successful repair was completed, repaired contract is:\n" + transitionT.toString());

    }

    private static HashMap<Hole,Ast> getModelForHoles() {

        Model model = solver.getModel();
        for(String var: holeTransitionT.tContext.keySet())


    }

    private static boolean checkSat(TransitionT transitionT) {

        return false;
    }

}
