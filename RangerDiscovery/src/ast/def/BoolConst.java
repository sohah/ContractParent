package ast.def;

import ast.visitors.AstVisitor;

public class BoolConst implements Exp {

    private String name;

    private BoolConst(String name) {
        this.name = name;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof BoolConst))
            return false;
        else
            return (this.name.equals (((BoolConst) obj).name));
    }

    @Override
    public String toString() {
        return name;
    }

    public final static BoolConst TRUE = new BoolConst(" true ");
    public final static BoolConst FALSE = new BoolConst(" false ");

}
