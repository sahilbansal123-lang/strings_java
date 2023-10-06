public class LongestRepeatingCharacterReplacement {

    public static int longestRepeating(String s, int k) {

        int left = 0;
        int max_count = 0;
        int max_length = 0;
        int [] arr = new int[26];

        for (int right = 0; right < s.length(); right++) {
            int window = right - left + 1;
            int curr = s.charAt(right);
            arr[curr - 'A']++;
            int freq = arr[curr - 'A'];
            max_count = Math.max(max_count, freq);

            while(window - max_count > k) {
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            max_length = Math.max(max_length, window);
        }
        return max_length;
    }

    public static void main(String[] args) {

    }
}
