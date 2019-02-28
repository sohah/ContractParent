package ast.def;

import ast.visitors.AstVisitor;

public class IntVar extends Var {

    public IntVar(String name) {
        super(name, VarType.INT);
    }

    @Override
    public Var clone() {
        return new IntVar(name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof IntVar))
            return false;
        else
            return (this.name.equals(((IntVar) obj).name) && (this.type.toString().equals(((IntVar) obj).type.toString())));
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String declare_fun() {
        return "(declare-fun " + name + " () " + type +")";
    }
}
