package ConcurrentInterperter;

import ConcurrentInterperter.Ast.Expressions.*;
import ConcurrentInterperter.Programs.Locals;

public class EvalExpr implements ExpressionVisitor {
    private final Locals locals;

    public EvalExpr(Locals locals) {
        this.locals = locals;
    }

    @Override
    public Expr visit(BinaryExp e) {
        Expr v1 = e.e1.accept(this);
        Expr v2 = e.e2.accept(this);
        switch (e.op) {
            case PLUS:
                assert v1 instanceof IntVal && v2 instanceof IntVal;
                return new IntVal(((IntVal) v1).val + ((IntVal) v2).val);
            case MINUS:
                assert v1 instanceof IntVal && v2 instanceof IntVal;
                return new IntVal(((IntVal) v1).val - ((IntVal) v2).val);
            case MULT:
                assert v1 instanceof IntVal && v2 instanceof IntVal;
                return new IntVal(((IntVal) v1).val * ((IntVal) v2).val);
            case DIV:
                assert v1 instanceof IntVal && v2 instanceof IntVal;
                return new IntVal(((IntVal) v1).val * ((IntVal) v2).val);
            case GREATERTH:
                assert v1 instanceof IntVal && v2 instanceof IntVal;
                return new BoolVal(((IntVal) v1).val > ((IntVal) v2).val);
            case LESSTH:
                assert v1 instanceof IntVal && v2 instanceof IntVal;
                return new BoolVal(((IntVal) v1).val < ((IntVal) v2).val);
            case EQ:
                if (v1 instanceof IntVal && v2 instanceof IntVal) {
                    return new BoolVal(((IntVal) v1).val == ((IntVal) v2).val);
                } else if (v1 instanceof BoolVal && v2 instanceof BoolVal) {
                    return new BoolVal(((BoolVal) v1).val == ((BoolVal) v2).val);
                }
            case AND:
                assert v1 instanceof BoolVal && v2 instanceof BoolVal;
                return new BoolVal(((BoolVal) v1).val && ((BoolVal) v2).val);
            case OR:
                assert v1 instanceof BoolVal && v2 instanceof BoolVal;
                return new BoolVal(((BoolVal) v1).val || ((BoolVal) v2).val);
        }
        System.out.println("problem happened during evaluation of binary expression");
        assert false;
        return null;
    }

    @Override
    public Expr visit(BoolVal v) {
        return v;
    }

    @Override
    public Expr visit(UnaryExp e) {
        Expr v = e.accept(this);
        switch (e.op) {
            case NOT:
                assert v instanceof BoolVal;
                return new BoolVal(!((BoolVal) v).val);
            case NEG:
                assert v instanceof IntVal;
                return new IntVal(((IntVal) v).val * -1);
        }
        System.out.println("problem happened during evaluation of unary expression");
        assert false;
        return null;
    }

    @Override
    public Expr visit(IntVal v) {
        return v;
    }

    @Override
    public Expr visit(Var x) {
        return locals.lookup(x);
    }
}
