package ast.Passes;

import ast.def.*;
import ast.parser.SMTLIBv2Lexer;
import ast.parser.SMTLIBv2Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.LinkedHashMap;
import ref.Pair;

import static Transition.TransitionT.transitionT;
import static ref.Utility.*;

public class ToAstPass {
    String transition;

    public ToAstPass(String transition){
        this.transition = transition;
    }


    private LinkedHashMap<String, Var> recoverFunContext(String transition) {
        CharStream stream = CharStreams.fromString(transition);
        SMTLIBv2Lexer lexer = new SMTLIBv2Lexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SMTLIBv2Parser parser = new SMTLIBv2Parser(tokens);
        SMTLIBv2Parser.CommandContext something = parser.command();

        ContextRecoveryVisitor contextRecoveryVisitor = new ContextRecoveryVisitor();
        contextRecoveryVisitor.visit(something);

        return contextRecoveryVisitor.functionContext;
    }

    private Exp recoverFunBody(String transition, LinkedHashMap<String, Var> tContext) {
        CharStream stream = CharStreams.fromString(transition);
        SMTLIBv2Lexer lexer = new SMTLIBv2Lexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SMTLIBv2Parser parser = new SMTLIBv2Parser(tokens);
        SMTLIBv2Parser.CommandContext something = parser.command();

        BodyRecoveryVisitor bodyRecoveryVisitor = new BodyRecoveryVisitor(tContext);
        SMTLIBv2Parser.BodyContext body = null;


        for(int i=0; i<something.getChild(2).getChildCount(); i++) //trying to isolate the body for the body visitor  pass
            if(something.getChild(2).getChild(i) instanceof SMTLIBv2Parser.BodyContext)
                body = (SMTLIBv2Parser.BodyContext) something.getChild(2).getChild(i);

        return bodyRecoveryVisitor.visit(body);
    }

    public static Pair<LinkedHashMap<String, Var>, Ast> execute(String jkindFile) {
        ToAstPass toAstPass = new ToAstPass(jkindFile);
        LinkedHashMap<String, Var> tContext = toAstPass.recoverFunContext(toAstPass.transition);

        Ast tBody = toAstPass.recoverFunBody(toAstPass.transition, tContext);
        System.out.println(tBody);
        return new Pair(tContext, tBody);
    }

}
