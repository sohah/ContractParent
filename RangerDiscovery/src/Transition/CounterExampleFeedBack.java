package Transition;

import ast.Passes.RemoveHolesVisitor;
import ast.Passes.ToAstPass;
import ast.Passes.ToConstantHoleVisitor;
import ast.def.*;
import com.microsoft.z3.Context;
import com.microsoft.z3.Solver;
import ref.Pair;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static Transition.TransitionT.transitionT;


public class CounterExampleFeedBack {

    public HashMap<String, String> cfg = new HashMap<String, String>();

    Solver solver;
    Context ctx;

    public CounterExampleFeedBack(){
        ctx = new Context(cfg);
        cfg.put("proof", "true");


    }
    public static void executeConstantCEFL(String expfileName) throws DiscoveryException {
        Pair<LinkedHashMap<String, Var>, Ast> contextAndBody = ToAstPass.execute(expfileName);

        transitionT.tContext = contextAndBody.getFirst();
        transitionT.tBody = (Exp) contextAndBody.getSecond();

        HashMap<Hole, Ast> instantiatedHoles;

        boolean sat = true;
        boolean done = false;

        while (sat && !done) {

            contextAndBody = ToConstantHoleVisitor.execute(transitionT.tBody);
            transitionT.tHoleContext = contextAndBody.getFirst();
            transitionT.tHoleBody = (Exp) contextAndBody.getSecond();

            checkTholeSat();
            instantiatedHoles = getModelForHoles();
            transitionT.tPrimeBody = (Exp) RemoveHolesVisitor.execute(instantiatedHoles, transitionT.tHoleBody);
            sat = checkTprimeSat();

            done = true; // we want to stop after one  time change of constant.
        }

        if(sat)
            System.out.println("No repair was found");
        else
            System.out.println("Successful repair was completed, repaired contract is:\n" + transitionT.tPrimeToString());

    }

    private static HashMap<Hole,Ast> getModelForHoles() {

    }

    private static boolean checkTprimeSat() {
        return false;
    }

    private static void checkTholeSat() {
    }
}
