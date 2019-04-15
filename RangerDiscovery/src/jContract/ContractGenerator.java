package jContract;

import ast.def.R;
import ast.def.T;
import ast.def.Transition;

import java.util.ArrayList;

/**
 * used to generate instantiations for both T and R as well as the merging of their contract for any number of K.
 */


public class ContractGenerator {
    /**
     * the value of k for which the instantiation should happen and also for which merging of the contracts should
     * occur.
     */
    int k;

    ArrayList<StepOutput> tInstantiationArray = new ArrayList<>();

    ArrayList<StepOutput> rInstantiationArray = new ArrayList<>();


    public ContractGenerator(int k, WhichStep whichStep, T t, R r) {
        this.k = k;
        tInstantiationArray = instantiate(whichStep, t);
        rInstantiationArray = instantiate(whichStep, r);

    }

    private ArrayList<StepOutput> instantiate(WhichStep whichStep, Transition transition) {
        ArrayList<StepOutput> stepsOuput = new ArrayList<StepOutput>();
        for (int i = 0; i < k; i++) {
            stepsOuput.add((new Step(whichStep, transition)).makeStep(i));
        }
        return stepsOuput;
    }

}
