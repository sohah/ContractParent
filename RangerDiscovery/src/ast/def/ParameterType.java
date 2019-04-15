package ast.def;

public enum ParameterType{INPUT, //input of the transition, later used in merging of contracts
    OUTPUT,  // output of the transition, later used in merging of contracts
    FREE_INPUT, // input of a transition, that is un constrained
    DONT_CARE_INPUT,  //an input to T transition which we do not care about matching it in the contract.
    DONT_CARE_OUTPUT,  // an ouput in T transition which we do not care about matching it in the contract.
    INTERMEDIATE // some  variable used in the function, this is used with R intermediate variables.
}
