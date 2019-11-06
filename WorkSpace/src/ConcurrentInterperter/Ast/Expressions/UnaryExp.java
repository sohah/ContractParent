package ConcurrentInterperter.Ast.Expressions;

import ConcurrentInterperter.ExpressionVisitor;

public class UnaryExp implements Expr {
    public Expr e;
    public UnaryOp op;

    public UnaryExp(Expr e, UnaryOp op) {
        this.e = e;
        this.op = op;
    }

    public Expr accept(ExpressionVisitor v){
        return v.visit(this);
    }
}
