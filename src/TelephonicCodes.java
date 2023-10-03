import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class TelephonicCodes {

    public static String sentenceToKeypadSequence(String sentence, String arr[]) {
        if (sentence == null || sentence.isEmpty()) {
            return ""; // Handle edge cases
        }

        String output = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                output += '0';
            } else {
                int position = sentence.charAt(i) - 'A';
                output += arr[position];
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String str[]
                = { "2",    "22",  "222", "3",   "33", "333",
                "4",    "44",  "444", "5",   "55", "555",
                "6",    "66",  "666", "7",   "77", "777",
                "7777", "8",   "88",  "888", "9",  "99",
                "999",  "9999" };

        String input = "GEEKSFORGEEKS";
        System.out.println(sentenceToKeypadSequence(input, str));
    }
}
