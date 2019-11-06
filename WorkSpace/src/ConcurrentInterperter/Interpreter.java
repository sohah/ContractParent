package ConcurrentInterperter;


// evaluates two perhaps parallel programs, with a specified scheduler.

import ConcurrentInterperter.Ast.Statement;
import ConcurrentInterperter.Ast.Statements.Abort;
import ConcurrentInterperter.Programs.Locals;
import ConcurrentInterperter.Programs.Program;
import ConcurrentInterperter.Programs.Program1;
import javafx.util.Pair;

public class Interpreter {

    public static void execute() {
        Program pgm1 = Program1.create();

        System.out.println("program before execution");

        while (!(pgm1.statement instanceof Abort)) {
            Pair<Locals, Statement> context = Eval.execute(pgm1);

            System.out.println("program after executing a simple statement step");
            pgm1.locals = context.getKey();
            pgm1.statement = context.getValue();
        }

        System.out.println("program execution is finished!");
    }

}
