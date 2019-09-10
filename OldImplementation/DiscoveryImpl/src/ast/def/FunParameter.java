package ast.def;


import ast.visitors.AstVisitor;

public class FunParameter extends Exp {

    Var parameter;

    public Var getParameter() {
        return parameter;
    }

    public ParameterType getParameterType() {
        return parameterType;
    }

    ParameterType parameterType;

    public FunParameter(Var parameter, ParameterType parameterType) {
        this.parameter = parameter;
        this.parameterType = parameterType;
    }


    public FunParameter clone() {
        return new FunParameter(this.parameter, this.parameterType);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) throws DiscoveryException {
        return null;
    }
}
