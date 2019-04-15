package ast.def;

import ast.Passes.ToConstantHoleVisitor;
import ref.Pair;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;

public class H extends Transition {


    public H(String filePath, int maxK, T t) {
        super(WhichTransition.HOLE, filePath, maxK);
        Pair<LinkedHashMap<String, Var>, Ast> contextAndBody;
        try {
            contextAndBody = ToConstantHoleVisitor.execute(t.body);
            parameters.putAll(t.parameters);
            parameters.putAll(contextAndBody.getFirst());
            body = (Exp) contextAndBody.getSecond();
        } catch (DiscoveryException e) {
            System.out.println("error creating hole transition, " + e.getMessage());
        }
    }

    /**
     * Has the side effect of populating the transitionStrLoc with the string of the
     *
     * @param path
     */
    @Override
    protected void extractTransition(String path) {
        String extractedT = null;
        try {
            extractedT = new String(Files.readAllBytes(Paths.get(path)), "UTF-8");

        } catch (IOException e) {
            System.out.println("Problem reading file. " + e.getMessage());
        }

        int start;
        int end;
        start = extractedT.indexOf("(define-fun T");
        end = extractedT.indexOf("(declare-fun %init () Bool)");

        transitionStrLoc = new Pair<>(extractedT.substring(start, end - 1), new Pair<>(start, end));
    }


    public String define_fun() {
        StringBuilder t = new StringBuilder();

        if (whichTransition == WhichTransition.HOLE)
            t.append("\n(define-fun T (");
        else {
            System.out.println("Repaired Transition must be type T!");
            assert false;
        }

        for (Map.Entry entry : this.parameters.entrySet()) { //reconstructing the parameter list for T
            if (!entry.getValue().toString().contains("Hole")) {
                t.append("(").append(((Var) entry.getValue()).toString());
                t.append(" ").append(((Var) entry.getValue()).type.toString());
                t.append(")");
            }
        }
        t.append(") Bool\n");

        t.append(this.body);
        t.append(")\n");
        return t.toString();
    }
}
