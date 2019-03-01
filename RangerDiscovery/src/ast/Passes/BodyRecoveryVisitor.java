package ast.Passes;

import ast.def.*;
import ast.parser.SMTLIBv2BaseVisitor;
import ast.parser.SMTLIBv2Parser;

import java.util.ArrayList;

import static Transition.TransitionT.transitionT;
import static ast.def.BoolConst.FALSE;
import static ast.def.BoolConst.TRUE;
import static ast.def.Operator.OperatorKind.EQ;


public class BodyRecoveryVisitor extends SMTLIBv2BaseVisitor<Exp> {

    @Override
    public Exp visitTerm(SMTLIBv2Parser.TermContext ctx) {
        Operator operator;
        try {
            operator = new Operator(ctx.getChild(1).getText());
        } catch (DiscoveryException e) {
            System.out.println("problem translating to ast: " + e.getMessage());
            return null;
        }
        ArrayList<Exp> operands = new ArrayList<>();
        for (int i = 2; i < ctx.getChildCount() - 1; i++) { //to exclude opening and begining brackets as well as
            operands.add(ctx.getChild(i).accept(this));
        }


        return new NExp(operator, operands);

    }

    @Override
    public Exp visitSimpleSymbol(SMTLIBv2Parser.SimpleSymbolContext ctx) {
        Var var = transitionT.tContext.get(ctx.getText());
        if (var == null) {
            System.out.println("cannot find variable in context!");
            return null;
        }
        return var;
    }

    @Override
    public Exp visitPredefSymbol(SMTLIBv2Parser.PredefSymbolContext ctx) {
        if(ctx.getText().equals("true"))
            return TRUE;
        else if(ctx.getText().equals("false"))
            return FALSE;
        else
            System.out.println("unexpected predefined symbol");
            return null;
    }

    @Override
    public Exp visitNumeral(SMTLIBv2Parser.NumeralContext ctx) {
        return new IntConst(Integer.parseInt(ctx.getChild(0).getText())); }
}
