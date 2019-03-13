package ast.def;

import ast.visitors.AstVisitor;

public class BoolConst extends Exp {

    private String name;

    public BoolConst(String name) {
        this.name = name;
    }


    public BoolConst(String name, boolean isRepair) {
        this.name = name;
        this.isRepair = isRepair;
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
    public final static BoolConst TRUE_REPAIR = new BoolConst(" true ", true);
    public final static BoolConst FALSE = new BoolConst(" false ");
    public final static BoolConst FALSE_REPAIR = new BoolConst(" false ", true);

}
