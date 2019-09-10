package ast.Passes;

import ast.def.*;
import ast.visitors.AstVisitor;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveHolesVisitor implements AstVisitor<Ast> {

    public HashMap<Hole, Ast> instantiatedHoles = new HashMap<>();

    public RemoveHolesVisitor(HashMap<Hole, Ast> instantiatedHoles) {
        this.instantiatedHoles = instantiatedHoles;

    }

    @Override
    public Ast visit(IntConst numExp) {
        return new IntConst(numExp.value);
    }

    @Override
    public Ast visit(Operator operation) {
        return new Operator(operation.opName);
    }

    @Override
    public Ast visit(IntVar intVar) {
        return new IntVar(intVar.name);
    }

    @Override
    public Ast visit(Hole hole) {
        Ast value = instantiatedHoles.get(hole);
        /*Ast var = Utility.getKeyByValue(ToConstantHoleVisitor.assignedVarToHole, hole);

        if (var == null) {
            System.out.println("var for a hole cannot be null!");
            assert false;
        }
*/
        if (value == null)
            return hole.orignalAst;
        else {
            System.out.println("        (" + hole.toString() + "," + hole.orignalAst.toString() + ")  =  " + value );
            return value;
        }
    }

    @Override
    public Ast visit(BoolConst boolConst) {
        return boolConst;
    }

    @Override
    public Ast visit(BoolVar boolVar) {
        return new BoolVar(boolVar.name);
    }

    @Override
    public Ast visit(Var var) throws DiscoveryException {
        System.out.println("visiting a var super type, something went wrong.");
        assert false; // I shouldn't visit the super type
        return null;
    }

    @Override
    public Ast visit(NExp nExp) throws DiscoveryException {

        Ast newOperator = nExp.operator.accept(this);
        ArrayList<Exp> newOperands = new ArrayList<>();

        for (Ast operand : nExp.operands) {
            newOperands.add((Exp) operand.accept(this));
        }
        return new NExp((Operator) newOperator, newOperands);
    }

    @Override
    public Ast visit(LetExp letExp) throws DiscoveryException {
        Ast newOperator = letExp.operator.accept(this);
        ArrayList<Exp> newOperands = new ArrayList<>();

        for (Ast operand : letExp.operands) {
            newOperands.add((Exp) operand.accept(this));
        }
        return new LetExp((Operator) newOperator, letExp.varBindings, newOperands);
    }

    @Override
    public Ast visit(VarBinding varBinding) {
        return new VarBinding(varBinding.var, varBinding.exp);
    }


    public static Ast execute(HashMap<Hole, Ast> instantiatedHolesMap, Ast t) throws DiscoveryException {
        System.out.println("repair for (hole, original value) = new value:");
        RemoveHolesVisitor removeHolesVisitor = new RemoveHolesVisitor(instantiatedHolesMap);
        Ast instantiatedTPrime = t.accept(removeHolesVisitor);
        return instantiatedTPrime;
    }

}
