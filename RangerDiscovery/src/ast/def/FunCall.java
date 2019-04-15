package ast.def;

import ast.visitors.AstVisitor;

import java.util.ArrayList;

public class FunCall extends Exp {
    Transition transition;
    ArrayList<Var> vars;


    public FunCall(Transition transition, ArrayList<Var> vars){
        this.transition = transition;
        this.vars = vars;
    }


    @Override
    public String toString() {
        return "( assert " + transition.whichTransition.toString() + printVars(vars) + ")";
    }

    /**
     * TODO: NOT SURE IF I REALLY NEED THAT.
     */
    @Override
    public <T> T accept(AstVisitor<T> visitor) throws DiscoveryException {
        return null;
    }


    public String printVars(ArrayList<Var> vars){
        if(vars.size()==0){
            System.out.println("cannot instantiate vars for empty vars!");
            assert false;
        }

        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(vars.get(0).toString());

        for(int i=1; i<vars.size(); i++){
            stringBuilder.append(",").append(vars.get(i).toString());
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

}
