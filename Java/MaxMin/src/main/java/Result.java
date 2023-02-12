
import java.util.Collections;
import java.util.List;

public class Result {
    private Result() {

    }

    public static int maxMin(int groupSize, List<Integer> arr) {
        Collections.sort(arr);

        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i <= (arr.size() - groupSize)) {
                int min = arr.get(i);
                int max = arr.get(i + groupSize - 1);

                if (i == 0) {
                    result = max - min;
                } else if ((max - min) < result) {
                    result = max - min;

                }
            }
        }
        return result;
    }
//ALTERNATIVE SOLUTION

//    public static int maxMin(int groupSize, List<Integer> arr) {
//        Collections.sort(arr);
//
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i <= arr.size() - groupSize; i++)
//            min = Math.min(min, arr.get(groupSize + i - 1) - arr.get(i));
//        return min;
//    }
}
