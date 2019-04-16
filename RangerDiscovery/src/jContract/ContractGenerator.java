package jContract;

import ast.def.*;

import java.util.ArrayList;

import static ast.def.Exp.ONE;
import static ast.def.Var.createVarForType;

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
        contractKassertion = createContractAssertion(t, r, counterExample);

    }

    private Assertion createContractAssertion(T t, R r, boolean counterExample) {
        NExp inputMatchExp = createInputMatchAssertions(t, r);
        NExp outputExp = counterExample ? createOutputNotMatch(t, r) : createOutputMatch(t, r);

        return new Assertion(inputMatchExp, new Assertion(outputExp));

    }

    private ArrayList<StepOutput> instantiate(WhichStep whichStep, Transition transition) {
        ArrayList<StepOutput> stepsOuput = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            stepsOuput.add((new Step(whichStep, transition)).makeStep(i));
        }
        return stepsOuput;
    }


    /**
     * This method creates a matching (using equality) expression involving two vars in t and r for specific k. The
     *
     * @param tVarName
     * @param rVarName
     * @param k
     * @return
     */
    private NExp createNExpforTandR(T t, R r, String tVarName, String rVarName, int k) {
        Exp.VarType tVarType = getType(tVarName, t);
        Exp.VarType rVarType = getType(rVarName, r);

        assert (tVarType != null && rVarType != null);

        Var tVar = createVarForType(tVarName + "k", tVarType);
        Var rVar = createVarForType(tVarName + "k", rVarType);

        Exp rExp;
        if (!(tVarType == rVarType))
            rExp = typeConversion(rVar, rVarType, tVarType);
        else
            rExp = rVar;

        ArrayList<Exp> operands = new ArrayList();
        operands.add(tVar);
        operands.add(rExp);

        return new NExp(new Operator(Operator.OperatorKind.EQ), operands);
    }

    private NExp typeConversion(Var rVar, Exp.VarType fromType, Exp.VarType toType) {
        if ((fromType == Exp.VarType.INT) && (toType == Exp.VarType.BOOL)) {
            ArrayList<Exp> operands = new ArrayList();
            operands.add(rVar);
            operands.add(ONE);
            return new NExp(new Operator(Operator.OperatorKind.EQ), operands);
        }
        else {
            System.out.println("unsupported conversion");
            assert false;
            return null;
        }
    }


    /**
     * tries to find the type of a var in a transition.
     *
     * @param varName
     * @param transition
     * @return
     */
    private Exp.VarType getType(String varName, Transition transition) {
        Var var = transition.context.get(varName);
        return var.type;
    }
}
