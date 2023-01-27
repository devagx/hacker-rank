import java.util.HashSet;

public class Result {
    private Result() {

    }

    public static String pangrams(String input) {
        input = input.replaceAll(
                "[^a-zA-Z]", "");

        input = input.toLowerCase();

        HashSet<Character> nonDupChars = new HashSet<>();

        for (char val : input.toCharArray()) {
            nonDupChars.add(val);
        }

        if (nonDupChars.size() == 26) {
            return "pangram";
        } else {
            return "not pangram";
        }
    }
}
