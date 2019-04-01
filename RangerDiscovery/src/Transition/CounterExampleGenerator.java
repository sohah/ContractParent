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
        if(!funcDecl.getName().toString().contains("contract")){
            Expr interpretation = model.getConstInterp(funcDecl);

            if (interpretation.isInt())
                expVar = new IntVar(funcDecl.getName().toString());
            else if (interpretation.isBool())
                expVar = new BoolVar(funcDecl.getName().toString());
            else throw new DiscoveryException("unexpected interpretation");

            return expVar;
        }
        else
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

    protected static void catchInputOutputProblem(){
        System.out.println("input or output of a contract cannot be found in model!");
        assert false;
    }

}
