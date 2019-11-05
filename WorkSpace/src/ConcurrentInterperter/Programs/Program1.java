package ConcurrentInterperter.Programs;

import ConcurrentInterperter.Ast.Expressions.IntVal;
import ConcurrentInterperter.Ast.Expressions.Type;
import ConcurrentInterperter.Ast.Expressions.Var;
import ConcurrentInterperter.Ast.Statement;
import ConcurrentInterperter.Ast.Statements.Assignment;
import ConcurrentInterperter.Ast.Statements.Composition;
import ConcurrentInterperter.Ast.Statements.IfThenElse;

public class Program1 extends Program {


    public Program1(Context locals, Statement statement) {
        super(locals, statement);
    }


    public static Program create(){

        //z = 3 ; if(x) then y = z else y = 2

        Var z = new Var("z", Type.INT);
        Var x = new Var("x", Type.BOOL);
        Var y = new Var("y", Type.INT);

        Assignment zEquals3 = new Assignment(z, new IntVal(3));

        Assignment yEqualsZ = new Assignment(y, z);
        Assignment yEquals2 = new Assignment(y, new IntVal(2));

        IfThenElse ifStmt = new IfThenElse(x, yEqualsZ, yEquals2);

        Composition composition = new Composition(zEquals3, ifStmt);

        return new Program1(new Context(), composition);
    }
}
