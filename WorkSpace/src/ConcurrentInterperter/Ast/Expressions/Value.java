package ConcurrentInterperter.Ast.Expressions;


public abstract class Value implements Expr {
    Object val;
    Type type;

    public Value(Object val, Type type){
        this.val = val;
        this.type = type;
    }
}
