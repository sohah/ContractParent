package ast.def;

abstract public class Exp implements Ast {
    public static enum VarType {
        INT, BOOL, FLOAT, CHAR;

        @Override
        public String toString() {
            switch (this) {
                case INT:
                    return "Int";
                case BOOL:
                    return "Bool";
                case FLOAT:
                    return "Float";
                case CHAR:
                    return "Char";
                default:
                    return null;
            }
        }
    }

    protected boolean isRepair = false;

    public final static IntConst ONE = new IntConst(1);
    public final static IntConst ZERO = new IntConst(0);



}
