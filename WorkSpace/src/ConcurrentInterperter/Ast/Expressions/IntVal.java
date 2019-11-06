package ConcurrentInterperter.Ast.Expressions;

import ConcurrentInterperter.ExpressionVisitor;

public class IntVal extends Value{
    public int val;

    public IntVal(int val) {
        super(val, Type.INT);
    }
    public Expr accept(ExpressionVisitor v){
        return v.visit(this);
    }
}
