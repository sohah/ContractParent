import Transition.CounterExampleFeedBack;
import ast.def.*;

import java.io.IOException;

public class Main {

    static String folderName = "examples/pad/";
    static String kFileName = folderName + "ImaginaryPad.k-induction.smt2";
    static String rFileName = folderName + "SimplePadReset.runPadSteps(IZZZZZ)V#27_0.txt";

    static Transition t;
    static Transition r;
    static Transition h;
    static int maxK;

    public static void main(String[] args) throws DiscoveryException, IOException {

        t = new T( kFileName, maxK);
        h = new H(kFileName, maxK, (T) t);
        r = new R(rFileName, maxK);

        CounterExampleFeedBack.printContracts = false;

        //counterExampleFeedBack.executeConstantCEFL(contractInput);
    }
}
