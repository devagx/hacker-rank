import java.util.ArrayList;
import java.util.List;

public class Result {
    private Result() {

    }

    public static List<Integer> matchingStrings(List<String> inputStrings, List<String> queryStrings) {
        List<Integer> results = new ArrayList<>();

        for (String queryString : queryStrings) {
            int matchCount = 0;
            for (String inputString : inputStrings) {
                if (queryString.equals(inputString)) {
                    matchCount = matchCount + 1;
                }
            }
            results.add(matchCount);
        }
        return results;
    }
}
