package Transition;

import ast.def.*;
import com.microsoft.z3.Expr;
import com.microsoft.z3.FuncDecl;
import com.microsoft.z3.Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static Transition.TransitionT.transitionT;
import static ast.def.BoolConst.FALSE;
import static ast.def.BoolConst.TRUE;
import static ast.def.Operator.OperatorKind.AND;
import static ast.def.Operator.OperatorKind.EQ;
import static ast.def.Operator.OperatorKind.IMPLIES;

public class CounterExampleGenerator {

    public static CounterExampleGenerator counterExampleGenerator = new CounterExampleGenerator();

    private HashMap<Var, Ast> inputModelMapBase = new HashMap<>();
    private HashMap<Var, Ast> outputModelMapBase = new HashMap<>();

    private HashMap<Var, Ast> inputModelMapKStep = new HashMap<>();
    private HashMap<Var, Ast> outputModelMapKStep = new HashMap<>();

    private ContractInput contractInput;
    private Model model;

    public Exp generateCounterExample(ContractInput contractInput, Model model) throws IOException, DiscoveryException {
        this.contractInput = contractInput;
        this.model = model;

        if (inputModelMapBase.size() > 0) { //reset of the map synthesis from previous step
            assert (outputModelMapBase.size() > 0
                    && inputModelMapKStep.size() > 0
                    && outputModelMapKStep.size() > 0);
            clearModelMapValues();
        } else {
            assert (outputModelMapBase.size() == 0
                    && inputModelMapKStep.size() == 0
                    && outputModelMapKStep.size() == 0);
            populateMapKeys();
        }

        populateMapValues();

        return createCounterExampleAssertion();
    }

    private Exp createCounterExampleAssertion() {
        ArrayList<Exp> antecedent = generatTestValues(inputModelMapBase);
        antecedent.addAll(generatTestValues(outputModelMapBase));
        antecedent.addAll(generatTestValues(inputModelMapKStep));

        Exp antecedentExp = new NExp(new Operator(AND), antecedent);

        ArrayList<Exp> consequent = generatTestValues(outputModelMapKStep);

        Exp consequentExp = new NExp(new Operator(AND), consequent);

        ArrayList<Exp> implicationOperands = new ArrayList<Exp>();
        implicationOperands.add(antecedentExp);
        implicationOperands.add(consequentExp);

        return new NExp(new Operator(IMPLIES), implicationOperands);
    }

    private ArrayList<Exp> generatTestValues(HashMap<Var, Ast> modelMap) {
        ArrayList<Exp> assertions = new ArrayList<>();
        for(Map.Entry<Var, Ast> entry: modelMap.entrySet()){
            ArrayList<Exp> operands = new ArrayList();
            operands.add(entry.getKey());

            assert(entry.getValue() instanceof Exp);

            operands.add((Exp) entry.getValue());
            assertions.add(new NExp(new Operator(EQ), operands));
        }
        return assertions;
    }

    /**
     * has the side effect of populating values to the 4 maps in this class with the right test case values.
     */
    private void populateMapValues() throws DiscoveryException {
        FuncDecl[] constDecl = model.getConstDecls();


        for (FuncDecl decl : constDecl) {
            Exp expValue;
            Expr interpretation = model.getConstInterp(decl);
            if (interpretation.isInt())
                expValue = new IntConst(Integer.valueOf(interpretation.toString()));
                else if (interpretation.isTrue())
                expValue = TRUE;
            else if (interpretation.isFalse())
                expValue = FALSE;
            else throw new DiscoveryException("unexpected interpretation");

            boolean update1 = updateMap(inputModelMapBase, decl.getName().toString(), expValue);
            boolean update2 = updateMap(outputModelMapBase, decl.getName().toString(), expValue);
            boolean update3 = updateMap(inputModelMapKStep, decl.getName().toString(), expValue);
            boolean update4 = updateMap(outputModelMapBase, decl.getName().toString(), expValue);

            assert(update1 ^ update2 ^ update3 ^ update4);
        }
    }

    private boolean updateMap(HashMap<Var, Ast> map, String varName, Exp expValue) {
        boolean updateOccured = false;

        for(Map.Entry<Var, Ast> entry: map.entrySet()){
            if(entry.getKey().toString().equals(varName)){
                entry.setValue(expValue);
                updateOccured = true;
            }
        }
        return updateOccured;
    }

    /**
     * has the side effect of populating inputModelMap and outputModelMap.
     */
    private void populateMapKeys() throws IOException {

        /****** populating input ******/
        /**** free Input ********/
        try (BufferedReader br = new BufferedReader(new FileReader(contractInput.freeInVarFileName))) {
            for (String line; (line = br.readLine()) != null; ) {
                // process the line.
                inputModelMapBase.put(transitionT.tContext.get(line + "$r0"), null);
                inputModelMapKStep.put(transitionT.tContext.get(line + "$r1"), null);
            }
        }
        /**** state Input ******/
        try (BufferedReader br = new BufferedReader(new FileReader(contractInput.stateInVarFileName))) {
            for (String line; (line = br.readLine()) != null; ) {
                // process the line.
                inputModelMapBase.put(transitionT.tContext.get(line + "$r0"), null);
                inputModelMapKStep.put(transitionT.tContext.get(line + "$r0"), null);
            }
        }

        /****** populating output ******/
        try (BufferedReader br = new BufferedReader(new FileReader(contractInput.outVarFileName))) {
            for (String line; (line = br.readLine()) != null; ) {
                // process the line.
                outputModelMapBase.put(transitionT.tContext.get(line + "$r0"), null);
                outputModelMapKStep.put(transitionT.tContext.get(line + "$r1"), null);
            }
        }
    }


    private void clearModelMapValues() {
        for (Map.Entry<Var, Ast> entry : inputModelMapBase.entrySet())
            entry.setValue(null);

        for (Map.Entry<Var, Ast> entry : outputModelMapBase.entrySet())
            entry.setValue(null);

        for (Map.Entry<Var, Ast> entry : inputModelMapKStep.entrySet())
            entry.setValue(null);

        for (Map.Entry<Var, Ast> entry : outputModelMapKStep.entrySet())
            entry.setValue(null);
    }
}
