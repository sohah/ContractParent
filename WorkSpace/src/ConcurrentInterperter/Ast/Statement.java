package ConcurrentInterperter.Ast;

import ConcurrentInterperter.StatementVisitor;

public interface Statement extends Ast{
    public Statement accept(StatementVisitor v);
}
