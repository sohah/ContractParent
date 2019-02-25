package ast.def;

import ast.visitors.AstVisitor;

public class Hole implements Exp {

    //this is the original ast part for which we are creating a hole.
    private static int index = 0;

    public final Ast forAst;

    public final String name;

    public Hole(Ast forAst) {
        this.forAst = forAst;
        name = "hole_" + index++;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Hole))
            return false;
        else
            return (this.name.equals(((Hole) obj).name));
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
