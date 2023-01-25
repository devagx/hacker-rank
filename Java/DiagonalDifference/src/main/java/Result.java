import java.util.Collections;
import java.util.List;

public class Result {

    private Result() {

    }

    public static int diagonalDifference(List<List<Integer>> listOfLists) {
        int leftToRightSum = 0;
        int rightToLeftSum = 0;

        for (int ol = 0; ol < listOfLists.size(); ol++) {
            List<Integer> row = listOfLists.get(ol);

            for (int il = 0; il < row.size(); il++) {
                if (ol == il) {
                    leftToRightSum = leftToRightSum + row.get(il);
                }
            }

            Collections.reverse(row);

            for (int il = 0; il < row.size(); il++) {
                if (ol == il) {
                    rightToLeftSum = rightToLeftSum + row.get(il);
                }
            }
        }
        return Math.abs(leftToRightSum - rightToLeftSum);
    }
}

//ALTERNATIVE SOLUTION

//    public static int diagonalDifference(List<List<Integer>> listOfLists) {
//        int leftDiagonal = 0;
//        int rightDiagonal = 0;
//
//        for (int ol = 0; ol < listOfLists.size(); ol++) {
//            for (int il = 0; il < listOfLists.get(ol).size(); il++) {
//                if (ol == il) {
//                    leftDiagonal += listOfLists.get(ol).get(il);
//                }
//                if ((ol + il) == (listOfLists.size() - 1)) {
//                    rightDiagonal += listOfLists.get(ol).get(il);
//                }
//            }
//        }
//        return Math.abs(leftDiagonal - rightDiagonal);
//    }
//}
