package ast.def;

import ast.visitors.AstVisitor;

public class IfThenElseExp implements Exp {

    public final Operator operator;
    public final Exp cond;
    public final Exp lhs;
    public final Exp rhs;
    public final Operator.OperatorType expType;

    public IfThenElseExp(Operator operator, Exp cond, Exp lhs, Exp rhs) {
        this.cond = cond;
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
        return "(" + operator + cond + lhs + rhs + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof IfThenElseExp))
            return false;
        else
            return (this.operator.equals(((IfThenElseExp) obj).operator)
                    && this.cond.equals(((IfThenElseExp) obj).cond)
                    && this.lhs.equals(((IfThenElseExp) obj).lhs)
                    && this.rhs.equals(((IfThenElseExp) obj).rhs));
    }
}
