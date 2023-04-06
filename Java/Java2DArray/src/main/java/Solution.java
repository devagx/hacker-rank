import java.io.*;
import java.util.*;

public class Solution {
    public static List<List<Integer>> arr;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        bufferedReader.close();

        int totalSum = Integer.MIN_VALUE;
        for (int r = 1; r < 5; r++) {
            for (int c = 1; c < 5; c++) {
                int currSum = getHour(r, c);

                if (currSum > totalSum) {
                    totalSum = currSum;
                }
            }
        }
        System.out.println(totalSum);
    }

    public static int getHour(int r, int c) {
        int sum = 0;

        //Top
        sum += arr.get(r - 1).get(c - 1);
        sum += arr.get(r - 1).get(c);
        sum += arr.get(r - 1).get(c + 1);
        //Middle
        sum += arr.get(r).get(c);
        //Bottom
        sum += arr.get(r + 1).get(c - 1);
        sum += arr.get(r + 1).get(c);
        sum += arr.get(r + 1).get(c + 1);

        return sum;
    }
}
