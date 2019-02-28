package ast.Passes;

import ast.def.*;
import ast.parser.SMTLIBv2Lexer;
import ast.parser.SMTLIBv2Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import ref.Pair;

import static org.antlr.v4.runtime.misc.Utils.readFile;
import static ref.Utility.*;

public class ToAstPass {
    String transition;
    String transitionHeader;
    String transitionBody;

    public ToAstPass(String jkindFile){
        transition = getTransitionT(jkindFile);
    }

    public static Exp execute(String jkindFile) {
        ToAstPass toAstPass = new ToAstPass(jkindFile);
        Pair<String, String> headAndBody = splitHeaderBody(toAstPass.transition);
        toAstPass.transitionHeader =  headAndBody.getFirst()+ " Bool \n";
        toAstPass.transitionBody = headAndBody.getSecond();

        return toAstPass.recoverAst(toAstPass.transition);
    }

    /**
     * This method recovers the ast for a given constraint.
     * An input invariant to this method is that the first char and the last char is open and close brackets.
     * @param body
     * @return
     */
    private Exp recoverAst(String body) {
        CharStream stream = CharStreams.fromString(body);
        SMTLIBv2Lexer lexer = new SMTLIBv2Lexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SMTLIBv2Parser parser = new SMTLIBv2Parser(tokens);
        SMTLIBv2Parser.CommandContext something = parser.command();

        ContextRecoveryVisitor contextRecoveryVisitor = new ContextRecoveryVisitor();
        contextRecoveryVisitor.visit(something);

        AstRecovery visitor = new AstRecovery();
        Ast value = visitor.visit(something);

        /*ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new SMTLIBv2BaseListener(), something);
*/
        return null;
    }

}
