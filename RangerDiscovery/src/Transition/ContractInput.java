package Transition;

public class ContractInput {


    public String mergedFileName;
    public String freeInVarFileName;
    public String stateInVarFileName;
    public String outVarFileName;

    public ContractInput(String mergedFileName, String freeInVarFileName, String stateInVarFileName, String outVarFileName){
        this.mergedFileName = mergedFileName;
        this.freeInVarFileName = freeInVarFileName;
        this.stateInVarFileName = stateInVarFileName;
        this.outVarFileName = outVarFileName;
    }
}
