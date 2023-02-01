import java.util.List;

public class Result {
    private Result() {

    }

    public static int birthday(List<Integer> squares, int day, int month) {
        int result = 0;
        int sumOfSegment = 0;
        int squaresSize = squares.size();

        if (squaresSize == 0 || (day < 1 || day > 31) || (month < 1 || month > 12)) {
            return 0;
        }

        for (int s = 0; s < squaresSize; s++) {
            for (int m = 0; m < month; m++) {
                if (s + m < squaresSize && ((squaresSize - s) >= month)) {
                    sumOfSegment += squares.get(s + m);
                }
            }
            if (sumOfSegment == day) {
                result += 1;
            }
            sumOfSegment = 0;
        }
        return result;
    }
}
