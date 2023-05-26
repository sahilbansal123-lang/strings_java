public class Compress {

    public static String compress(String str) {
        StringBuilder bs = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            bs.append(str.charAt(i));
            if (count > 1) {
                bs.append(count.toString());
            }
        }
        return bs.toString();
    }

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(compress(str));
    }
}
