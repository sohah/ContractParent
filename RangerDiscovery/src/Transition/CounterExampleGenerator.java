package Transition;

import ast.def.*;
import com.microsoft.z3.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static ast.def.BoolConst.FALSE;
import static ast.def.BoolConst.TRUE;
import static ast.def.Operator.OperatorKind.EQ;

public abstract class CounterExampleGenerator {
    protected Model model;


    public abstract Exp generateCounterExample(ContractInput contractInput, Model model) throws IOException, DiscoveryException;

    protected ArrayList<Exp> generatTestValues(HashMap<Var, Ast> modelMap) {
        ArrayList<Exp> assertions = new ArrayList<>();
        for (Map.Entry<Var, Ast> entry : modelMap.entrySet()) {
            if (entry.getValue() != null) {
                ArrayList<Exp> operands = new ArrayList();
                operands.add(entry.getKey());

                assert (entry.getValue() instanceof Exp);

                operands.add((Exp) entry.getValue());
                assertions.add(new NExp(new Operator(EQ), operands));
            }
        }
        return assertions;
    }


    protected Exp translateToAst(Expr interpretation) throws DiscoveryException {
        Exp expValue;

        if (interpretation.isInt())
            expValue = new IntConst(Integer.valueOf(interpretation.toString()));
        else if (interpretation.isTrue())
            expValue = TRUE;
        else if (interpretation.isFalse())
            expValue = FALSE;
        else throw new DiscoveryException("unexpected interpretation");

        return expValue;
    }

    protected Var translateToAstVar(FuncDecl funcDecl) throws DiscoveryException {

        Var expVar;
        //if ((funcDecl.getName().toString().endsWith("$r0")) || (funcDecl.getName().toString().endsWith("$r1"))) {
        if (!funcDecl.getName().toString().contains("contract")) {
            Expr interpretation = model.getConstInterp(funcDecl);

            if (interpretation.isInt())
                expVar = new IntVar(funcDecl.getName().toString());
            else if (interpretation.isBool())
                expVar = new BoolVar(funcDecl.getName().toString());
            else throw new DiscoveryException("unexpected interpretation");

            return expVar;
        } else
            return null;
    }


    /**
     * matches a name of a var to its type in the model and then later translate it to the appropriate type in our AST
     *
     * @param s
     * @return
     */
    protected Var findInModel(String s) throws DiscoveryException {
        s = s.replaceAll("\\s+", "");
        Var var;
        FuncDecl[] constDecl = model.getConstDecls();
        for (FuncDecl funcDecl : constDecl) {
            if (funcDecl.getName().toString().equals(s)) {
                if (funcDecl.getRange() instanceof IntSort) {
                    var = new IntVar(s);
                    return var;
                }
                if (funcDecl.getRange() instanceof BoolSort) {
                    var = new BoolVar(s);
                    return var;
                } else throw new DiscoveryException("unexpected interpretation");
            }
        }
        return null;
    }

    protected static void catchInputOutputProblem() {
        System.out.println("input or output of a contract cannot be found in model!");
        assert false;
    }

    /**
     * returns the counter example in the form of antecedent => consequent.
     *
     * @param counterExampleAssertions
     * @return
     */
    protected String counterExampleImplicationAssertionsString(ArrayList<Exp> counterExampleAssertions) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Exp counterExample : counterExampleAssertions) {
            stringBuilder.append("(assert ");
            stringBuilder.append(counterExample.toString());
            stringBuilder.append(")\n");
        }
        return stringBuilder.toString();
    }

    /**
     * returns the counter example in the form of antecedent => consequent but also asserts that at least one of the antecedents must be true.
     *
     * @param counterExampleAssertions
     * @return
     */
    protected String counterExampleDivideAssertionsToString(ArrayList<Exp> counterExampleAssertions) {
        StringBuilder stringBuilder = new StringBuilder();

        //creating the definitions for all expected antecedents.
        for (int i = 0; i < counterExampleAssertions.size(); i++) {
            stringBuilder.append("(declare-fun antecedent_").append(i).append(" () bool)\n");
        }

        if (counterExampleAssertions.size() > 1) {
            stringBuilder.append("(assert (or ");
            for (int i = 0; i < counterExampleAssertions.size(); i++) {
                stringBuilder.append(" antecedent_").append(i);
            }
            stringBuilder.append("))");
        }
        else
            stringBuilder.append("(assert antecedent_0)");

        stringBuilder.append("\n");

        //creating the definition of every antecedent
        for (int i = 0; i < counterExampleAssertions.size(); i++) {
            assert (counterExampleAssertions.get(i) instanceof NExp);
            Exp antecedentExp = ((NExp) counterExampleAssertions.get(i)).operands.get(0);
            stringBuilder.append("(assert (= antecedent_").append(i).append(" ").append(antecedentExp.toString()).append("))\n");
        }


        //creating the implication for every testcase
        for (int i = 0; i < counterExampleAssertions.size(); i++) {
            assert (counterExampleAssertions.get(i) instanceof NExp);
            Exp consequent = ((NExp) counterExampleAssertions.get(i)).operands.get(1);
            stringBuilder.append("(assert (=> antecedent_").append(i).append(" ").append(consequent).append("))\n");
        }
        return stringBuilder.toString();
    }
}
