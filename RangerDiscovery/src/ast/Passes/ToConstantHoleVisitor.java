package ast.Passes;

import ast.def.*;
import ast.visitors.AstVisitor;
import ref.Pair;

import java.util.LinkedHashMap;

public class ToConstantHoleVisitor implements AstVisitor<Ast>{
    public LinkedHashMap<String, Var> tPrimeContext = new LinkedHashMap<>();

    @Override
    public Exp visit(IntConst numExp) {
        Hole hole = HoleGenerator.generateConstantHole(numExp);
        assert(hole.holeAst instanceof IntVar);
        tPrimeContext.put(((IntVar) hole.holeAst).name, (IntVar) hole.holeAst);
        return hole;
    }

    @Override
    public Ast visit(Operator operation) {
        return new Operator(operation.opName);
    }

    @Override
    public Ast visit(IntVar intVar) {
        return new IntVar(intVar.name);
    }

    @Override
    public Ast visit(Hole hole) {
        System.out.println("visting hole in ToConstantHoleVisitor, that shouldn't happen!");
        assert false;
        return null;
    }

    @Override
    public Ast visit(BoolConst boolConst) {
        Hole hole = HoleGenerator.generateConstantHole(boolConst);
        assert(hole.holeAst instanceof BoolVar);
        tPrimeContext.put(((BoolVar) hole.holeAst).name, (Var) hole.holeAst);
        return hole;
    }

    @Override
    public Ast visit(BoolVar boolVar) {
        return new BoolVar(boolVar.name);
    }

    @Override
    public Ast visit(Var var) throws DiscoveryException {
        System.out.println("visiting a var super type, something went wrong.");
        assert false; // I shouldn't visit the super type
        return null;
    }

    @Override
    public Ast visit(NExp nExp) {
        return new NExp(nExp.operator, nExp.operands);
    }

    public static Pair<LinkedHashMap<String, Var>, Ast> execute(Ast t) throws DiscoveryException {
        ToConstantHoleVisitor toConstantHoleVisitor = new ToConstantHoleVisitor();
        Ast tPrimeWithHoles = t.accept(toConstantHoleVisitor);
        return new Pair(toConstantHoleVisitor.tPrimeContext, tPrimeWithHoles);
    }
}
