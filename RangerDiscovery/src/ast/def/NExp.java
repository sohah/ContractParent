package ast.def;

import ast.visitors.AstVisitor;

import java.util.ArrayList;

public class NExp extends Exp {

    public final Operator operator;
    public final ArrayList<Exp> operands;
    public final Operator.OperatorType expType;

    public NExp(Operator operator, ArrayList operands) {
        this.operator = operator;
        this.operands = operands;
        this.expType = operator.type;
    }


    public NExp(Operator operator, ArrayList operands, boolean isRepair) {
        this.operator = operator;
        this.operands = operands;
        this.expType = operator.type;
        this.isRepair = isRepair;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) throws DiscoveryException {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        StringBuilder myString = new StringBuilder("(" + operator.toString());
        for(Exp exp: operands)
            myString.append(exp.toString());

        myString.append(")");
        return myString.toString();
    }

    @Override
    public boolean equals(Object obj) {
        boolean match;

        if (!(obj instanceof NExp))
            return false;
        else {
            match = this.operator.equals(((NExp) obj).operator);
            if (!match)
                return false;
            else
                for (int i = 0; i < this.operands.size(); i++)
                    if (!this.operands.get(i).equals(((NExp) obj).operands.get(i)))
                        return false;
        }
        return true;
    }

}
