package ConcurrentInterperter.Programs;

import ConcurrentInterperter.Ast.Expressions.IntVal;
import ConcurrentInterperter.Ast.Expressions.Type;
import ConcurrentInterperter.Ast.Expressions.Var;
import ConcurrentInterperter.Ast.Statement;
import ConcurrentInterperter.Ast.Statements.Assignment;
import ConcurrentInterperter.Ast.Statements.Composition;
import ConcurrentInterperter.Ast.Statements.IfThenElse;

public class Program2 extends Program {


    public Program2(Context locals, Statement statement) {
        super(locals, statement);
    }


    public static Program create() {

        //a = 10; b = 20 ; if(c) then d = a else d = b

        Var a = new Var("a", Type.INT);
        Var b = new Var("b", Type.INT);
        Var c = new Var("c", Type.BOOL);
        Var d = new Var("d", Type.INT);


        Assignment aEquals10 = new Assignment(a, new IntVal(10));
        Assignment bEquals20 = new Assignment(b, new IntVal(20));

        Assignment dEqualsA = new Assignment(d, a);
        Assignment dEqualsB = new Assignment(d, b);

        IfThenElse ifStmt = new IfThenElse(c, dEqualsA, dEqualsB);

        Composition composition = new Composition(aEquals10, new Composition(bEquals20, ifStmt));

        return new Program2(new Context(), composition);
    }
}
