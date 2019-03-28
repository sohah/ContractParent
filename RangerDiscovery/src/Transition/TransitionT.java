package Transition;

import ast.def.*;
import com.microsoft.z3.Model;
import com.microsoft.z3.Solver;
import ref.Pair;
import ref.Utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import static Transition.GeneralCounterExampleGenerator.generalCounterExampleGenerator;
import static Transition.R_CounterExampleGenerator.r_CounterExampleGenerator;

public class TransitionT {

    public LinkedHashMap<String, Var> tContext = new LinkedHashMap<>();

    public Exp tBody;
    public Pair<String, Pair<Integer, Integer>> mergedContract; //a pair of mergedContract String with to and from indexes of transitionT

    public static ArrayList<Exp> counterExampleAssertions = new ArrayList<Exp>();

    public static TransitionT transitionT = new TransitionT();
    public static TransitionT holeTransitionT = new TransitionT();
    public static TransitionT transitionTprime = new TransitionT();


    public String extractTransitionT(String path) {
        String extractedT = null;
        try {
            extractedT = new String(Files.readAllBytes(Paths.get(path)), "UTF-8");

        } catch (IOException e) {
            System.out.println("Problem reading file. " + e.getMessage());
        }
        int startT = extractedT.indexOf("(define-fun T");
        int endT = extractedT.indexOf("(declare-fun %init () Bool)");
        mergedContract = new Pair<String, Pair<Integer, Integer>>(extractedT, new Pair<>(startT, endT));
        extractedT = extractedT.substring(startT, endT - 1);
        return extractedT;
    }

    public String define_fun_T() {
        StringBuilder t = new StringBuilder();

        t.append("\n(define-fun T (");
        for (Map.Entry entry : this.tContext.entrySet()) { //reconstructing the parameter list for T
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
        StringBuilder t = new StringBuilder();

        for (Map.Entry<String, Var> entry : this.tContext.entrySet()) {
            if (entry.getKey().contains("Hole")) {
                t.append(entry.getValue().declare_fun());
                t.append("\n");
            }
        }
        return t.toString();
    }

    /**
     * This method is used for the static transition with hole to accumulate counter examples.
     *
     * @param contractInput
     */
    public void collectCounterExample(ContractInput contractInput, Solver solver, CounterExampleFeedBack counterExampleFeedBack, boolean firstTime) throws IOException, DiscoveryException {

        Model model = solver.getModel();
        if (firstTime)
            counterExampleFeedBack.saveToSolverFile(model.toString(), ("model_FirstTime"));
        else
            counterExampleFeedBack.saveToSolverFile(model.toString(), ("model" + CounterExampleFeedBack.fileSequence));

        Exp newCounterExampleAssertion = r_CounterExampleGenerator.generateCounterExample(contractInput, model);
        if (counterExampleAssertions.contains(newCounterExampleAssertion)) {
            System.out.println("repeated counter example, that can't happen!");
            assert false;
        } else
            counterExampleAssertions.add(newCounterExampleAssertion);
    }

    public String counterExampleAssertionsToString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Exp counterExample : counterExampleAssertions) {
            stringBuilder.append("(assert ");
            stringBuilder.append(counterExample.toString());
            stringBuilder.append(")\n");
        }
        return stringBuilder.toString();

    }
}
