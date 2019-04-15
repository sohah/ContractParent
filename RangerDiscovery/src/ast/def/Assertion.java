package ast.def;

import ast.visitors.AstVisitor;

/**
 * linked like list to represent the upper assertions
 */
public class Assertion implements Ast {
    Exp head;
    Assertion tail;

    public Assertion(Exp head, Assertion tail) {
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
        if (tail != null)
            stringBuilder.append(tail.toString());

        return stringBuilder.toString();
    }
}
