package ast.Passes;

import ast.def.*;
import ref.Pair;

import static ref.Utility.*;

public class ToAstPass {
    String transition;
    String transitionHeader;
    String transitionBody;

    public ToAstPass(String jkindFile){
        transition = getTransitionT(jkindFile);
    }

    public static Exp execute(String jkindFile){
        ToAstPass toAstPass = new ToAstPass(jkindFile);
        Pair<String, String> headAndBody = splitHeaderBody(toAstPass.transition);
        toAstPass.transitionHeader =  headAndBody.getFirst()+ " Bool \n";
        toAstPass.transitionBody = headAndBody.getSecond();

        return toAstPass.recoverAst(toAstPass.transitionBody);
    }

    /**
     * This method recovers the ast for a given constraint.
     * An input invariant to this method is that the first char and the last char is open and close brackets.
     * @param body
     * @return
     */
    private Exp recoverAst(String body) {
        assert (body.length() > 0);
        if(Character.isWhitespace(body.charAt(0))) //removing possible white space in the beginning
            body = body.substring(1, body.length());

        assert ((body.charAt(0)=='(') && (body.charAt(body.length()-1)==')'));

        String constraints = new String();
        /*removing the outer solve*/
        body = body.substring(8, body.length() - 1);

        int startingIndex = 0;
        int endingIndex = body.length();
        while (startingIndex < endingIndex) {
            Pair startEndIndecies = findAssertion(body, startingIndex);

            startingIndex = (int) startEndIndecies.getFirst();
            int assertionEndIndex = (int) startEndIndecies.getSecond();

            String assertion = body.substring(startingIndex, assertionEndIndex + 1); //+1 because substring is not inclusive for the endIndex.
          /*  if(assertion.startsWith("and")){
                Exp lhs =
            }
*/

            startingIndex = assertionEndIndex + 1;
        }
        return null;

    }

}
