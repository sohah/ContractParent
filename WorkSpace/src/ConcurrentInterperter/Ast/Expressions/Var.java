package ConcurrentInterperter.Ast.Expressions;

public class Var implements Expr {
    String id;
    Type type;


    public Var(String id, Type type){
        this.id = id;
        this.type = type;
    }
}
