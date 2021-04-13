

public class Solution {
    public static void main(String[] args) {

        int steps = 8;
        String path = "UDDDUDUU";
        int result = Result.countingValleys(steps, path);

        System.out.println("output: ");
        System.out.println(String.valueOf(result));
    }
}

class Result {
    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        int numValleys = 0;
        int seaLevel = 0;

        for (int i = 0; i < steps; i++) {
            char c = path.charAt(i);

            if (c == 'U') {
                seaLevel++;
                if (seaLevel == 0) {
                    numValleys++;
                }
            } else if (c == 'D') {
                seaLevel--;
            }
        }
        return numValleys;
    }
}
