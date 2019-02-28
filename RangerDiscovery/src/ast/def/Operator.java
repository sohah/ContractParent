package ast.def;

import ast.visitors.AstVisitor;

public class Operator implements Ast {

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public static enum OperatorType {
        NUM, BOOL;
    }

    public static enum OperatorKind {
        EQ, NOT, AND, OR, IMPLIES, IFTHENELSE, ASSIGN, ADD, SUB;

        @Override
        public String toString() {
            switch (this) {
                case ASSIGN:
                case EQ:
                    return " = ";
                case NOT:
                    return " not ";
                case AND:
                    return " and ";
                case OR:
                    return " or ";
                case IMPLIES:
                    return " => ";
                case IFTHENELSE:
                    return " ite ";
                case ADD:
                    return " add ";
                case SUB:
                    return " sub ";
                default:
                    return null;
            }
        }
    }

    public final OperatorKind opName;
    public final OperatorType type;
    public final int arity;

    public Operator(OperatorKind opName) {
        this.opName = opName;

        switch (opName) {
            case NOT:
                arity = 1;
                type = OperatorType.BOOL;
                break;
            case EQ:
            case AND:
            case OR:
            case IMPLIES:
                arity = 2;
                type = OperatorType.BOOL;
                break;
            case ASSIGN:
            case ADD:
            case SUB:
                arity = 2;
                type = OperatorType.NUM;
                break;
            case IFTHENELSE:
                arity = 3;
                type = OperatorType.BOOL;
                break;
            default:
                arity = -1;
                type = null;
        }
    }


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Operator))
            return false;
        else return (this.toString().equals(obj.toString()));
    }
}
