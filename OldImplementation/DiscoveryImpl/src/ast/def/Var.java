package ast.def;

import ast.visitors.AstVisitor;

public abstract class Var extends Exp implements Cloneable {

    public final String name;

    public final VarType type;

    protected Var(String name, VarType type) {
        this.name = name;
        this.type = type;
    }

    protected Var(String name, VarType type, int k) {
        this.name = name+k;
        this.type = type;
    }

    public static Var createVarForType(String name, VarType varType){// crates a var type for name
        if(varType == VarType.INT)
            return new IntVar(name);
        else if(varType == VarType.BOOL)
            return new BoolVar(name);
        else{
            System.out.println("unsupported type for var!");
            assert false;
            return null;
        }
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
    public <T> T accept(AstVisitor<T> visitor) throws DiscoveryException {
        return visitor.visit(this);
    }

    @Override
    public String toString(){
        return " "+ name ;
    }
}
