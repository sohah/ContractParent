package ast.visitors;

import ast.def.*;

public interface AstVisitor<T> {

    T visit(IntConst numExp);

    T visit(Operator operation);

    T visit(IntVar intVar);

    T visit(Hole hole);

    T visit(BinaryExp binaryExp);

    T visit(UnaryExp unaryExp);

    T visit(IfThenElseExp ifThenElseExp);
}

