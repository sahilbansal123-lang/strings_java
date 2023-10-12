
// QUES:  Smallest window in a string containing all the characters of another string

//        HardAccuracy: 30.19%Submissions: 119K+Points: 8
//        Given two strings S and P. Find the smallest window in the string S consisting of all the characters
//        (including duplicates) of the string P.  Return "-1" in case there is no such window present.
//        In case there are multiple such windows of same length, return the one with the least starting index.
//        Note : All characters are in Lowercase alphabets.

//        Input:
//        S = "zoomlazapzo"
//        P = "oza"
//        Output:
//        apzo
//        Explanation: "apzo" is the smallest Substring in which "oza" can be found.

import java.util.HashMap;

public class SmallestWindowInSContainingAllCharactersOFP {

    public static String smallestWindow(String s, String p) {
        String ans = "";
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char ch : p.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        int i = 0;
        int j = 0;
        int mct = 0;
        int dmct = p.length();
        HashMap<Character, Integer> map2 = new HashMap();

        int minLength = Integer.MAX_VALUE;

        while (i < s.length()) {
            char ch = s.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);

            if (map2.get(ch) <= map1.getOrDefault(ch, 0)) {
                mct++;
            }

            while (mct == dmct && j <= i) {
                // Calculate the current window length
                int currentLength = i - j + 1;
                if (currentLength < minLength) {
                    minLength = currentLength;
                    ans = s.substring(j, i + 1);
                }

                // Try to shrink the window from the left
                char leftChar = s.charAt(j);
                if (map2.get(leftChar) == 1) {
                    map2.remove(leftChar);
                } else {
                    map2.put(leftChar, map2.get(leftChar) - 1);
                }

                if (map2.getOrDefault(leftChar, 0) < map1.getOrDefault(leftChar, 0)) {
                    mct--;
                }

                j++;
            }

            i++;
        }

        return ans;
    }


    public static void main(String[] args) {
        String s = "timetopractice";
        String p = "toc";

        System.out.println(smallestWindow(s, p));
    }
}
