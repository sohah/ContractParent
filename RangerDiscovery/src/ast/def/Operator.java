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
        EQ, NOT, AND, OR, IMPLIES, IFTHENELSE, ADD, SUB;

        @Override
        public String toString() {
            switch (this) {
                case EQ:
                    return "=";
                case NOT:
                    return "not";
                case AND:
                    return "and";
                case OR:
                    return "or";
                case IMPLIES:
                    return "=>";
                case IFTHENELSE:
                    return "ite";
                case ADD:
                    return "add";
                case SUB:
                    return "sub";
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
            case IMPLIES:
                arity = 2;
                type = OperatorType.BOOL;
                break;
            case ADD:
            case SUB:
                arity = 2;
                type = OperatorType.NUM;
                break;
            case IFTHENELSE:
                arity = 3;
                type = OperatorType.BOOL;
                break;
            case AND:
            case OR:
                arity = 100;
                type = OperatorType.BOOL;
                break;
            default:
                arity = -1;
                type = null;
        }
    }

    public Operator(String opName) throws DiscoveryException {

        OperatorKind opNameKind;

        if (opName.equals(OperatorKind.EQ.toString()))
            opNameKind = OperatorKind.EQ;
        else if (opName.equals(OperatorKind.NOT.toString()))
            opNameKind = OperatorKind.NOT;
        else if (opName.equals(OperatorKind.AND.toString()))
            opNameKind = OperatorKind.AND;
        else if (opName.equals(OperatorKind.OR.toString()))
            opNameKind = OperatorKind.OR;
        else if (opName.equals(OperatorKind.IMPLIES.toString()))
            opNameKind = OperatorKind.IMPLIES;
        else if (opName.equals(OperatorKind.ADD.toString()))
            opNameKind = OperatorKind.ADD;
        else if (opName.equals(OperatorKind.SUB.toString()))
            opNameKind = OperatorKind.SUB;
        else if (opName.equals(OperatorKind.IFTHENELSE.toString()))
            opNameKind = OperatorKind.IFTHENELSE;
        else throw new DiscoveryException("unkown operator");

        this.opName = opNameKind;

        switch (opNameKind) {
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

    @Override
    public String toString(){
        return opName.toString();
    }
}
