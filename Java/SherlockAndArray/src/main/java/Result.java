import java.util.List;

public class Result {
    private Result() {
    }

    public static String balancedSums(List<Integer> arr) {
        String result = "NO";
        int runningTotal = 0;
        int totalArrSum = arr.stream().mapToInt(Integer::intValue).sum();

        for (int i = 0; i < arr.size(); i++) {
            if ((totalArrSum - runningTotal - arr.get(i)) == runningTotal) {
                return "YES";
            }
            runningTotal += arr.get(i);
        }
        return result;
    }
}