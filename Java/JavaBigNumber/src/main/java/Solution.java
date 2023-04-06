import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();

        BigInteger bA = new BigInteger(a);
        BigInteger bB = new BigInteger(b);

        System.out.println(bA.add(bB));
        System.out.println(bA.multiply(bB));
    }
}