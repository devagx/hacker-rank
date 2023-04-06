import java.util.*;

public class Solution {
    public static Scanner sc = new Scanner(System.in);
    public static int B = sc.nextInt();
    public static int H = sc.nextInt();
    public static boolean flag = true;

    static {
        if ((B <= 0 || (H <= 0))) {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }

}

