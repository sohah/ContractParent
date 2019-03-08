package Transition;

import ast.Passes.HoleGenerator;
import ast.Passes.RemoveHolesVisitor;
import ast.Passes.ToAstPass;
import ast.Passes.ToConstantHoleVisitor;
import ast.def.*;
import com.microsoft.z3.*;
import ref.Pair;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static Transition.TransitionT.holeTransitionT;
import static Transition.TransitionT.transitionT;
import static Transition.TransitionT.transitionTprime;
import static ast.def.BoolConst.FALSE;
import static ast.def.BoolConst.TRUE;


public class CounterExampleFeedBack {

    static HashMap<String, String> cfg = new HashMap<String, String>();

    Solver solver;
    Context ctx;

    public CounterExampleFeedBack() {
        ctx = new Context(cfg);
        cfg.put("proof", "true");
    }

    public static CounterExampleFeedBack counterExampleFeedBack = new CounterExampleFeedBack();

    public void executeConstantCEFL(String expfileName) throws DiscoveryException {

        Pair<LinkedHashMap<String, Var>, Ast> contextAndBody = ToAstPass.execute(transitionT.extractTransitionT(expfileName));

        transitionT.tContext.putAll(contextAndBody.getFirst());
        transitionTprime.tContext.putAll(contextAndBody.getFirst()); //Tprime at least until now will have the same context

        transitionT.tBody = (Exp) contextAndBody.getSecond();

        HashMap<Hole, Ast> instantiatedHoles;

        boolean sat = true; // I need to added here the check for the first time
        boolean done = false;

        while (sat && !done) {

            contextAndBody = ToConstantHoleVisitor.execute(transitionT.tBody);
            holeTransitionT.tContext.putAll(transitionT.tContext);
            holeTransitionT.tContext.putAll(contextAndBody.getFirst());
            holeTransitionT.tBody = (Exp) contextAndBody.getSecond();

            System.out.println("**************** Checking SAT for holeContract:\n" + holeTransitionT.declare_Hole_Constants() + holeTransitionT.define_fun_T());
            boolean instantiationSat = checkSat(holeTransitionT, true);
            if (!instantiationSat) {
                System.out.println("problem happened during finding instantiation!");
                return;
            }
            else
                System.out.println("SAT");

            instantiatedHoles = getModelForHoles();
            transitionTprime.tBody = (Exp) RemoveHolesVisitor.execute(instantiatedHoles, holeTransitionT.tBody);

            System.out.println("*************** Checking SAT for the repaired Contract T': \n" + transitionTprime.define_fun_T());
            sat = checkSat(transitionTprime, false);
            if(sat)
                System.out.println("SAT");
            else {
                System.out.println("UNSAT ---- repair is found ^-^");
                sat = false;
            }

            done = true; // we want to stop after trying changing all possible constants, we have to maintain the set of constants that we need to change along the way.
        }

        if (sat)
            System.out.println("No repair was found");
        else
            System.out.println("Successful repair was completed, repaired contract is:\n" + transitionT.toString());

    }

    private HashMap<Hole, Ast> getModelForHoles() throws DiscoveryException {

        HashMap<Hole, Ast> instantiatedHolesMap = new HashMap<>();

        Model model = solver.getModel();
        FuncDecl[] constDecl = model.getConstDecls();

        for (FuncDecl decl : constDecl) {
            Var var = holeTransitionT.tContext.get(decl.getName().toString());
            if (var != null && var.toString().contains("Hole")) {
                Expr interpetation = model.getConstInterp(decl);
                if (interpetation.isInt())
                    instantiatedHolesMap.put(HoleGenerator.varHoleHashMap.get(var),
                            new IntConst(Integer.valueOf(interpetation.toString())));
                else if (interpetation.isTrue())
                    instantiatedHolesMap.put(HoleGenerator.varHoleHashMap.get(var),
                            TRUE);
                else if (interpetation.isFalse())
                    instantiatedHolesMap.put(HoleGenerator.varHoleHashMap.get(var),
                            FALSE);
                else throw new DiscoveryException("unexpected interpetation");
            }
        }

        return instantiatedHolesMap;
    }

    private boolean checkSat(TransitionT atransitionT, boolean isHoleT) {
        StringBuilder newTransitionT;
        if (isHoleT) {
            newTransitionT = new StringBuilder(atransitionT.declare_Hole_Constants());
            newTransitionT.append(atransitionT.define_fun_T());
        } else
            newTransitionT = new StringBuilder(atransitionT.define_fun_T());

        String newMergedContract = transitionT.mergedContract.getFirst();
        StringBuilder stringBuilder = new StringBuilder(newMergedContract);
        stringBuilder.replace(transitionT.mergedContract.getSecond().getFirst(),
                transitionT.mergedContract.getSecond().getSecond(),
                newTransitionT.toString());

        solver = ctx.mkSolver();
        solver.fromString(stringBuilder.toString());
        Status status = solver.check();
        if (status == Status.SATISFIABLE)
            return true;
        else
            return false;
    }

}
