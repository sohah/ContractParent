package ConcurrentInterperter.Ast.Statements;

import ConcurrentInterperter.Ast.Expressions.Expr;
import ConcurrentInterperter.Ast.Statement;

public class IfThenElse implements Statement {
    Expr e;
    Statement s1;
    Statement s2;

    public IfThenElse(Expr e, Statement s1, Statement s2) {
        this.e = e;
        this.s1 = s1;
        this.s2 = s2;
    }
}
