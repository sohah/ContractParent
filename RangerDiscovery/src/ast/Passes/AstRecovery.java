package ast.Passes;

import ast.def.Ast;
import ast.def.Exp;
import ast.def.Operator;
import ast.parser.SMTLIBv2BaseVisitor;
import ast.parser.SMTLIBv2Parser;

import static ast.def.Operator.OperatorKind.EQ;


public class AstRecovery extends SMTLIBv2BaseVisitor<Ast> {

    @Override
    public Ast visitQual_identifer(SMTLIBv2Parser.Qual_identiferContext ctx) {
        return new Operator(EQ); }

    @Override
    public Ast visitSimpleSymbol(SMTLIBv2Parser.SimpleSymbolContext ctx) {
        return visitChildren(ctx); }
}
