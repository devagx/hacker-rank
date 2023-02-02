import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FlippingTheMatrixTests {

    @Test
    void flippingMatrix_1nBy1nMatrix_returnsMaxSum4() {
        List<List<Integer>> matrix = new ArrayList<>();

        List<Integer> rows = new ArrayList<>();
        rows.add(1);
        rows.add(2);

        matrix.add(rows);

        rows = new ArrayList<>();
        rows.add(3);
        rows.add(4);
        matrix.add(rows);

        int result = Result.flippingMatrix(matrix);

        assertThat(result).isEqualTo(4);
    }

    @Test
    void flippingMatrix_2nBy2nMatrix_returnsMaxSum414() {
        List<List<Integer>> matrix = new ArrayList<>();

        List<Integer> rows = new ArrayList<>();
        rows.add(112);
        rows.add(42);
        rows.add(83);
        rows.add(119);

        matrix.add(rows);

        rows = new ArrayList<>();
        rows.add(56);
        rows.add(125);
        rows.add(56);
        rows.add(49);

        matrix.add(rows);

        rows = new ArrayList<>();
        rows.add(15);
        rows.add(78);
        rows.add(101);
        rows.add(43);

        matrix.add(rows);

        rows = new ArrayList<>();
        rows.add(62);
        rows.add(98);
        rows.add(114);
        rows.add(108);

        matrix.add(rows);

        int result = Result.flippingMatrix(matrix);

        assertThat(result).isEqualTo(414);
    }


}
