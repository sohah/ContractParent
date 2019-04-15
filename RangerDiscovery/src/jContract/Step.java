package jContract;

import ast.def.*;
import ref.Pair;

public class Step {
    /**
     * defines the k value for this step
     */
    int k;

    /**
     * defines the input and output of this step as well as its intermediate variables.
     */
    StepInOut stepInOut;

    /**
     * defines the assertion that is generated out of the step
     */
    Assertion assertion;


    /**
     * defines the transition on which the step has taken place
     */
    Transition someT;

    WhichStep whichStep;

    public Step(int k, WhichStep whichStep, StepInOut stepInOut, Transition someT) {
        this.k = k;
        this.whichStep = whichStep;
        this.stepInOut = stepInOut;
        this.someT = someT;
    }

    public Assertion makeStep(int k, StepInOut stepInOut, Transition someT) {
        switch (someT.whichTransition) {
            case T: return new Assertion(new FunCall(someT, ))
                break;
            case R:
                break;
            case HOLE:
                break;
        }
    }
}
