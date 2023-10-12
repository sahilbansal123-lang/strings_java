
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

public class SmallestWindowInSContainingAllCharactersOFP {

    public static String smallestWindow(String s, String p) {
        String ans = "";
        int windowSize = p.length();
        for (int i = 0; i < s.length(); i++) {
            while (windowSize < s.length()) {

            }
        }
    }

    public static void main(String[] args) {

    }
}
