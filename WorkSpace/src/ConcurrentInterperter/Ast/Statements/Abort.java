package ConcurrentInterperter.Ast.Statements;

import ConcurrentInterperter.Ast.Statement;
import ConcurrentInterperter.StatementVisitor;

//general abort statement to indicate end of the program
public class Abort implements Statement {

    public static Abort abortStmt = new Abort();

    @Override
    public Statement accept(StatementVisitor v) {
        assert false;
        return null;
    }
}
