package ast.def;

import ast.visitors.AstVisitor;

public class BinaryExp implements Exp {

    public final Operator operator;
    public final Exp lhs;
    public final Exp rhs;
    public final Operator.OperatorType expType;

    public BinaryExp(Operator operator, Exp lhs, Exp rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
        this.operator = operator;
        this.expType = operator.type;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "(" + operator + lhs + rhs + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BinaryExp))
            return false;
        else
            return (this.operator.equals(((BinaryExp) obj).operator)
                    && this.lhs.equals(((BinaryExp) obj).lhs)
                    && this.rhs.equals(((BinaryExp) obj).rhs));
    }
}
