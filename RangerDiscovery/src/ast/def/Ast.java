package ast.def;

import ast.visitors.AstVisitor;

public interface Ast {
    public abstract String toString();
    public abstract boolean equals(Object object);
    public abstract <T> T accept(AstVisitor<T> visitor);
}
