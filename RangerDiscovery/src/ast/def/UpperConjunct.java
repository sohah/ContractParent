package ast.def;

import ast.visitors.AstVisitor;

/**
 * linked like list to represent the upper assertions
 */
public class UpperConjunct implements Ast {
    Exp head;
    UpperConjunct tail;

    public UpperConjunct(Exp head, UpperConjunct tail) {
        this.head = head;
        this.tail = tail;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) throws DiscoveryException {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("(assert ");
        stringBuilder.append(head).append(")");
        stringBuilder.append(tail.toString());

        return stringBuilder.toString();
    }
}
