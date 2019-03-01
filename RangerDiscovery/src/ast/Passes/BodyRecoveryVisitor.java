package ast.Passes;

import ast.def.*;
import ast.parser.SMTLIBv2BaseVisitor;
import ast.parser.SMTLIBv2Parser;

import java.util.ArrayList;

import static Transition.TransitionT.transitionT;
import static ast.def.Operator.OperatorKind.EQ;


public class BodyRecoveryVisitor extends SMTLIBv2BaseVisitor<Exp> {

    @Override
    public Exp visitTerm(SMTLIBv2Parser.TermContext ctx) {
        Operator operator;
        try {
            operator = new Operator(ctx.getChild(1).getText());
        } catch (DiscoveryException e) {
            System.out.println("problem translating to ast: "+ e.getMessage());
            return null;
        }
        ArrayList<Exp> operands = new ArrayList<>();
        for (int i = 2; i < ctx.getChildCount() - 1; i++) { //to exclude opening and begining brackets as well as
            operands.add(ctx.getChild(i).accept(this));
        }


        return new NExp(operator, operands);

    }
    
}
