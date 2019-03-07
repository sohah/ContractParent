package Transition;

import ast.def.Exp;
import ast.def.Var;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TransitionT {
    public HashMap<String, Var> tContext = new HashMap<>();
    public HashMap<String, Var> tPrimeContext = new HashMap<>();

    public Exp tBody;
    public Exp tPrimeBody;

    public static TransitionT transitionT = new TransitionT();

    public void createTprime(HashMap<String, Var> tPrimeContext, Exp body){
        this.tPrimeContext.putAll(tContext);
        this.tPrimeContext.putAll(tPrimeContext);
        tPrimeBody = body;
    }

    public String tPrimeToString(){
        StringBuilder tPrime = new StringBuilder();
        for(Map.Entry entry: this.tPrimeContext.entrySet())
            tPrime.append(entry.getValue().toString());

        tPrime.append(this.tPrimeBody.toString());
        return tPrime.toString();
    }
}
