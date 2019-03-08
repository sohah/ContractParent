package ast.Passes;

import ast.def.*;
import ast.parser.SMTLIBv2BaseVisitor;
import ast.parser.SMTLIBv2Parser;

import java.util.HashMap;
import java.util.LinkedHashMap;


public class ContextRecoveryVisitor extends SMTLIBv2BaseVisitor {
    public LinkedHashMap<String, Var> functionContext = new LinkedHashMap<>();


    @Override
    public Object visitSorted_var(SMTLIBv2Parser.Sorted_varContext ctx) {
        assert (ctx.getChildCount() == 4);
        String varName = ctx.getChild(1).getText();
        String typeName = ctx.getChild(2).getText();

        if(typeName.equals("Bool"))
            functionContext.put(varName, new IntVar(varName));
        else if (typeName.equals("Int"))
            functionContext.put(varName, new IntVar(varName));
        else if (typeName.equals("Float"))
            functionContext.put(varName, new IntVar(varName));
        return null;
    }

}
