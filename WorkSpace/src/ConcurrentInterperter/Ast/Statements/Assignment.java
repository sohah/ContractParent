package ConcurrentInterperter.Ast.Statements;

import ConcurrentInterperter.Ast.Expressions.Expr;
import ConcurrentInterperter.Ast.Expressions.Var;
import ConcurrentInterperter.Ast.Statement;
import ConcurrentInterperter.StatementVisitor;

public class Assignment implements Statement {
    public Var var;
    public Expr e;

    public Assignment(Var var, Expr e) {
        this.var = var;
        this.e = e;
    }

    public Statement accept(StatementVisitor v){
        return  v.visit(this);
    }
}
