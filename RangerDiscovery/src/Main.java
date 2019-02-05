
public class Main {
    public static void main(String[] args) {

        String folderName;
        folderName = "../RunPadModel/";
        String disfileName = folderName + "UnbeliveablySimplePad.runPadSteps(IZZZZ)V#21_0.txt";
        String expfileName = folderName + "PadModelReset.k-induction.smt2";

        RangerQueryDiscovery rangerDiscovery = new RangerQueryDiscovery();
        rangerDiscovery.discoverContract(disfileName, expfileName);

        JavaExample.main(null);
    }

}
