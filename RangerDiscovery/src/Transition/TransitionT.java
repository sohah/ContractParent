package Transition;

import ast.def.Exp;
import ast.def.Var;

import java.util.HashMap;
import java.util.HashSet;

public class TransitionT {
    public HashMap<String, Var> tContext = new HashMap<>();
    public HashMap<String, Var> tPrimeContext = new HashMap<>();

    public Exp tBody;
    public Exp tPrimeBody;

    public static TransitionT transitionT = new TransitionT();
}
