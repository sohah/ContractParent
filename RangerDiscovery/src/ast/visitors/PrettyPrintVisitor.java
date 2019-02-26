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
    public Object visit(BinaryExp binaryExp) {
        return null;
    }

    @Override
    public Object visit(UnaryExp unaryExp) {
        return null;
    }

    @Override
    public Object visit(IfThenElseExp ifThenElseExp) {
        return null;
    }

    @Override
    public Object visit(BoolConst boolConst) {
        return null;
    }
}
