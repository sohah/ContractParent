package jContract;

import ast.def.Assertion;
import ast.def.Transition;
import ast.def.Var;

import java.util.ArrayList;

/**
 * Contains information about each step of instantiation.
 */
public class StepInOut {
    ArrayList<Var> input;
    ArrayList<Var> output;
    ArrayList<Var> intermediate;

    public StepInOut(ArrayList input, ArrayList output, ArrayList intermediate) {
        this.input = input;
        this.output = output;
        this.intermediate = intermediate;
    }
}
