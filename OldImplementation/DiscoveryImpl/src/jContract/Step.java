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

    public Step(WhichStep whichStep, Transition someT) {
        this.whichStep = whichStep;
        this.someT = someT;
    }

    /**
     * creating of step, must be in the order of the parameters definition in each transition.
     *
     * @param k
     * @return
     */
    public StepOutput makeStep(int k) {
        Pair<ArrayList<Exp>, ArrayList<Var>> stepParamAndVar = null;
        switch (someT.whichTransition) {
            case T:
            case HOLE:
                stepParamAndVar = makeTstepParameters((T) someT, k);
                break;
            case R:
                stepParamAndVar = makeRstepParameters((R) someT, k);
                break;
        }

        assert (stepParamAndVar != null);
        Assertion stepAssertion = new Assertion(new FunCall(someT, stepParamAndVar.getFirst()));
        ArrayList<Var> outputVars = stepParamAndVar.getSecond();
        StepOutput stepOutput = new StepOutput(stepAssertion, outputVars);
        return stepOutput;
    }


    /**
     * the purpose of this method is to create new vars with the right indexes for the required k.
     * it returns a pair of the Exp and Output Vars that were created resulting from the step.
     */
    private Pair<ArrayList<Exp>, ArrayList<Var>> makeRstepParameters(R r, int k) {
        ArrayList<FunParameter> originalParameters = r.parameters;

        ArrayList<Exp> instantiationBinding = new ArrayList<>();
        ArrayList<Var> newVars = new ArrayList<>();

        for (int i = 1; i < originalParameters.size(); i++) {
            FunParameter parameter = originalParameters.get(i);
            Var oldVar = parameter.getParameter();
            Var newVar;
            String oldVarNameNoScript = oldVar.name;

            switch (parameter.getParameterType()) {
                case INPUT:
                    if (oldVar.type == Exp.VarType.INT)
                        newVar = new IntVar((oldVarNameNoScript + "r" + (k - 1)));
                    else
                        newVar = new IntVar((oldVarNameNoScript + "r" + (k - 1)));
                    parameter = new FunParameter(newVar, ParameterType.INPUT);
                    instantiationBinding.add(parameter);
                    if (k == 1) //initially the input vars are newVars
                        newVars.add(newVar);
                    break;
                case OUTPUT:
                    if (oldVar.type == Exp.VarType.INT)
                        newVar = new IntVar((oldVarNameNoScript + "r" + (k)));
                    else
                        newVar = new IntVar((oldVarNameNoScript + "r" + (k)));
                    parameter = new FunParameter(newVar, ParameterType.OUTPUT);
                    instantiationBinding.add(parameter);
                    newVars.add(newVar);
                    break;
                case FREE_INPUT: // it uses the current k.
                    if (oldVar.type == Exp.VarType.INT)
                        newVar = new IntVar((oldVarNameNoScript + "r" + (k)));
                    else
                        newVar = new IntVar((oldVarNameNoScript + "r" + (k)));
                    parameter = new FunParameter(newVar, ParameterType.FREE_INPUT);
                    instantiationBinding.add(parameter);
                    break;
                case DONT_CARE_INPUT:
                    System.out.println("Dont care input is only valid for transition T!");
                    assert false;
                    break;
                case DONT_CARE_OUTPUT:
                    System.out.println("Dont care output is only valid for transition T!");
                    assert false;
                    break;
                case INTERMEDIATE: // Create new vars for intermediate variables.
                    if (oldVar.type == Exp.VarType.INT)
                        newVar = new IntVar((oldVarNameNoScript + "r" + (k)));
                    else
                        newVar = new IntVar((oldVarNameNoScript + "r" + (k)));
                    parameter = new FunParameter(newVar, ParameterType.INTERMEDIATE);
                    instantiationBinding.add(parameter);
                    break;
            }
        }

        return new Pair<>(instantiationBinding, newVars);
    }

    /**
     * the purpose of this method is to create new vars with the right indexes for the required k.
     * it returns a pair of the Exp and Output Vars(Input Vars are assumed to have been created outside) that were
     * created resulting from the step.
     */
    private Pair<ArrayList<Exp>, ArrayList<Var>> makeTstepParameters(T t, int k) {
        ArrayList<FunParameter> originalParameters = t.parameters;

        ArrayList<Exp> instantiationBinding = new ArrayList<>();
        ArrayList<Var> newVars = new ArrayList<>();


        if (whichStep == WhichStep.BMC)
            instantiationBinding.add(BoolConst.TRUE);
        else {
            Var firstVar = originalParameters.get(0).getParameter();
            if (!firstVar.toString().equals("%init")) {
                System.out.println("cannot have the first parameter in T anything but %init");
                assert false;
            }

            instantiationBinding.add(firstVar.clone());
        }

        for (int i = 1; i < originalParameters.size(); i++) {
            FunParameter parameter = originalParameters.get(i);
            Var oldVar = parameter.getParameter();
            Var newVar;
            String oldVarNameNoScript = oldVar.name.substring(oldVar.name.length() - 1, oldVar.name.length() - 1);

            switch (parameter.getParameterType()) {
                case INPUT:
                    if (oldVar.type == Exp.VarType.INT)
                        newVar = new IntVar((oldVarNameNoScript + (k - 1)));
                    else
                        newVar = new IntVar((oldVarNameNoScript + (k - 1)));
                    parameter = new FunParameter(newVar, ParameterType.INPUT);
                    instantiationBinding.add(parameter);
                    if (k == 1) //initially the input vars are newVars
                        newVars.add(newVar);
                    break;
                case OUTPUT:
                    if (oldVar.type == Exp.VarType.INT)
                        newVar = new IntVar((oldVarNameNoScript + (k)));
                    else
                        newVar = new IntVar((oldVarNameNoScript + (k)));
                    parameter = new FunParameter(newVar, ParameterType.OUTPUT);
                    instantiationBinding.add(parameter);
                    newVars.add(newVar);
                    break;
                case FREE_INPUT: // it uses the current k.
                    if (oldVar.type == Exp.VarType.INT)
                        newVar = new IntVar((oldVarNameNoScript + (k)));
                    else
                        newVar = new IntVar((oldVarNameNoScript + (k)));
                    parameter = new FunParameter(newVar, ParameterType.FREE_INPUT);
                    instantiationBinding.add(parameter);
                    break;
                case DONT_CARE_INPUT:
                    if (oldVar.type == Exp.VarType.INT)
                        newVar = new IntVar((oldVarNameNoScript + (k - 1)));
                    else
                        newVar = new IntVar((oldVarNameNoScript + (k - 1)));
                    parameter = new FunParameter(newVar, ParameterType.DONT_CARE_INPUT);
                    instantiationBinding.add(parameter);
                    if (k == 1) //initially the input vars are newVars
                        newVars.add(newVar);
                    break;
                case DONT_CARE_OUTPUT:
                    if (oldVar.type == Exp.VarType.INT)
                        newVar = new IntVar((oldVarNameNoScript + (k)));
                    else
                        newVar = new IntVar((oldVarNameNoScript + (k)));
                    parameter = new FunParameter(newVar, ParameterType.DONT_CARE_OUTPUT);
                    instantiationBinding.add(parameter);
                    newVars.add(newVar);
                    break;
                case INTERMEDIATE:
                    System.out.println("This should not happen for T!");
                    assert false;
                    break;
            }
        }

        return new Pair<>(instantiationBinding, newVars);
    }


}
