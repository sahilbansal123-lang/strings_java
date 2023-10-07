public class PrintAllPalindromicSubstrings {

    public static int subStrings(String s) {
        int n = s.length();
        boolean dp[][] = new boolean[n][n];
        for(int g = 0; g < s.length(); g++) {
            for (int i = 0, j = g; j < dp.length; i++, j++) {
                if (g == 0) {
                    dp[i][j] = true;
                } else if (g == 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                } else {
                    if (s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                if (dp[i][j] == true) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(subStrings("abc"));
    }
}
