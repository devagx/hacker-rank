import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Result {
    private Result() {

    }

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> answers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>(Collections.nCopies(0, 0)));
        }
        int lastAnswer = 0;

        for (int i = 0; i < queries.size(); i++) {
            int idx;
            int queryType = queries.get(i).get(0);
            int x = queries.get(i).get(1);
            int y = queries.get(i).get(2);

            if (queryType == 1) {
                idx = ((x ^ lastAnswer) % n);
                arr.get(idx).add(y);
            } else if (queryType == 2) {
                idx = ((x ^ lastAnswer) % n);
                lastAnswer = arr.get(idx).get(y % (arr.get(idx).size()));
                answers.add(lastAnswer);
            }
        }
        return answers;
    }
}
