package Transition;

import ast.Passes.RemoveHolesVisitor;
import ast.Passes.ToAstPass;
import ast.Passes.ToConstantHoleVisitor;
import ast.def.*;
import ref.Pair;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static Transition.TransitionT.transitionT;


public class CounterExampleFeedBack {


    public static void executeConstantCEFL(String expfileName) throws DiscoveryException {
        Pair<LinkedHashMap<String, Var>, Ast> contextAndBody = ToAstPass.execute(expfileName);

        transitionT.tContext = contextAndBody.getFirst();
        transitionT.tBody = (Exp) contextAndBody.getSecond();

        public HashMap<Hole, Ast> instantiatedHoles = new HashMap<>();

        boolean sat = true;
        boolean done = false;

        while (sat && !done) {

            contextAndBody = ToConstantHoleVisitor.execute(transitionT.tBody);
            transitionT.tHoleContext = contextAndBody.getFirst();
            transitionT.tHoleBody = (Exp) contextAndBody.getSecond();

            checkSat();
            instantiatedHoles = getModel();
            transitionT.tPrimeBody = (Exp) RemoveHolesVisitor.execute(instantiatedHoles, transitionT.tHoleBody);



        }

        if(sat)
            System.out.println("No repair was found");
        else
            System.out.println("Successful repair was completed, repaired contract is:\n" + transitionT.tPrimeToString());

    }
}
