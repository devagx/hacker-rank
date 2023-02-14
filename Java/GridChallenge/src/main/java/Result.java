import java.util.Arrays;
import java.util.List;

public class Result {
    private Result() {

    }

    public static String gridChallenge(List<String> grid) {
        String result = "YES";
        char[] chars;
        int currChar = -1;
        int nextChar = -1;

        for (int r = 0; r < grid.size(); r++) {
            chars = grid.get(r).toCharArray();
            Arrays.sort(chars);
            grid.set(r, String.valueOf(chars));
        }
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.size(); j++) {
                if (j != grid.size() - 1 && (i != grid.size() - 1 || grid.size() == 2)) {
                    currChar = grid.get(j).charAt(i);
                    nextChar = grid.get(j + 1).charAt(i);

                    if (currChar > nextChar) {
                        result = "NO";
                    }
                }
            }
        }
        return result;
    }
}