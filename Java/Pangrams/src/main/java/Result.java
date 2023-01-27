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

        return (nonDupChars.size() == 26) ? "pangram" : "not pangram";
    }

    //ALTERNATIVE APPROACH

//    public static String pangrams(String input) {
//        input = input.replaceAll(
//                "[^a-zA-Z]", "");
//
//        input = input.toLowerCase();
//
//        Character[] inputChars = new String(input.toCharArray()).chars()
//                .mapToObj(c -> (char) c)
//                .toArray(Character[]::new);
//
//        Set<Character> nonDupChars = new HashSet<>(Arrays.asList(inputChars));
//
//        return (nonDupChars.size() == 26) ? "pangram" : "not pangram";
//    }
}
