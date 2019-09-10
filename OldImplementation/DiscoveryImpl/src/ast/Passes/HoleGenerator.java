package ast.Passes;

import ast.def.*;

import java.util.HashMap;

public class HoleGenerator {

    private static int uniquePostfix = 1;
    private final static String constantHoleName = "constHole_";

    public static HashMap<Var, Hole> varHoleHashMap = new HashMap<>();

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
        Hole hole = new Hole(var, originalAst);

        varHoleHashMap.put(var, hole);
        return hole;
    }


    public static void reset() {
        uniquePostfix = 1;
        varHoleHashMap.clear();
    }
}
