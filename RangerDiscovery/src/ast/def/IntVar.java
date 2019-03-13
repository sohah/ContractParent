package ast.def;

import ast.visitors.AstVisitor;

public class IntVar extends Var {

    public IntVar(String name) {
        super(name, VarType.INT);
    }

    public IntVar(String name, boolean isRepair) {
        super(name, VarType.INT, isRepair);
    }

    @Override
    public Var clone() {
        return new IntVar(name, this.isRepair);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof IntVar))
            return false;
        else
            return (this.name.equals(((IntVar) obj).name) && (this.type.toString().equals(((IntVar) obj).type.toString())));
    }

    @Override
    public String toString(){
        return " "+ name;
    }


    @Override
    public <T> T accept(AstVisitor<T> visitor) throws DiscoveryException {
        return visitor.visit(this);
    }

}
