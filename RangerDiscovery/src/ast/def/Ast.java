package ast.def;

import ast.visitors.AstVisitor;

public interface Ast {
    String toString();
    boolean equals(Object object);
    <T> T accept(AstVisitor<T> visitor) throws DiscoveryException;
    int hashCode();
}
