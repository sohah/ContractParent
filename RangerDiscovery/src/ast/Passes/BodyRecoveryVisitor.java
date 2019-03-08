package ast.Passes;

import ast.def.*;
import ast.parser.SMTLIBv2BaseVisitor;
import ast.parser.SMTLIBv2Parser;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static Transition.TransitionT.transitionT;
import static ast.def.BoolConst.FALSE;
import static ast.def.BoolConst.TRUE;


public class BodyRecoveryVisitor extends SMTLIBv2BaseVisitor<Exp> {


    private final LinkedHashMap<String, Var> tContext;

    public BodyRecoveryVisitor(LinkedHashMap<String, Var> tContext) {
        super();
        this.tContext = tContext;
    }

    @Override
    public Exp visitTerm(SMTLIBv2Parser.TermContext ctx) {
        if (ctx.getChildCount() >= 4) { // 4 because at least not operator will require the term to have 4 children
            Operator operator;
            try {
                operator = new Operator(ctx.getChild(1).getText());
            } catch (DiscoveryException e) {
                System.out.println("problem translating to ast: " + e.getMessage());
                assert false;
                return null;
            }
            ArrayList<Exp> operands = new ArrayList<>();
            for (int i = 2; i < ctx.getChildCount() - 1; i++) { //to exclude opening and begining brackets as well as
                operands.add(ctx.getChild(i).accept(this));
            }

            return new NExp(operator, operands);
        } else
            return super.visitTerm(ctx);
    }

    @Override
    public Exp visitSimpleSymbol(SMTLIBv2Parser.SimpleSymbolContext ctx) {
        if (ctx.getChild(0) instanceof SMTLIBv2Parser.PredefSymbolContext)
            return super.visitSimpleSymbol(ctx);
        else {
            Var var = tContext.get(ctx.getText());
            if ((var == null) && !(ctx.getText().equals("T")) & (!aTypeOrOp(ctx.getText()))) {
                System.out.println("cannot find variable in context!");
                return null;
            }
            return var;
        }
    }

    private boolean aTypeOrOp(String text) {
        if (text.equals("Bool"))
            return true;
        else if (text.equals("Int"))
            return true;
        else if (text.equals("Float"))
            return true;
        return false;
    }

    @Override
    public Exp visitPredefSymbol(SMTLIBv2Parser.PredefSymbolContext ctx) {
        if (ctx.getText().equals("true"))
            return TRUE;
        else if (ctx.getText().equals("false"))
            return FALSE;
        else
            System.out.println("unexpected predefined symbol");

        assert (false);
        return null;
    }

    @Override
    public Exp visitNumeral(SMTLIBv2Parser.NumeralContext ctx) {
        return new IntConst(Integer.parseInt(ctx.getChild(0).getText()));
    }
}
