
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
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        int i = -1;
        int j = -1;
        int mct = 0;
        int dmct = p.length();
        HashMap<Character, Integer> map2 = new HashMap<>();

        while (true) {
            boolean f1 = false;
            boolean f2 = false;


            while (i < s.length()-1 && mct < dmct) {
                i++;
                char ch = s.charAt(i);
                map2.put(ch, map2.getOrDefault(ch, 0) + 1);
                if (map2.getOrDefault(ch, 0) <= map1.getOrDefault(ch, 0)) {
                    mct++;
                }

                f1 = true;
            }

            while(j < i && mct == dmct)  {
                // store in ans
                String pans = s.substring(j+1, i+1);

                if (ans.length() == 0 ||  pans.length() < ans.length()) {
                    ans = pans;
                }
                // release the j
                j++;
                char ch = s.charAt(j);
                if (map2.get(ch) == 1) {
                    map2.remove(ch);
                } else {
                    map2.put(ch, map2.get(ch)-1);
                }

                if (map2.getOrDefault(ch, 0) < map1.getOrDefault(ch, 0)) {
                    mct--;
                }

                f2 = true;
            }

            if (f1 == false && f2 == false) {
                break;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        String s = "timetopractice";
        String p = "toc";

        System.out.println(smallestWindow(s, p));
    }
}
