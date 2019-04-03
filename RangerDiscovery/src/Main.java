import Transition.ContractInput;
import Transition.CounterExampleFeedBack;
import ast.def.DiscoveryException;
import kcontract.Transition;
import kcontract.WhichTransition;

import java.io.IOException;

import static Transition.CounterExampleFeedBack.counterExampleFeedBack;

public class Main {
    static String folderName = "../RunPadModel/Contracts/matchingContracts/CEFLP/Pad/";
    static String expfileName = folderName + "SimplePadReset.runPadSteps(IZZZZZ)V#27_0.txt";

    public static Transition t;
    public static Transition r;
    public static Transition holeT;

    public static void main(String[] args) throws DiscoveryException, IOException {

        t = new Transition(WhichTransition.T, expfileName);
        r = new Transition();
        holeT = new Transition(WhichTransition.T, expfileName);


        //String expfileName = folderName + "ImaginaryPad.k-induction.smt2";
        CounterExampleFeedBack.printContracts = false;
        ContractInput contractInput = new ContractInput(expfileName, expfileName + "FreeIN", expfileName + "StateIN", expfileName + "OUT");

        counterExampleFeedBack.executeConstantCEFL(contractInput);
    }
}
