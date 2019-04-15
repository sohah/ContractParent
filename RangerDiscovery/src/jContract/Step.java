package jContract;

import ast.def.*;
import ref.Pair;

import java.util.ArrayList;

public class Step {
    /**
     * defines the k value for this step
     */
    int k;

    /**
     * defines the assertion that is generated out of the step
     */
    Assertion assertion;


    /**
     * defines the transition on which the step has taken place
     */
    Transition someT;

    WhichStep whichStep;

    public Step(int k, WhichStep whichStep, Transition someT) {
        this.k = k;
        this.whichStep = whichStep;
        this.someT = someT;
    }

    /**
     * creating of step, must be in the order of the parameters definition in each transition.
     * @param someT
     * @param k
     * @return
     */
    public StepOutput makeStep(Transition someT, ArrayList<Var> input, int k) {
        Pair<ArrayList<Exp>, ArrayList<Var>> stepParamAndVar = someT.makeStepParameters(k);
        switch (someT.whichTransition) {
            case T:
            case HOLE:
                stepParamAndVar = makeTstepParameters(someT, k);
                break;
            case R:
                stepParamAndVar = makeRstepParameters(someT, k);
                break;
        }

        assert(stepParamAndVar != null);
        Assertion stepAssertion = new Assertion(new FunCall(someT, stepParamAndVar.getFirst()));
        ArrayList<Var> outputVars = stepParamAndVar.getSecond();
        StepOutput stepOutput = new StepOutput(stepAssertion, outputVars);
        return stepOutput;
    }

    /**
     * the purpose of this method is to create new vars with the right indexes for the required k.
     * it returns a pair of the Exp and Output Vars that were created resulting from the step.
     */
    private Pair<ArrayList<Exp>,ArrayList<Var>> makeRstepParameters(Transition someT, int k) {
    }

    /**
     * the purpose of this method is to create new vars with the right indexes for the required k.
     * it returns a pair of the Exp and Output Vars that were created resulting from the step.
     */
    private Pair<ArrayList<Exp>,ArrayList<Var>> makeTstepParameters(Transition someT, int k) {

    }




}
