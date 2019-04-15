package ast.def;

import ast.visitors.AstVisitor;

public class IntConst extends Exp {

    public final int value;

    public IntConst(int value) {
        this.value = value;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof  IntConst))
            return false;
        else
            return (this.value == ((IntConst) obj).value);
    }

    @Override
    public String toString() {
        return " " + String.valueOf(value);
    }
}
