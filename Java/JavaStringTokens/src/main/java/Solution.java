import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        scan.close();

        s = s.trim();

        String[] parts = s.split("[^a-zA-Z]+");

        System.out.println(s.length() < 1 ? "0" : parts.length);

        for (String part : parts) {
            System.out.println(part);
        }
    }
}

