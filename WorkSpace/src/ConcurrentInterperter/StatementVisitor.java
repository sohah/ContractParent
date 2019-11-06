package ConcurrentInterperter;

import ConcurrentInterperter.Ast.Statement;
import ConcurrentInterperter.Ast.Statements.Assignment;
import ConcurrentInterperter.Ast.Statements.Composition;
import ConcurrentInterperter.Ast.Statements.IfThenElse;

public interface StatementVisitor {

    public Statement visit(Assignment s);
    public Statement visit(Composition s);
    public Statement visit(IfThenElse s);
}
