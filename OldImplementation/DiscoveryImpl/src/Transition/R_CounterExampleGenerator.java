package Transition;

import ast.def.*;
import com.microsoft.z3.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static ast.def.Operator.OperatorKind.AND;
import static ast.def.Operator.OperatorKind.IMPLIES;

public class R_CounterExampleGenerator extends CounterExampleGenerator {

    public static R_CounterExampleGenerator r_CounterExampleGenerator = new R_CounterExampleGenerator();

    private HashMap<Var, Ast> inputModelMapBase = new HashMap<>();
    //private HashMap<Var, Ast> outputModelMapBase = new HashMap<>(); // i am commenting this out since it is a subset of the input that is passed to the kstep

    private HashMap<Var, Ast> inputModelMapKStep = new HashMap<>();
    private HashMap<Var, Ast> outputRModelMapKStep = new HashMap<>();
    private HashMap<Var, Ast> outputTModelMapKStep = new HashMap<>();

    private HashMap<Var, Ast> inputPropBaseAndKStep = new HashMap<>();
    private HashMap<Var, Ast> outputPropKStep = new HashMap<>();

    private ContractInput contractInput;

    public Exp generateCounterExample(ContractInput contractInput, Model model) throws IOException, DiscoveryException {
        this.contractInput = contractInput;
        this.model = model;

        if (inputModelMapBase.size() > 0) { //reset of the map synthesis from previous step
            assert (inputModelMapKStep.size() > 0
                    && outputRModelMapKStep.size() > 0
                    && outputTModelMapKStep.size() > 0
                    && inputPropBaseAndKStep.size() > 0
                    && outputPropKStep.size() > 0);
            clearModelMapValues();
        } else {
            assert (inputModelMapKStep.size() == 0
                    && outputRModelMapKStep.size() == 0
                    && outputTModelMapKStep.size() == 0
                    && inputPropBaseAndKStep.size() == 0
                    && outputPropKStep.size() == 0);
            populateMapKeys();
        }

        populateMapValues();
        printMap();
        return createCounterExampleAssertion();
    }

    private void printMap() {
        System.out.println("**** printing counter example model valuation for input and output*****\n");
        System.out.println("Input in base step:\t" + inputModelMapBase + "\n");
        System.out.println("Input in k-step:\t" + inputModelMapKStep + "\n");
        System.out.println("Output of k-step in R:\t" + outputRModelMapKStep + "\n");
        System.out.println("Output of k-step for T:\t" + outputTModelMapKStep + "\n");
        System.out.println("**** End of counter example model valuation for input and output*****\n");
    }

    private Exp createCounterExampleAssertion() {
        ArrayList<Exp> antecedent = generatTestValues(inputModelMapBase);
        antecedent.addAll(generatTestValues(inputModelMapKStep));
        antecedent.addAll(generatTestValues(inputPropBaseAndKStep));

        //antecedent.add(new NExp(new Operator(EQ)), )

        Exp antecedentExp = new NExp(new Operator(AND), antecedent);

        ArrayList<Exp> consequent = generatTestValues(outputRModelMapKStep);
        consequent.addAll(generatTestValues(outputPropKStep));

        Exp consequentExp = new NExp(new Operator(AND), consequent);

        ArrayList<Exp> implicationOperands = new ArrayList<Exp>();
        implicationOperands.add(antecedentExp);
        implicationOperands.add(consequentExp);

        return new NExp(new Operator(IMPLIES), implicationOperands);
    }

    /**
     * has the side effect of populating values to the 4 maps in this class with the right test case values.
     */
    private void populateMapValues() throws DiscoveryException {
        FuncDecl[] constDecl = model.getConstDecls();

        for (FuncDecl decl : constDecl) {
            Exp expValue;
            Expr interpretation = model.getConstInterp(decl);
            expValue = translateToAst(interpretation);

            updateMap(inputModelMapBase, decl.getName().toString(), expValue);
            updateMap(inputModelMapKStep, decl.getName().toString(), expValue);
            updateMap(outputRModelMapKStep, decl.getName().toString(), expValue);
            updateMap(outputTModelMapKStep, decl.getName().toString(), expValue);
            updateMap(inputPropBaseAndKStep, decl.getName().toString(), expValue);
            updateMap(outputPropKStep, decl.getName().toString(), expValue);
        }
        assertPropTrue(inputPropBaseAndKStep);
        assertPropTrue(outputPropKStep);

    }

    private void assertPropTrue(HashMap<Var, Ast> outputPropKStep) {
        for (Map.Entry<Var, Ast> entry : outputPropKStep.entrySet()) {
            if (!(entry.getValue().equals(BoolConst.TRUE))) {
                System.out.println("Property Problem! One property is not true");
                assert false;
            }
        }
    }


    private boolean updateMap(HashMap<Var, Ast> map, String varName, Exp expValue) {

        for (Map.Entry<Var, Ast> entry : map.entrySet()) {
            if (entry.getKey().name.equals(varName)) {
                entry.setValue(expValue);
                return true;
            }
        }
        return false;
    }

    /**
     * has the side effect of populating inputModelMap and outputModelMap.
     */
    private void populateMapKeys() throws IOException, DiscoveryException {

        /****** populating input ******/
        /**** free Input ********/
        try (BufferedReader br = new BufferedReader(new FileReader(contractInput.freeInVarFileName))) {
            for (String line; (line = br.readLine()) != null; ) {
                // process the line.
                Var var = findInModel(line.replaceAll(" ", "") + "$r0");
                if (var == null)
                    catchInputOutputProblem();

                inputModelMapBase.put(var, null);
                var = findInModel(line.replaceAll(" ", "") + "$r1");
                if (var == null)
                    catchInputOutputProblem();

                inputModelMapKStep.put(var, null);
            }
        }
        /**** state Input ******/
        try (BufferedReader br = new BufferedReader(new FileReader(contractInput.stateInVarFileName))) {
            for (String line; (line = br.readLine()) != null; ) {
                // process the line.
                Var var = findInModel(line + "$r0");

                if (var == null)
                    catchInputOutputProblem();

                inputModelMapBase.put(var, null);
            }
        }

        /****** populating R output ******/
        try (BufferedReader br = new BufferedReader(new FileReader(contractInput.outVarFileName))) {
            for (String line; (line = br.readLine()) != null; ) {
                // process the line.
                Var var = findInModel(line + "$r0");
                if(var == null)
                    catchInputOutputProblem();
                inputModelMapKStep.put(var, null);

                var = findInModel(line + "$r1");

                if(var == null)
                    catchInputOutputProblem();
                outputRModelMapKStep.put(var, null);
            }
        }

        /****** populating T output ******/
        Var var1 = findInModel("$ignition$1");
        if (var1 == null)
            catchInputOutputProblem();
        else
            outputTModelMapKStep.put(var1, null);

        Var var2 = findInModel("$launch_bt$1");
        if (var2 == null)
            catchInputOutputProblem();
        else
            outputTModelMapKStep.put(var2, null);

        Var var3 = findInModel("$start_bt$1");
        if (var3 == null)
            catchInputOutputProblem();
        else
            outputTModelMapKStep.put(var3, null);

        Var var4 = findInModel("$reset_flag$1");
        if (var4 == null)
            catchInputOutputProblem();
        else
            outputTModelMapKStep.put(var4, null);

        /****** populating Property input and output ******/
        Var var5 = findInModel("$p1$~1");
        if (var5 != null)
            inputPropBaseAndKStep.put(var5, null);

        Var var6 = findInModel("$p1$0");
        if (var6 != null)
            inputPropBaseAndKStep.put(var6, null);

        Var var7 = findInModel("$p1$1");
        if (var7 != null)
            outputPropKStep.put(var7, null);
    }

    private void clearModelMapValues() {
        for (Map.Entry<Var, Ast> entry : inputModelMapBase.entrySet())
            entry.setValue(null);

        for (Map.Entry<Var, Ast> entry : inputModelMapKStep.entrySet())
            entry.setValue(null);

        for (Map.Entry<Var, Ast> entry : outputRModelMapKStep.entrySet())
            entry.setValue(null);

        for (Map.Entry<Var, Ast> entry : outputTModelMapKStep.entrySet())
            entry.setValue(null);

        for (Map.Entry<Var, Ast> entry : inputPropBaseAndKStep.entrySet())
            entry.setValue(null);

        for (Map.Entry<Var, Ast> entry : outputPropKStep.entrySet())
            entry.setValue(null);

    }
}
