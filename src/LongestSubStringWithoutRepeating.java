import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStringWithoutRepeating {

    public static int substring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int left = 0; // Left pointer of the sliding window
        Set<Character> charSet = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(left));
                left++; // Move the left pointer to the right to remove the repeating character
            }

            charSet.add(currentChar); // Add the current character to the set
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcdaa";
        System.out.println(substring(s));
    }
}
