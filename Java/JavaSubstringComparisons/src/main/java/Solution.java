import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 0; i < s.length() + 1 - k; i++) {
            String subString = s.substring(i, k + i);

            if (smallest.compareTo(subString) > 0) {
                smallest = subString;
            }
            if (largest.compareTo(subString) < 0) {
                largest = subString;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        int k = scan.nextInt();

        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}