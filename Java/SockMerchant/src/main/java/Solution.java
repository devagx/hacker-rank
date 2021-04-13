import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int count = 0;
        Arrays.sort(ar);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    i = j + 1;
                    j = i;
                    count++;
                }
            }
        }
        //Return count
        return count;
    }

    public static void main(String[] args) {
        int n = 9;
        int[] ar = new int[n];

        ar[0] = 10;
        ar[1] = 20;
        ar[2] = 20;
        ar[3] = 10;
        ar[4] = 10;
        ar[5] = 30;
        ar[6] = 50;
        ar[7] = 10;
        ar[8] = 20;

        int result = sockMerchant(n, ar);
        System.out.println(String.valueOf(result));

    }
}
