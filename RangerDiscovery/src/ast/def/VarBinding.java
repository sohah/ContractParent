package ast.def;

import ast.visitors.AstVisitor;

public class VarBinding implements Ast{
    public final Var var;
    public final Exp exp;

    public VarBinding(Var var, Exp exp){
        this.var = var;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        boolean match;

        if (!(obj instanceof VarBinding))
            return false;
        else {
            match = (this.var.equals(((VarBinding) obj).var)) && (this.var.equals(((VarBinding) obj).exp));
            if (!match)
                return false;
        }
        return true;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) throws DiscoveryException {
        return visitor.visit(this);
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
}
