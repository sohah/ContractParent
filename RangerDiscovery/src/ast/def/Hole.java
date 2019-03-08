package ast.def;

import ast.visitors.AstVisitor;

public class Hole implements Exp {

    //this is the original ast part for which we are creating a hole.
    public Ast orignalAst;

    public final Ast holeAst;

    public Hole(Ast holeAst, Ast orignalAst) {
        this.holeAst = holeAst;
        this.orignalAst = orignalAst;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Hole))
            return false;
        else
            return (this.holeAst.equals(((Hole) obj).holeAst));
    }

    @Override
    public int hashCode() {
        return holeAst.hashCode();
    }

    @Override
    public String toString(){
        return " "+ holeAst.toString() + " ";
    }
}
