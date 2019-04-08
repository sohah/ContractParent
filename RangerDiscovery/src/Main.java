import Transition.ContractInput;
import Transition.CounterExampleFeedBack;
import ast.def.DiscoveryException;
import kcontract.HoleTransition;
import kcontract.TransitionToRepair;
import kcontract.WhichTransition;
import kcontract.Transition;

import java.io.IOException;

import static Transition.CounterExampleFeedBack.counterExampleFeedBack;

public class Main {

    static String folderName = "examples/pad/";
    static String kFileName = folderName + "ImaginaryPad.k-induction.smt2";
    static String rFileName = folderName + "SimplePadReset.runPadSteps(IZZZZZ)V#27_0.txt";

    static Transition t;
    static Transition r;
    static Transition h;
    static int maxK;

    public static void main(String[] args) throws DiscoveryException, IOException {

        t = new TransitionToRepair(WhichTransition.T, kFileName, maxK);
        h = new HoleTransition(WhichTransition.HOLE, kFileName, maxK, (TransitionToRepair) t);
        r = new TransitionToRepair(WhichTransition.R, rFileName, maxK);

        CounterExampleFeedBack.printContracts = false;

        //counterExampleFeedBack.executeConstantCEFL(contractInput);
    }
}
