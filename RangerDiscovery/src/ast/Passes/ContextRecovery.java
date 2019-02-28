package ast.Passes;

import ast.def.*;
import ast.parser.SMTLIBv2BaseVisitor;
import ast.parser.SMTLIBv2Parser;

import java.util.HashMap;
import java.util.HashSet;

import static ast.def.Operator.OperatorKind.EQ;


public class ContextRecovery extends SMTLIBv2BaseVisitor {
    public static HashSet<Var> functionContext = new HashSet<>();


    @Override
    public Object visitSorted_var(SMTLIBv2Parser.Sorted_varContext ctx) {
        assert (ctx.getChildCount() == 4);
        String varName = ctx.getChild(1).getText();
        String typeName = ctx.getChild(2).getText();
        Exp.VarType varType;


        if(typeName.equals("Bool"))
            varType = Exp.VarType.BOOL;
        else if (typeName.equals("int"))
            varType = Exp.VarType.INT;
        else if (typeName.equals("float"))
            varType = Exp.VarType.FLOAT;
        else
            varType = null;
        ;

        functionContext.add(new IntVar(varName));

        return null;
    }

}
