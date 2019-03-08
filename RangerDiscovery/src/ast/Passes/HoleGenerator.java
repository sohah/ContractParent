package ast.Passes;

import ast.def.*;

import java.util.HashMap;

public class HoleGenerator {

    private static int uniquePostfix = 1;
    private final static String constantHoleName = "constHole_";

    public static HashMap<Hole, Ast> instantiatedHoles = new HashMap<>();

    public static Hole generateConstantHole(Ast originalAst){
        String holeName = constantHoleName + Integer.toString(uniquePostfix);
        ++uniquePostfix;

        Var var = null;
        if(originalAst instanceof BoolConst)
            var = new BoolVar(holeName);
        else if(originalAst instanceof IntConst)
            var = new IntVar(holeName);
        else
            assert false;

        return new Hole(var, originalAst);
    }


}
