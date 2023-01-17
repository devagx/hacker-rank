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

/*

CLIENT

INPUT A single line of five space-separated integers.


FUNCTION

INPUT: arr: an array of  integers
OUTPUT: 2 LONG integers (Minsum max sum space seperated)

LOGIC

Loop around array
    variable int min number Index
    variable int max number Index

    variable long sum min
    variable long sum max

    each itteration check if current number is smaller than min number, if so then set min number index to  current index
    each itteration check if current number is bigger than max number, if so then set max number index to  current index

OUTSIDE LOOP
long sum min = sum of integers except min number Index
long sum max = sum of integers except max number Index

PRINT
     variable long min number
    variable long max number


 */