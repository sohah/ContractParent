package ast.def;

public interface Exp extends Ast{
    public static enum VarType {
        INT, BOOL, FLOAT, CHAR;
    }
    public final static IntConst ONE = new IntConst(1);
    public final static IntConst ZERO = new IntConst(0);

}
