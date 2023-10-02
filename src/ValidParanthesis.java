import java.util.Stack;

public class ValidParanthesis {

    public static boolean validParanthesis(String s) {
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                balance++;
            } else if (c == ')') {
                balance--;
                if (balance < 0) {
                    return false; // More ')' than '(' encountered
                }
            }else if (c == '}') {
                balance--;
                if (balance < 0) {
                    return false; // More ')' than '(' encountered
                }
            }else if (c == ']') {
                balance--;
                if (balance < 0) {
                    return false; // More ')' than '(' encountered
                }
            }
        }

        return balance == 0;
    }

    public static void main(String[] args) {
        System.out.println(validParanthesis("((()))[]{)"));
    }
}
