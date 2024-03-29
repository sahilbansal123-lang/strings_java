import java.security.PublicKey;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class PrintCountOfDuplicates {

//                  TIME COMPLEXTY O(N)
    public static void duplicacy(String s) {       // Using MAP
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " , Count " + entry.getValue());
            }
        }
    }


    public static void main(String[] args) {
        String s = "geeksforgeeks";
        duplicacy(s);
    }
}
