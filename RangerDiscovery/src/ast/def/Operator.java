package ast.def;

import ast.visitors.AstVisitor;

public class Operator implements Ast {

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public static enum TypeEnum {
        NUM, FLOAT;
    }

    public static enum OperatorEnum {
        EQ, NOT, AND, OR, IFTHENELSE, ASSIGN, ADD, SUB
    }

    public final OperatorEnum opName;
    public final TypeEnum type;
    public final int arity;

    public Operator(OperatorEnum opName) {
        this.opName = opName;

        switch (opName) {
            case NOT:
                arity = 1;
                type = TypeEnum.BOOL;
                break;
            case EQ:
            case AND:
            case OR:
                arity = 2;
                type = TypeEnum.BOOL;
                break;
            case ASSIGN:
            case ADD:
            case SUB:
                arity = 2;
                type = TypeEnum.NUM;
                break;
            case IFTHENELSE:
                arity = 3;
                type = TypeEnum.BOOL;
                break;
            default:
                arity = -1;
                type = null;
        }
    }

    public String toString() {
        switch (opName) {
            case ASSIGN:
            case EQ:
                return " = ";
            case AND:
                return " and ";
            case OR:
                return " or ";
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

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Operator))
            return false;
        else return (this.toString().equals(obj.toString()));
    }
}
