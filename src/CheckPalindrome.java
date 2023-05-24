import java.util.Scanner;

public class CheckPalindrome {
    public static boolean checkPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "asdsxd";
        System.out.println(checkPalindrome(str));
    }
}
