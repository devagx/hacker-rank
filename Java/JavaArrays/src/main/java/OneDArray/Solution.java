package OneDArray;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] results;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstEvent = bufferedReader.readLine().trim();

        if (!(firstEvent.isEmpty() || firstEvent == null) && isNumeric(firstEvent)) {
            int arrSize = Integer.parseInt(firstEvent);
            ArrayBuilder arrayBuilder = new ArrayBuilder();

            for (int i = 0; i < arrSize; i++) {
                if (i == 0) {
                    arrayBuilder.add(arrSize, i, Integer.parseInt(bufferedReader.readLine().trim()));
                } else {
                    arrayBuilder.add(i, Integer.parseInt(bufferedReader.readLine().trim()));
                }
            }

            results = arrayBuilder.getArray();

            for (int result : results) {
                System.out.println(result);
            }
        } else {
            System.out.println("First event line must be numeric");
        }
    }

    static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int i = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
