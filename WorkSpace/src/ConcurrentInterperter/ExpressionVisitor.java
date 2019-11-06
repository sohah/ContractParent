package ConcurrentInterperter;

import ConcurrentInterperter.Ast.Expressions.*;
import ConcurrentInterperter.Ast.Statement;
import ConcurrentInterperter.Ast.Statements.Assignment;
import ConcurrentInterperter.Ast.Statements.Composition;
import ConcurrentInterperter.Ast.Statements.IfThenElse;

public interface ExpressionVisitor {

    public Expr visit(BinaryExp e);
    public Expr visit(BoolVal v);
    public Expr visit(UnaryExp e);
    public Expr visit(IntVal v);
    public Expr visit(Var x);
}
