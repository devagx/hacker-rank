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
}
