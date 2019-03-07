package ast.Passes;

import ast.def.Ast;
import ast.def.BoolConst;
import ast.def.BoolVar;
import ast.def.Hole;

public class HoleGenerator {

    private static int uniquePosfix = 1;
    private final static String constantHoleName = "constHole_";

    public static Hole generateHole(Ast originalAst){
        String holeName = constantHoleName + Integer.toString(uniquePosfix);
        ++uniquePosfix;

        //if(originalAst instanceof BoolConst)

    }


}
