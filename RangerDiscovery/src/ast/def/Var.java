package ast.def;

public abstract class Var implements Cloneable, Ast {

    final String name;

    final Operator.TypeEnum type;

    protected Var(String name, Operator.TypeEnum type) {
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
