package ConcurrentInterperter.Ast.Expressions;

public class BoolVal extends Value{

    public BoolVal(boolean val) {
        super(val, Type.BOOL);
    }
}
