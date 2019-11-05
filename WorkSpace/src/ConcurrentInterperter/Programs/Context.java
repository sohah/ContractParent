package ConcurrentInterperter.Programs;

import ConcurrentInterperter.Ast.Expressions.Value;
import ConcurrentInterperter.Ast.Expressions.Var;

import java.util.HashMap;

public class Context {

    HashMap<Var, Value> locals = new HashMap<>();
}
