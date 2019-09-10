package ast.def;

import ref.Pair;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class R extends Transition {


    public R(String filePath, int maxK) {
        super(WhichTransition.R, filePath, maxK);
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
        extractedT = removeRange(extractedT); // current preprocessing is only intended for R
        extractedT = renameInOutVars(extractedT);
        start = extractedT.indexOf("(define-fun R");
        end = extractedT.length();

        transitionStrLoc = new Pair<>(extractedT.substring(start, end - 1), new Pair<>(start, end));
    }

    /**
     * The purpose of this is to to make the input and output  have the same name but different prefix than the input variables, making the
     * transition similar to that in T, and thereby allowing it to be handled the same way as T.
     *
     * @param extractedT
     * @return
     */
    private String renameInOutVars(String extractedT) {
        extractedT = doRename(extractedT, baseFreeInput, 1);
        extractedT = doRename(extractedT, baseConstrainedInput, 0);
        extractedT = doRename(extractedT, baseOutput, 1);
        return extractedT;
    }


    /**
     * This tries to make output have the same name but different prefix than the input variables, making the
     * transition similar to that in T, and thereby allowing it to be handled the same way as T.
     *
     * @param extractedT
     * @return
     */
    private String doRename(String extractedT, ArrayList<String> list, int k) {
        for (int i = 0; i < list.size(); i++) {
            String oldName = list.get(i);
            String newName = oldName + "$" + k; // Making free input start with the same index as transition T.
            extractedT = extractedT.replace(oldName, newName);
            list.set(i, newName);
        }
        return extractedT;
    }


    /**
     * used for any pre-processing on the transition before actually using it, for example to remove ranges of int variables.
     *
     * @param extracted
     * @return
     */
    protected String removeRange(String extracted) {
        StringBuilder processedTransition = new StringBuilder();
        String[] lines = extracted.split(System.getProperty("line.separator"));
        for (String s : lines) {
            if (!s.contains("2147483648") && !s.contains("2147483647"))
                processedTransition.append(s).append("\n");
        }

        return processedTransition.toString();
    }


    /**
     * defines the transition using define-fun
     *
     * @return
     */
    public String toString() {
        return define_fun_T(WhichTransition.R);
    }


}
