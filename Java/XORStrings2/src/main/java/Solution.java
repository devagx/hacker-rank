import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scannerIn = new Scanner(System.in);
        String input1 = scannerIn.next();
        String input2 = scannerIn.next();
        scannerIn.close();

        String result = Result.stringsXor(input1, input2);

        System.out.println(result);
    }
}