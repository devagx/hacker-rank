import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MaxMinTests {
    @Test
    void maxMin_unorderedElementsGroupSize2_returnsCorrectMaxMin() {
        List<Integer> arr = Arrays.asList(4, 3, 1, 2);

        int result = Result.maxMin(2, arr);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void maxMin_unorderedElementsGroupSize4_returnsCorrectMaxMin() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 10, 20, 30, 40, 100, 200);

        int result = Result.maxMin(4, arr);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void maxMin_unorderedElementsGroupSize3_returnsCorrectMaxMin() {
        List<Integer> arr = Arrays.asList(10, 100, 300, 200, 1000, 20, 30);

        int result = Result.maxMin(3, arr);

        assertThat(result).isEqualTo(20);
    }

    @Test
    void maxMin_unorderedElementsGroupSize4HackerRankTest1_returnsCorrectMaxMin() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 10, 20, 30, 40, 100, 200);

        int result = Result.maxMin(4, arr);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void maxMin_unorderedElementsGroupSize2HackerRankTest2_returnsCorrectMaxMin() {
        List<Integer> arr = Arrays.asList(1, 2, 1, 2, 1);

        int result = Result.maxMin(2, arr);

        assertThat(result).isZero();
    }

    @Test
    void maxMin_unorderedElementsGroupSize5HackerRankTest3_returnsCorrectMaxMin() {
        List<Integer> arr = Arrays.asList(4504, 1520, 5857, 4094, 4157, 3902, 822, 6643, 2422, 7288, 8245, 9948, 2822, 1784, 7802, 3142, 9739, 5629, 5413, 7232);

        int result = Result.maxMin(5, arr);

        assertThat(result).isEqualTo(1335);
    }
}