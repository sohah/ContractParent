package ast.Passes;

import ast.def.*;
import ast.parser.SMTLIBv2Lexer;
import ast.parser.SMTLIBv2Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.HashMap;

import static Transition.TransitionT.transitionT;
import static ref.Utility.*;

public class ToAstPass {
    String transition;

    public ToAstPass(String jkindFile){
        transition = getTransitionT(jkindFile);
    }

    public static void execute(String jkindFile) {
        ToAstPass toAstPass = new ToAstPass(jkindFile);
        transitionT.tContext = toAstPass.recoverFunContext(toAstPass.transition);

        transitionT.tBody = toAstPass.recoverFunBody(toAstPass.transition);
        return;
    }

    private HashMap<String, Var> recoverFunContext(String transition) {
        CharStream stream = CharStreams.fromString(transition);
        SMTLIBv2Lexer lexer = new SMTLIBv2Lexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SMTLIBv2Parser parser = new SMTLIBv2Parser(tokens);
        SMTLIBv2Parser.CommandContext something = parser.command();

        ContextRecoveryVisitor contextRecoveryVisitor = new ContextRecoveryVisitor();
        contextRecoveryVisitor.visit(something);

        return contextRecoveryVisitor.functionContext;
    }

    private Exp recoverFunBody(String transition) {
        CharStream stream = CharStreams.fromString(transition);
        SMTLIBv2Lexer lexer = new SMTLIBv2Lexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SMTLIBv2Parser parser = new SMTLIBv2Parser(tokens);
        SMTLIBv2Parser.CommandContext something = parser.command();

        BodyRecoveryVisitor bodyRecoveryVisitor = new BodyRecoveryVisitor();
        return bodyRecoveryVisitor.visit(something);
    }


}
