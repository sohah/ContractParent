package ConcurrentInterperter.Ast.Statements;

import ConcurrentInterperter.Ast.Expressions.Expr;
import ConcurrentInterperter.Ast.Expressions.Var;
import ConcurrentInterperter.Ast.Statement;

public class Assignment implements Statement {
    Var var;
    Expr e;

    public Assignment(Var var, Expr e) {
        this.var = var;
        this.e = e;
    }
}
