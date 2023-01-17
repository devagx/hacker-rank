import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Result {
    private Result() {
    }

    public static void plusMinus(List<Integer> arr) {
        double totalArrValues = 0;
        double totalPosInts = 0;
        double totalalNegInts = 0;
        double totalalZeroInts = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (i == 0) {
                totalArrValues = arr.get(i);
            } else {
                if (arr.get(i) == 0) {
                    totalalZeroInts++;
                } else if (arr.get(i) > 0) {
                    totalPosInts++;
                } else {
                    totalalNegInts++;
                }
            }
        }
        BigDecimal bdPos = BigDecimal.valueOf(totalPosInts / totalArrValues);
        bdPos = bdPos.setScale(6, RoundingMode.HALF_UP);

        BigDecimal bdNeg = BigDecimal.valueOf(totalalNegInts / totalArrValues);
        bdNeg = bdNeg.setScale(6, RoundingMode.HALF_UP);

        BigDecimal bdZero = BigDecimal.valueOf(totalalZeroInts / totalArrValues);
        bdZero = bdZero.setScale(6, RoundingMode.HALF_UP);

        System.out.println(bdPos);
        System.out.println(bdNeg);
        System.out.println(bdZero);
    }
}
