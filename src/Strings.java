import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str = new String("abcd");
//
//        Scanner sc = new Scanner(System.in);
//        String str2 = sc.next(); // for printing single word
//        String str3 = sc.nextLine(); // for printing whole sentence
//        System.out.println(str2);
//        System.out.println(str3);


        // CONCATENATION
        String new1 = str1 + " " + str;
        System.out.println(new1);
    }
}