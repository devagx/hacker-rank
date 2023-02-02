import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Result {

    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        double arrSizeDiv2RoundedUp = arr.size() /2.0;
        return arr.get((int)arrSizeDiv2RoundedUp);
    }
}