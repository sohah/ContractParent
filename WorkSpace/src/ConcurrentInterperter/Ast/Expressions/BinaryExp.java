package ConcurrentInterperter.Ast.Expressions;

import ConcurrentInterperter.ExpressionVisitor;

public class BinaryExp implements Expr{
    public Expr e1;
    public Expr e2;
    public BinaryOp op;

    public BinaryExp(Expr e1, Expr e2, BinaryOp op){
        this.e1 = e1;
        this.e2 = e2;
        this.op = op;
    }

    public Expr accept(ExpressionVisitor v){
        return v.visit(this);
    }
}
