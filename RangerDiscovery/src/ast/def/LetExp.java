package ast.def;

import ast.visitors.AstVisitor;

import java.util.ArrayList;

public class LetExp extends Exp {


    public final Operator operator;
    public final ArrayList<Exp> operands;
    public final Operator.OperatorType expType;

    public final ArrayList<VarBinding> varBindings;

    public LetExp(Operator operator, ArrayList<VarBinding> varBindings, ArrayList operands) {
        this.operator = operator;
        this.operands = operands;
        this.expType = operator.type;
        this.varBindings = varBindings;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) throws DiscoveryException {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        StringBuilder myString = new StringBuilder("(" + operator.toString());

        for (VarBinding varBinding : varBindings) {
            myString.append(varBinding.toString());
        }

        for (Exp exp : operands)
            myString.append(exp.toString());

        myString.append(")");
        return myString.toString();
    }

    @Override
    public boolean equals(Object obj) {
        boolean match;

        if (!(obj instanceof LetExp))
            return false;
        else {
            match = this.operator.equals(((LetExp) obj).operator);
            if (!match)
                return false;
            else {
                for (int i = 0; i < this.operands.size(); i++)
                    if (!this.operands.get(i).equals(((LetExp) obj).operands.get(i)))
                        return false;
                for (int i = 0; i < this.varBindings.size(); i++)
                    if (!this.varBindings.get(i).equals(((LetExp) obj).varBindings.get(i)))
                        return false;
            }
        }
        return true;
    }

}
