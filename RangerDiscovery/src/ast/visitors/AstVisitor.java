package ast.visitors;

import ast.def.*;

public interface AstVisitor<T> {

    T visit(IntConst numExp);

    T visit(Operator operation);

    T visit(IntVar intVar);

    T visit(Hole hole);

    T visit(BoolConst boolConst);


    T visit(BoolVar boolVar);

    T visit(Var var) throws DiscoveryException;

    T visit(NExp nExp) throws DiscoveryException;
}

