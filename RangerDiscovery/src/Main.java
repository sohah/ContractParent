import Transition.ContractInput;
import ast.def.DiscoveryException;

import java.io.IOException;

import static Transition.CounterExampleFeedBack.counterExampleFeedBack;

public class Main {


    public static void main(String[] args) throws DiscoveryException, IOException {

        String folderName;
        folderName = "../RunPadModel/Contracts/matchingContracts/CEFLP/Pad/";
        String expfileName = folderName + "SimplePadReset.runPadSteps(IZZZZZ)V#27_0.txt";

        ContractInput contractInput = new ContractInput(expfileName, expfileName+"FreeIN", expfileName+"OUT", expfileName+"StateIN");
        counterExampleFeedBack.executeConstantCEFL(contractInput);
    }
}
