package ConcurrentInterperter.Programs;

import ConcurrentInterperter.Ast.Expressions.Value;
import ConcurrentInterperter.Ast.Expressions.Var;

import java.util.HashMap;

public class Locals {

    HashMap<Var, Value> map = new HashMap<>();

    public Value lookup(Var x){
        return map.get(x);
    }
    public Value put(Var x, Value v){
        return map.put(x,v);
    }
}
