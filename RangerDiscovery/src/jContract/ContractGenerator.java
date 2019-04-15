package jContract;

import ast.def.Assertion;
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

    Assertion contractKassertion;


    public ContractGenerator(int k, WhichStep whichStep, T t, R r, boolean counterExample) {
        this.k = k;
        tInstantiationArray = instantiate(whichStep, t);
        rInstantiationArray = instantiate(whichStep, r);
        if(!counterExample)
            contractKassertion = createContractAssertion();
        else
            contractKassertion = createTestCaseContractAssertion();
    }

    private ArrayList<StepOutput> instantiate(WhichStep whichStep, Transition transition) {
        ArrayList<StepOutput> stepsOuput = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            stepsOuput.add((new Step(whichStep, transition)).makeStep(i));
        }
        return stepsOuput;
    }

}
