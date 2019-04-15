package ast.def;

public enum WhichTransition {
    T, R, HOLE;

    @Override
    public String toString() {
        switch (this) {
            case T:
            case HOLE:
                return "T";
            case R:
                return "R";
        }
        return null;
    }
}

