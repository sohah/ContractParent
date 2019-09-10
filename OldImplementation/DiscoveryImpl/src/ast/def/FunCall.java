package ast.def;

import ast.visitors.AstVisitor;

import java.util.ArrayList;

public class FunCall extends Exp {
    Transition transition;
    ArrayList<Exp> exp;


    public FunCall(Transition transition, ArrayList<Exp> exp){
        this.transition = transition;
        this.exp = exp;
    }


    @Override
    public String toString() {
        return "( assert " + transition.whichTransition.toString() + printVars(exp) + ")";
    }

    /**
     * TODO: NOT SURE IF I REALLY NEED THAT.
     */
    @Override
    public <T> T accept(AstVisitor<T> visitor) throws DiscoveryException {
        return null;
    }


    public String printVars(ArrayList<Exp> exp){
        if(exp.size()==0){
            System.out.println("cannot instantiate vars for empty vars!");
            assert false;
        }

        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(exp.get(0).toString());

        for(int i=1; i<exp.size(); i++){
            stringBuilder.append(",").append(exp.get(i).toString());
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

}
