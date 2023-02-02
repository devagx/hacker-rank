import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Result {

    private Result() {

    }

    public static String stringsXor(String input1, String input2) {
        if ((input1.length() == 0 || input1 == null) || (input2.length() == 0 || input2 == null)) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        Pattern p = Pattern.compile("[0-1]+");

        Matcher m1 = p.matcher(input1);
        Matcher m2 = p.matcher(input2);

        if (m1.matches() && m2.matches()) {
            for (int i = 0; i < input1.length(); i++) {
                char input1C = input1.charAt(i);
                char input2C = input2.charAt(i);

                if (input1C == input2C) {
                    result.append("0");
                } else {
                    result.append("1");
                }
            }
            return result.toString();
        } else {
            return "";
        }
    }
}
