package Transition;

import ast.def.Exp;
import ast.def.Var;

import java.util.HashSet;

public class TransitionT {
    public HashSet<Var>  tContext = new HashSet<>();
    public HashSet<Var>  tPrimeContext = new HashSet<>();

    public Exp tBody;
    public Exp tPrimeBody;

    public static TransitionT transitionT = new TransitionT();
}
