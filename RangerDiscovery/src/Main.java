import Transition.TransitionT;
import ast.Passes.ToAstPass;

public class Main {
    public static TransitionT transitionT = new TransitionT();

    public static void main(String[] args) {

        String folderName;
        folderName = "../RunPadModel/ImaginaryPad/";
        String disfileName = folderName + "UnbeliveablySimplePad.runPadSteps(IZZZZ)V#21_0.txt";
        String expfileName = folderName + "ImaginaryPad0.k-inductiontest.smt2";

        ToAstPass.execute(expfileName);
        /*ref.RangerQueryDiscovery rangerDiscovery = new ref.RangerQueryDiscovery();
        rangerDiscovery.discoverContract(disfileName, expfileName);

        ref.JavaExample.main(null);*/


    }

}
