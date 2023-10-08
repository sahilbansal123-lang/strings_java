public class PalindromicSubsequence {

    static long [][]dp = new long[1000][1000];

    public static long helper(String str , int i , int j){

        if(dp[i][j] != -1)
            return dp[i][j];

        int mod=(int)Math.pow(10,9)+7;

        if(i > j){

            return 0;
        }
        if(i == j)
            return dp[i][j] = 1;



        else if(str.charAt(i) == str.charAt(j)){
            return dp[i][j] = (1+helper(str , i+1 , j)+helper(str,i,j-1))%mod;
        }

        else{
            return dp[i][j] = (mod+helper(str , i+1 , j)+helper(str,i,j-1)-helper(str,i+1,j-1))%mod;
        }


    }
    public static long countPS(String str)
    {
        // Your code here
        int n = str.length();
        for (int i = 0; i < 1000; i++){
            for (int j = 0; j < 1000; j++){
                dp[i][j] = -1;
            }

        }

        return helper(str , 0 , n-1);

    }

    public static void main(String[] args) {
        String str = "abcd";

        System.out.println(countPS(str));
    }
}
