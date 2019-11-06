package ConcurrentInterperter.Ast.Expressions;


import ConcurrentInterperter.ExpressionVisitor;

public abstract class Value implements Expr {
    public Object val;
    public Type type;

    public Value(Object val, Type type){
        this.val = val;
        this.type = type;
    }
}
