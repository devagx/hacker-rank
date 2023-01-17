import java.util.Collections;
import java.util.List;

public class Result {
    private Result() {

    }

    public static void miniMaxSum(List<Integer> arr) {
        long minSum = 0;
        long maxSum = 0;
        int minNumIndex = arr.indexOf(Collections.min(arr));
        int maxNumIndex = arr.indexOf(Collections.max(arr));

        for (int i = 0; i < arr.size(); i++) {
            if (i != minNumIndex) {
                maxSum = maxSum + arr.get(i);
            }
            if (i != maxNumIndex) {
                minSum = minSum + arr.get(i);
            }
        }
        System.out.println(minSum + " " + maxSum);
    }
}