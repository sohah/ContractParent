package ConcurrentInterperter.Ast.Expressions;

public class IntVal extends Value{

    public IntVal(int val) {
        super(val, Type.INT);
    }
}
