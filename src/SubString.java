public class SubString {

    public static String subString(String str, int si, int ei){
        String subStrings = "";
        for (int i = si; i < ei; i++) {
            subStrings += str.charAt(i);
        }
        return subStrings;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(subString(str, 1, 5));
    }
}
