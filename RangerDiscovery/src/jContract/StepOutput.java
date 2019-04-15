package jContract;

import ast.def.Assertion;
import ast.def.Exp;
import ast.def.Transition;
import ast.def.Var;

import java.util.ArrayList;

/**
 * Contains information about each step of instantiation, more precisely the assertion itself and the output
 * vars that were interdicted by this step.
 */
public class StepOutput {
    ArrayList<Var> outputVars;
    Assertion assertions;

    public StepOutput(Assertion assertion, ArrayList<Var> outputVars) {
        this.outputVars = outputVars;
        this.assertions = assertion;
    }
}
