package ast.def;

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
    public abstract int hashCode();

    @Override
    public abstract boolean equals(Object obj);

    /**
     * Returns the declare-fun for the variable
     * @return
     */
    public abstract String declare_fun();
}
