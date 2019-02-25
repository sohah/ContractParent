package ast.visitors;

import ast.def.IntVar;
import ast.def.Operator;

public interface AstVisitor<T> {

    T visit(IntVar numExp);

    T visit(Operator operation);
}
