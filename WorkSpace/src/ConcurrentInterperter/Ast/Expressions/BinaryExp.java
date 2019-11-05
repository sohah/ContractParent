package ConcurrentInterperter.Ast.Expressions;

public class BinaryExp implements Expr{
    Expr e1;
    Expr e2;
    BinaryOp op;

    public BinaryExp(Expr e1, Expr e2, BinaryOp op){
        this.e1 = e1;
        this.e2 = e2;
        this.op = op;
    }
}
