import java.util.List;

public class Result {

    private Result() {

    }

    public static int flippingMatrix(List<List<Integer>> matrix) {
        int sum = 0;
        int matrixSize = matrix.size();
        int subMatrixSize = matrix.size() / 2;

        for (int r = 0; r < subMatrixSize; r++) {
            for (int c = 0; c < subMatrixSize; c++) {
//                System.out.println(matrix.get(r).get(c));
//                System.out.println(matrix.get(r).get(matrixSize - c - 1));
//                System.out.println(matrix.get(matrixSize - r - 1).get(c));
//                System.out.println(matrix.get(matrixSize - r - 1).get(matrixSize - c - 1));

                sum += Math.max(matrix.get(r).get(c),
                        Math.max(matrix.get(r).get(matrixSize - c - 1),
                                Math.max(matrix.get(matrixSize - r - 1).get(c),
                                        matrix.get(matrixSize - r - 1).get(matrixSize - c - 1))));
            }
        }

        return sum;
    }
}