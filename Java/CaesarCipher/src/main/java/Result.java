public class Result {
    private Result() {

    }

    public static String caesarCipher(String input, int rotations) {
        String origAlphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase();

        rotations = rotations % 26;

        StringBuilder alphaRotatedBuilder = new StringBuilder(origAlphabet);
        String charsToShit = alphaRotatedBuilder.substring(0, rotations);

        alphaRotatedBuilder.delete(0, rotations);
        alphaRotatedBuilder.append(charsToShit);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int posInOrgAlphabet = origAlphabet.indexOf(input.toUpperCase().charAt(i));

            if (posInOrgAlphabet == -1) {
                result.append(input.charAt(i));
            } else if (Character.isUpperCase(input.charAt(i))) {
                result.append(Character.toUpperCase(alphaRotatedBuilder.charAt(posInOrgAlphabet)));
            } else {
                result.append(Character.toLowerCase(alphaRotatedBuilder.charAt(posInOrgAlphabet)));
            }
        }
        return result.toString();
    }
// ALTERNATIVE SOLUTION
//    public static String caesarCipher(String input, int rotations) {
//
//        String str = "";
//        for (int i = 0; i < input.length(); i++) {
//            str = str + getUpdatedAsciiChar(input.charAt(i), rotations%26);
//        }
//        return str;
//    }
//
//    public static char getUpdatedAsciiChar(char ch, int incremental) {
//        if (Character.isLetter(ch)) {
//            int i = (int) ch;
//            i = i + incremental;
//
//            if (Character.isUpperCase(ch)) {
//                if (i > 90) {
//                    int num = (int) ch + incremental;
//                    i = num - 26;
//                }
//            } else if (i > 122) {
//                int num = (int) ch + incremental;
//                i = num - 26;
//            }
//            return (char) i;
//        }
//        return ch;
//    }
}
