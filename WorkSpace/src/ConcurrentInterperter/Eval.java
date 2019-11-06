package ConcurrentInterperter;

import ConcurrentInterperter.Ast.Expressions.BoolVal;
import ConcurrentInterperter.Ast.Expressions.Expr;
import ConcurrentInterperter.Ast.Expressions.Value;
import ConcurrentInterperter.Ast.Statements.Skip;
import ConcurrentInterperter.Ast.Statement;
import ConcurrentInterperter.Ast.Statements.Assignment;
import ConcurrentInterperter.Ast.Statements.Composition;
import ConcurrentInterperter.Ast.Statements.IfThenElse;
import ConcurrentInterperter.Programs.Locals;
import ConcurrentInterperter.Programs.Program;
import javafx.util.Pair;

import static ConcurrentInterperter.Ast.Statements.Skip.skip;
import static ConcurrentInterperter.Ast.Statements.Abort.abortStmt;


// this evaluator evaluates steps in statement, not small step of expressions.
public class Eval implements StatementVisitor {


    public Locals locals;
    private ExpressionVisitor exprVisitor;

    public Eval(Locals locals) {
        this.locals = locals;
        exprVisitor = new EvalExpr(locals);
    }

    @Override
    public Statement visit(Assignment s) {
        Expr v = s.e.accept(exprVisitor);
        assert v instanceof Value;

        locals.put(s.var, (Value) v);

        return skip;
    }

    @Override
    public Statement visit(Composition s) {
        Statement s1 = s.s1.accept(this);
        if (s1 instanceof Skip)
            return s.s2;
        else return new Composition(s1, s.s2);

    }

    @Override
    public Statement visit(IfThenElse s) {
        Expr v = s.e.accept(exprVisitor);
        assert v instanceof BoolVal;

        if(((BoolVal) v).val)
            return s.s1;
        else
            return s.s2;
    }


    //always returns a statement and a context, if the program has terminated it returns abortStmt
    public static Pair<Locals, Statement> execute(Program pgm) {
        if (pgm.statement.equals(abortStmt)) {
            System.out.println("cannot evaluate an already aborted/evaluated program. Returning");
            assert false;
            return null;
        }
        if (pgm.statement.equals(skip)) {
            System.out.println("cannot evaluate a skip program. Returning");
            assert false;
            return null;
        }

        Eval contextVisitor = new Eval(pgm.locals);

        Statement newStatement = pgm.statement.accept(contextVisitor);

        if (newStatement instanceof Skip)
            newStatement = abortStmt;

        return new Pair<>(contextVisitor.locals, newStatement);
    }
}
