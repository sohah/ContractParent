package Transition;

import ast.def.*;
import com.microsoft.z3.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static ast.def.BoolConst.FALSE;
import static ast.def.BoolConst.TRUE;
import static ast.def.Operator.OperatorKind.AND;
import static ast.def.Operator.OperatorKind.EQ;
import static ast.def.Operator.OperatorKind.IMPLIES;

public class R_CounterExampleGenerator extends CounterExampleGenerator{

    public static R_CounterExampleGenerator r_CounterExampleGenerator = new R_CounterExampleGenerator();

    private HashMap<Var, Ast> inputModelMapBase = new HashMap<>();
    //private HashMap<Var, Ast> outputModelMapBase = new HashMap<>(); // i am commenting this out since it is a subset of the input that is passed to the kstep

    private HashMap<Var, Ast> inputModelMapKStep = new HashMap<>();
    private HashMap<Var, Ast> outputModelMapKStep = new HashMap<>();

    private ContractInput contractInput;

    public Exp generateCounterExample(ContractInput contractInput, Model model) throws IOException, DiscoveryException {
        this.contractInput = contractInput;
        this.model = model;

        if (inputModelMapBase.size() > 0) { //reset of the map synthesis from previous step
            assert (inputModelMapKStep.size() > 0
                    && outputModelMapKStep.size() > 0);
            clearModelMapValues();
        } else {
            assert (inputModelMapKStep.size() == 0
                    && outputModelMapKStep.size() == 0);
            populateMapKeys();
        }

        populateMapValues();
        return createCounterExampleAssertion();
    }

    private Exp createCounterExampleAssertion() {
        ArrayList<Exp> antecedent = generatTestValues(inputModelMapBase);
        antecedent.addAll(generatTestValues(inputModelMapKStep));
        //antecedent.add(new NExp(new Operator(EQ)), )

        Exp antecedentExp = new NExp(new Operator(AND), antecedent);

        ArrayList<Exp> consequent = generatTestValues(outputModelMapKStep);

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
            updateMap(outputModelMapKStep, decl.getName().toString(), expValue);
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
                Var var = findInModel(line.replaceAll(" ","") + "$r0");
                inputModelMapBase.put(var, null);
                var = findInModel(line.replaceAll(" ","") + "$r1");
                inputModelMapKStep.put(var, null);
            }
        }
        /**** state Input ******/
        try (BufferedReader br = new BufferedReader(new FileReader(contractInput.stateInVarFileName))) {
            for (String line; (line = br.readLine()) != null; ) {
                // process the line.
                Var var = findInModel(line + "$r0");
                inputModelMapBase.put(var, null);
            }
        }

        /****** populating output ******/
        try (BufferedReader br = new BufferedReader(new FileReader(contractInput.outVarFileName))) {
            for (String line; (line = br.readLine()) != null; ) {
                // process the line.
                Var var = findInModel(line + "$r0");
                inputModelMapKStep.put(var, null);

                var = findInModel(line + "$r1");
                outputModelMapKStep.put(var, null);
            }
        }
    }

    private void clearModelMapValues() {
        for (Map.Entry<Var, Ast> entry : inputModelMapBase.entrySet())
            entry.setValue(null);

        for (Map.Entry<Var, Ast> entry : inputModelMapKStep.entrySet())
            entry.setValue(null);

        for (Map.Entry<Var, Ast> entry : outputModelMapKStep.entrySet())
            entry.setValue(null);
    }
}
