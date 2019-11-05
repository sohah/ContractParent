package ConcurrentInterperter.Programs;

import ConcurrentInterperter.Ast.Statement;

public abstract class Program {
    Context locals;
    Statement statement;

    public Program(Context locals, Statement statement){
        this.locals = locals;
        this.statement = statement;
    }
}
