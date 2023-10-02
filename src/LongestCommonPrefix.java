public class LongestCommonPrefix {

    public static String prefix(String[] strs) {
        String shortest = strs[0];

        // Shortest Length String
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length()<shortest.length()){
                shortest = strs[i];
            }
        }

        for (int i = 0; i < strs.length; i++) {
            char c = shortest.charAt(i);
            for (String str : strs) {
                if (c != str.charAt(i)) {
                    return str.substring(0, i);
                }
            }
        }
        return shortest;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
