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

    private Exp recoverAst(String body) {
        assert (body.length() > 0);

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
