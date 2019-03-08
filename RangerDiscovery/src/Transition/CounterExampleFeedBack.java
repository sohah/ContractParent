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

    static Solver solver;
    static Context ctx;

    public CounterExampleFeedBack() {
        ctx = new Context(cfg);
        cfg.put("proof", "true");
    }


    public static void executeConstantCEFL(String expfileName) throws DiscoveryException {

        Pair<LinkedHashMap<String, Var>, Ast> contextAndBody = ToAstPass.execute(transitionT.extractTransitionT(expfileName));

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

        if (sat)
            System.out.println("No repair was found");
        else
            System.out.println("Successful repair was completed, repaired contract is:\n" + transitionT.toString());

    }

    private static HashMap<Hole, Ast> getModelForHoles() throws DiscoveryException {

        HashMap<Hole, Ast> instantiatedHolesMap = new HashMap<>();

        Model model = solver.getModel();
        FuncDecl[] constDecl = model.getConstDecls();

        for (FuncDecl decl : constDecl) {
            Var var = holeTransitionT.tContext.get(decl.getName().toString());
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

        return instantiatedHolesMap;
    }

    private static boolean checkSat(TransitionT atransitionT) {
        String newTransitionT = transitionT.toString();
        String newMergedContract = transitionT.mergedContract.getFirst();
        StringBuilder stringBuilder = new StringBuilder(newMergedContract);
        stringBuilder.replace(transitionT.mergedContract.getSecond().getFirst(),
                transitionT.mergedContract.getSecond().getSecond(),
                newTransitionT);

        solver = ctx.mkSolver();
        solver.fromString(stringBuilder.toString());
        Status status = solver.check();
        if (status == Status.SATISFIABLE)
            return true;
        else
            return false;
    }

}
