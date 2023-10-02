public class RemoveConsecutiveCharacter {

    public static String remove(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        char currChar = str.charAt(0);
        result.append(currChar);

        for (int i = 1; i < str.length(); i++) {
            char nextChar = str.charAt(i);
            if (currChar != nextChar) {
                result.append(nextChar);
                currChar = nextChar;
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(remove("aaabba"));
    }
}
