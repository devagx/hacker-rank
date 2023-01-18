import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LonelyIntegerTests {
    @Test
    void lonelyInteger_1IntValueInArray_returnsSameIntValue() {
        List<Integer> inputArr = new ArrayList<>();

        inputArr.add(1);

        int result = Result.lonelyInteger(inputArr);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void lonelyInteger_lonelyIntStartOfSortedArray_returnsCorrectIntValue() {
        List<Integer> inputArr = new ArrayList<>();

        inputArr.add(1);
        inputArr.add(2);
        inputArr.add(2);
        inputArr.add(3);
        inputArr.add(3);

        int result = Result.lonelyInteger(inputArr);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void lonelyInteger_lonelyIntEndOfSortedArray_returnsCorrectIntValue() {
        List<Integer> inputArr = new ArrayList<>();

        inputArr.add(1);
        inputArr.add(1);
        inputArr.add(2);
        inputArr.add(2);
        inputArr.add(3);

        int result = Result.lonelyInteger(inputArr);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void lonelyInteger_lonelyIntMiddleOfSortedArray_returnsCorrectIntValue() {
        List<Integer> inputArr = new ArrayList<>();

        inputArr.add(1);
        inputArr.add(1);
        inputArr.add(2);
        inputArr.add(3);
        inputArr.add(3);

        int result = Result.lonelyInteger(inputArr);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void lonelyInteger_hackerRankTest1_returnsCorrectIntValue() {
        List<Integer> inputArr = new ArrayList<>();

        inputArr.add(1);
        inputArr.add(1);

        int result = Result.lonelyInteger(inputArr);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void lonelyInteger_hackerRankTest2_returnsCorrectIntValue() {
        List<Integer> inputArr = new ArrayList<>();

        inputArr.add(1);
        inputArr.add(1);
        inputArr.add(2);

        int result = Result.lonelyInteger(inputArr);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void lonelyInteger_hackerRankTest3_returnsCorrectIntValue() {
        List<Integer> inputArr = new ArrayList<>();

        inputArr.add(0);
        inputArr.add(0);
        inputArr.add(1);
        inputArr.add(2);
        inputArr.add(1);

        int result = Result.lonelyInteger(inputArr);

        assertThat(result).isEqualTo(2);
    }


}
