package ast.Passes;

import ast.def.*;
import ast.visitors.AstVisitor;

public class ToConstantHoleVisitor implements AstVisitor<Ast>{
    @Override
    public Exp visit(IntConst numExp) {
        Hole hole = HoleGenerator.generateConstantHole(numExp);

        return hole;
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
        System.out.println("visting hole in ToConstantHoleVisitor, that shouldnt' happent!");
        assert false;
        return null;
    }

    @Override
    public Ast visit(BoolConst boolConst) {
        Hole hole = HoleGenerator.generateConstantHole(boolConst);
        return hole;
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
    public Ast visit(NExp nExp) {
        return new NExp(nExp.operator, nExp.operands);
    }
}
