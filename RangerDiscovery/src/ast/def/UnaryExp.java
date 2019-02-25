package ast.def;

import ast.visitors.AstVisitor;

public class UnaryExp implements Exp {

    public final Operator operator;
    public final Exp exp;
    public final Operator.OperatorType expType;

    public UnaryExp(Operator operator, Exp exp, Exp rhs) {
        this.exp = exp;
        this.operator = operator;
        this.expType = operator.type;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "(" + operator + exp + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof UnaryExp))
            return false;
        else
            return (this.operator.equals(((UnaryExp) obj).operator)
                    && this.exp.equals(((UnaryExp) obj).exp));
    }
}
