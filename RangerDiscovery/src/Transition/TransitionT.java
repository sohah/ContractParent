package Transition;

import ast.def.Exp;
import ast.def.Var;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TransitionT {

    public LinkedHashMap<String, Var> tContext = new LinkedHashMap<>();
    public LinkedHashMap<String, Var> tHoleContext = new LinkedHashMap<>();
    public LinkedHashMap<String, Var> tPrimeContext = new LinkedHashMap<>();

    public Exp tBody;
    public Exp tHoleBody;
    public Exp tPrimeBody;

    public static TransitionT transitionT = new TransitionT();

    public void createTwithHoles(LinkedHashMap<String, Var> holeContext, Exp holeBody){
        this.tHoleContext.putAll(tContext);
        this.tHoleContext.putAll(holeContext);
        tHoleBody = holeBody;
    }

    /**
     * creates a string for the transitionT with Holes, including the added context
     * @return
     */
    public String tHoleToString(){
        StringBuilder tPrime = new StringBuilder();
        for(Map.Entry entry: this.tHoleContext.entrySet()) //adding the hole vars into the declarations
            tPrime.append(((Var)entry.getValue()).declare_fun());

        tPrime.append(declare_fun_T());

        tPrime.append(this.tHoleBody.toString());
        return tPrime.toString();
    }

    /**
     * creates the transition
     * @return
     */
    public String tToString(){
        StringBuilder tPrime = new StringBuilder();

        tPrime.append(declare_fun_T());

        tPrime.append(this.tBody.toString());
        return tPrime.toString();
    }

    public String tPrimeToString(){
        StringBuilder tPrime = new StringBuilder();
        for(Map.Entry entry: this.tPrimeContext.entrySet()) //adding the hole vars into the declarations
            tPrime.append(((Var)entry.getValue()).declare_fun());

        tPrime.append(declare_fun_T());


        tPrime.append(this.tPrimeBody.toString());
        return tPrime.toString();
    }

    public String declare_fun_T(){
        StringBuilder t = new StringBuilder();

        t.append("\ndeclare-fun T(");
        for(Map.Entry entry: this.tPrimeContext.entrySet()){ //reconstructing the parameter list for T
            t.append("(");
            t.append(((Var)entry.getValue()).toString());
            t.append(" ");
            t.append(((Var)entry.getValue()).type.toString());
            t.append(")");
        }
        t.append(")\n");

        return t.toString();
    }
}
