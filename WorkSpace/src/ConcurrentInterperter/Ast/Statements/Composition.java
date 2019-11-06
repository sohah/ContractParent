package ConcurrentInterperter.Ast.Statements;

import ConcurrentInterperter.Ast.Statement;
import ConcurrentInterperter.StatementVisitor;

public class Composition implements Statement {
    public Statement s1;
    public Statement s2;

    public Composition(Statement s1, Statement s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public Statement accept(StatementVisitor v){
        return  v.visit(this);
    }
}
