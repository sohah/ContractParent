package ast.visitors;

import ast.def.*;

public class PrettyPrintVisitor implements AstVisitor{
    @Override
    public Object visit(IntConst numExp) {
        return null;
    }

    @Override
    public Object visit(Operator operation) {
        return null;
    }

    @Override
    public Object visit(IntVar intVar) {
        return null;
    }

    @Override
    public Object visit(Hole hole) {
        return null;
    }

    @Override
    public Object visit(BoolConst boolConst) {
        return null;
    }

    @Override
    public Object visit(BoolVar boolVar) {
        return null;
    }

    @Override
    public Object visit(Var var) {
        return null;
    }

    @Override
    public Object visit(NExp nExp) {
        return null;
    }
}
