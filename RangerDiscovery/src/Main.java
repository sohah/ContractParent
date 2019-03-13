import Transition.ContractInput;
import Transition.CounterExampleFeedBack;
import ast.def.DiscoveryException;

import java.io.IOException;

import static Transition.CounterExampleFeedBack.counterExampleFeedBack;

public class Main {

    public static void main(String[] args) throws DiscoveryException, IOException {

        String folderName;
        folderName = "../RunPadModel/Contracts/matchingContracts/CEFLP/Pad/";
        String expfileName = folderName + "SimplePadReset.runPadSteps(IZZZZZ)V#27_0.txt";

        CounterExampleFeedBack.printContracts = true;
        ContractInput contractInput = new ContractInput(expfileName, expfileName+"FreeIN", expfileName+"StateIN", expfileName+"OUT");

        counterExampleFeedBack.executeConstantCEFL(contractInput);
    }
}
