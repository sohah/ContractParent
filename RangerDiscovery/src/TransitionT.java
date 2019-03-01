import ast.def.Exp;
import ast.def.Var;

import java.util.HashSet;

public class TransitionT {
    HashSet<Var>  tContext = new HashSet<>();
    HashSet<Var>  tPrimeContext = new HashSet<>();

    Exp tBody;
    Exp tPrimeBody;
}
