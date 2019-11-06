package ConcurrentInterperter.Ast.Expressions;

import ConcurrentInterperter.Ast.Ast;
import ConcurrentInterperter.ExpressionVisitor;

public interface Expr extends Ast {

    public Expr accept(ExpressionVisitor visitor);
}
