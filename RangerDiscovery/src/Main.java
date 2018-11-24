
public class Main {
    public static void main(String[] args) {

        String folderName;
        folderName = "../../VeriTransformations/VeritestingTransformations/SolverQueriesVeritesting/";
        String disfileName = folderName + "runPadStep1.txt";
        String expfileName = folderName + "expected.runPad.txt";

        RangerQueryDiscovery rangerDiscovery = new RangerQueryDiscovery();
        rangerDiscovery.discoverContract(disfileName, expfileName);

        JavaExample.main(null);
    }

}
