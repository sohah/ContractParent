package ConcurrentInterperter.Ast.Statements;

import ConcurrentInterperter.Ast.Expressions.Expr;
import ConcurrentInterperter.Ast.Statement;
import ConcurrentInterperter.StatementVisitor;

public class IfThenElse implements Statement {
    public Expr e;
    public Statement s1;
    public Statement s2;

    public IfThenElse(Expr e, Statement s1, Statement s2) {
        this.e = e;
        this.s1 = s1;
        this.s2 = s2;
    }
    public Statement accept(StatementVisitor v){
        return  v.visit(this);
    }
}
