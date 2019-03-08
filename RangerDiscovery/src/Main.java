import Transition.CounterExampleFeedBack;
import Transition.TransitionT;
import ast.Passes.ToAstPass;
import ast.def.DiscoveryException;

import static Transition.CounterExampleFeedBack.counterExampleFeedBack;

public class Main {

    public static void main(String[] args) throws DiscoveryException {

        String folderName;
        folderName = "../RunPadModel/Contracts/matchingContracts/CEFLP/Pad/";
        String expfileName = folderName + "SimplePadReset.runPadSteps(IZZZZZ)V#27_0.txt";

        counterExampleFeedBack.executeConstantCEFL(expfileName);
    }
}
