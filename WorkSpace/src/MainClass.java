import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if(s.length() == 1)
            return 1;

        int longestSize = 0;
        int currSize =0;

        Set<Character> map = new HashSet<>();
        for(int i=0; i<=s.length()-1; ++i){
            if(map.contains(s.charAt(i))){//we have seen the char before
                map = new HashSet<>();
                if(currSize > longestSize){//we have encountered a longer substring
                    longestSize = currSize;
                }
                map.add(s.charAt(i));
                currSize = 1;
            } else {
                map.add(s.charAt(i)); ++currSize;
            }
        }
        if(currSize > longestSize)
            longestSize = currSize;

        return longestSize;
    }
}

public class MainClass {

    public static void main(String[] args) throws IOException {

            int ret = new Solution().lengthOfLongestSubstring("dvdf");

            String out = String.valueOf(ret);

            System.out.print(out);
    }
}