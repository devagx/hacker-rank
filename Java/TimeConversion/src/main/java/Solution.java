import java.io.*;
import java.text.ParseException;

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String result = Result.timeConversion(s);

        System.out.println(result);
    }
}
