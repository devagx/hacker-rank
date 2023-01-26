import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CountingSort1Tests {

    @Test
    void countingSort_singleValueArray_returnsSingleArrayWithValueSetInCorrectPositionRestAreZero() {
        List<Integer> inputArray = new ArrayList<>();

        inputArray.add(2);

        List<Integer> expectedOutputArray = new ArrayList<>();

        expectedOutputArray.add(0);
        expectedOutputArray.add(0);
        expectedOutputArray.add(1);

        List<Integer> resultArray = Result.countingSort(inputArray);

        assertThat(resultArray).element(0).isEqualTo(0);
        assertThat(resultArray).element(1).isEqualTo(0);
        assertThat(resultArray).element(2).isEqualTo(1);
    }

    @Test
    void countingSort_doubleValueArrayWithDuplicates_returnsSingleArrayWithSingleValueIncrementedRestAreZero() {
        List<Integer> inputArray = new ArrayList<>();

        inputArray.add(3);
        inputArray.add(3);

        List<Integer> expectedOutputArray = new ArrayList<>();

        expectedOutputArray.add(0);
        expectedOutputArray.add(0);
        expectedOutputArray.add(0);
        expectedOutputArray.add(2);

        List<Integer> resultArray = Result.countingSort(inputArray);

        assertThat(resultArray).element(0).isEqualTo(0);
        assertThat(resultArray).element(1).isEqualTo(0);
        assertThat(resultArray).element(2).isEqualTo(0);
        assertThat(resultArray).element(3).isEqualTo(2);
    }

    @Test
    void countingSort_doubleValueArrayWithNoDuplicates_returnsSingleArrayWith2ValuesSetRestAreZero() {
        List<Integer> inputArray = new ArrayList<>();

        inputArray.add(1);
        inputArray.add(3);

        List<Integer> expectedOutputArray = new ArrayList<>();

        expectedOutputArray.add(0);
        expectedOutputArray.add(1);
        expectedOutputArray.add(0);
        expectedOutputArray.add(1);

        List<Integer> resultArray = Result.countingSort(inputArray);

        assertThat(resultArray).element(0).isEqualTo(0);
        assertThat(resultArray).element(1).isEqualTo(1);
        assertThat(resultArray).element(2).isEqualTo(0);
        assertThat(resultArray).element(3).isEqualTo(1);
    }

    @Test
    void countingSort_tripleValueArrayWithDuplicatesAndNoDuplicates_returnsSingleArray1ValueSetNotIncrementedAnd1ValueSetIncrementedRestAreZero() {
        List<Integer> inputArray = new ArrayList<>();

        inputArray.add(1);
        inputArray.add(1);
        inputArray.add(3);

        List<Integer> expectedOutputArray = new ArrayList<>();

        expectedOutputArray.add(0);
        expectedOutputArray.add(2);
        expectedOutputArray.add(0);
        expectedOutputArray.add(1);

        List<Integer> resultArray = Result.countingSort(inputArray);

        assertThat(resultArray).element(0).isEqualTo(0);
        assertThat(resultArray).element(1).isEqualTo(2);
        assertThat(resultArray).element(2).isEqualTo(0);
        assertThat(resultArray).element(3).isEqualTo(1);
    }

    @Test
    void countingSort_anyInputArray_resultArrayHasSize100() {
        List<Integer> inputArray = new ArrayList<>();

        inputArray.add(2);

        List<Integer> resultArray = Result.countingSort(inputArray);

        assertThat(resultArray).hasSize(100);
    }

    @Test
    void countingSort_arrayWithMixedValues_returnsSingleArrayWithCorrectValuesSet() {
        List<Integer> inputArray = new ArrayList<>();

        inputArray.add(1);
        inputArray.add(1);
        inputArray.add(3);
        inputArray.add(2);
        inputArray.add(1);

        List<Integer> expectedOutputArray = new ArrayList<>();

        expectedOutputArray.add(0);
        expectedOutputArray.add(3);
        expectedOutputArray.add(1);
        expectedOutputArray.add(1);

        List<Integer> resultArray = Result.countingSort(inputArray);

        assertThat(resultArray).element(0).isEqualTo(0);
        assertThat(resultArray).element(1).isEqualTo(3);
        assertThat(resultArray).element(2).isEqualTo(1);
        assertThat(resultArray).element(3).isEqualTo(1);
    }
}
