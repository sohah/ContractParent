package ConcurrentInterperter.Ast.Expressions;

import ConcurrentInterperter.ExpressionVisitor;

public class BoolVal extends Value{

    public boolean val;
    public BoolVal(boolean val) {
        super(val, Type.BOOL);
    }

    public Expr accept(ExpressionVisitor v){
        return v.visit(this);
    }
}
