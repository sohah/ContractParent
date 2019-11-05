package ConcurrentInterperter.Ast.Expressions;

public class UnaryExp implements Expr {
    Expr e;
    UnaryOp op;

    public UnaryExp(Expr e, UnaryOp op) {
        this.e = e;
        this.op = op;
    }
}
