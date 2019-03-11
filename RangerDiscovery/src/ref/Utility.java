package ref;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Objects;

public class Utility {

    /**
     * takes a definition of transition T in string, returns two strings, one for the header and another for the body, including their opening and closing
     * brackets but missing the outer ones for the function definition.
     * @param query
     * @return
     */
    public static Pair<String,String> splitHeaderBody(String query) {
        assert (query.length() > 0);

        String functionDefStr = "define-fun T";

        //defined as the first character after "define-fun T
        int startingIndex = query.indexOf(functionDefStr)+functionDefStr.length();

        //defined as the last character before the last closing bracket
        int endingIndex = query.lastIndexOf(")");

        /*removing the outer define-fun and ending bracket*/
        query = query.substring(startingIndex, endingIndex);

        //gets the index of the bool, which should be the return type of the transition, + 4 to account for the letters in "Bool"
        int returnIndex = query.lastIndexOf("Bool") + 5;


        String header = query.substring(0, returnIndex);

        String body = query.substring(returnIndex-1, query.length());
        return new Pair(header, body);
    }


    public static String generateBody(String query) {
        assert (query.length() > 0);

        String constraints = new String();
        /*removing the outer solve*/
        query = query.substring(8, query.length() - 1);

        int startingIndex = 0;
        int endingIndex = query.length();
        while (startingIndex < endingIndex) {
            Pair startEndIndecies = findAssertion(query, startingIndex);

            startingIndex = (int) startEndIndecies.getFirst();
            int assertionEndIndex = (int) startEndIndecies.getSecond();

            String assertion = query.substring(startingIndex, assertionEndIndex + 1); //+1 because substring is not inclusive for the endIndex.
            constraints += "\t" + assertion + "\n";
            startingIndex = assertionEndIndex + 1;
        }
        return constraints;
    }


    /**
     * This takes the starting index of an opening bracket for which we want to find a matching closing bracket. It returns the index of the closing bracket.
     *
     * @param query
     * @param startingIndex
     * @return
     */
    public static Pair<Integer, Integer> findAssertion(String query, int startingIndex) {
        int closingIndex = 0;
        int bracket = 0;
        boolean closingBracketFound = false;
        boolean firstOpenBracketEncountered = false;
        int walkingIndex = startingIndex;

        /*This loop tries to find the index of the first opening bracket. At the end of the loop, the walkingIndex will have this index number.*/
        while (!firstOpenBracketEncountered) {
            char c = query.charAt(walkingIndex);
            if (c == '(')
                firstOpenBracketEncountered = true;
            else {
                ++walkingIndex;
            }
        }

        startingIndex = walkingIndex;
        while (!closingBracketFound) {
            char c = query.charAt(walkingIndex);
            if (c == '(')
                ++bracket;
            else if (c == ')')
                --bracket;

            if (bracket == 0) {
                closingBracketFound = true;
                closingIndex = walkingIndex;
            }
            ++walkingIndex;
        }

        return new Pair(startingIndex, closingIndex);
    }

    public static String getTransitionT(String path) {
        String content = null;
        try {
            content = new String(Files.readAllBytes(Paths.get(path)), "UTF-8");
        } catch (IOException e) {
            System.out.println("Problem reading file. " + e.getMessage());
        }
        int startT = content.indexOf("(define-fun T");
        int endT = content.indexOf("(declare-fun %init () Bool)");
        content = content.substring(startT, endT - 1);
        /*Pattern pattern = Pattern.compile("^\\(set-option :produce-unsat-cores true\\)[a-zA-Z0-9!@#$&()\\\\-`.+,/\\\"]*^\\(declare-fun", Pattern.DOTALL); //^(set-option :produce-unsat-cores true)[d()s$a-zA-Z0-9]+^(declare-fun
        Matcher matcher = pattern.matcher(content);
        if (matcher.find())
        {
            System.out.println(matcher.group(1));
        }
        */
        return content;
    }

    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

}
