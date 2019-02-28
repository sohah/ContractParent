package ast.def;

import ast.visitors.AstVisitor;

public abstract class Var implements Cloneable, Exp {

    final String name;

    final VarType type;

    protected Var(String name, VarType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public abstract Var clone();

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public abstract boolean equals(Object obj);

    /**
     * Returns the declare-fun for the variable
     * @return
     */
    public String declare_fun() {
        return "(declare-fun " + name + " () " + type +")";
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

}
