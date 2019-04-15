package ast.def;


public class FunParameter {

    Var parameter;

    ParameterType parameterType;

    public FunParameter(Var parameter, ParameterType parameterType){
        this.parameter = parameter;
        this.parameterType = parameterType;
    }
}
