package ConcurrentInterperter.Ast.Statements;

import ConcurrentInterperter.Ast.Ast;
import ConcurrentInterperter.Ast.Statement;
import ConcurrentInterperter.StatementVisitor;

//indicates that a statement has been executed.
public class Skip implements Statement {
    public static Skip skip = new Skip();

    @Override
    public Statement accept(StatementVisitor v) {
        assert false;
        return null;
    }
}
