package ConcurrentInterperter.Ast.Statements;

import ConcurrentInterperter.Ast.Statement;

public class Composition implements Statement {
    Statement s1;
    Statement s2;

    public Composition(Statement s1, Statement s2) {
        this.s1 = s1;
        this.s2 = s2;
    }
}
