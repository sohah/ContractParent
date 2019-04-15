package ast.def;

import ref.Pair;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class T extends Transition {


    public T(String filePath, int maxK) {
        super(WhichTransition.T, filePath, maxK);
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


    public String declare_Hole_Constants() {

        if (whichTransition != WhichTransition.T) {
            System.out.println("Cannot make holes for transitions that are not T");
            assert false;
        }
        ;

        StringBuilder t = new StringBuilder();

        for (Map.Entry<String, Var> entry : this.parameters.entrySet()) {
            if (entry.getKey().contains("Hole")) {
                t.append(entry.getValue().declare_fun());
                t.append("\n");
            }
        }
        return t.toString();
    }


    /**
     * defines the transition using define-fun
     * @return
     */
    public String toString() {
        return define_fun_T(WhichTransition.T);
    }


}
