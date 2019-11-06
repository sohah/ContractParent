package ConcurrentInterperter.Programs;

import ConcurrentInterperter.Ast.Statement;

public abstract class Program {
    public Locals locals;
    public Statement statement;

    public Program(Locals locals, Statement statement){
        this.locals = locals;
        this.statement = statement;
    }
}
