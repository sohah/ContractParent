package ConcurrentInterperter.Ast.Expressions;

import ConcurrentInterperter.ExpressionVisitor;

public class Var implements Expr {
    public String id;
    public Type type;


    public Var(String id, Type type){
        this.id = id;
        this.type = type;
    }
    public Expr accept(ExpressionVisitor v){
        return v.visit(this);
    }
}
