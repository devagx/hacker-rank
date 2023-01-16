package OneDArray;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayBuilderTest {
    @Test
    void addElement_inputArraySizeAndPositionAndOneValue_returnsOneValue() {
        ArrayBuilder arrayBuilder = new ArrayBuilder();
        arrayBuilder.add(1, 0, 10);
        int[] myArray = arrayBuilder.getArray();
        int[] expectedResult = new int[1];

        expectedResult[0] = 10;

        assertThat(myArray).containsExactly(expectedResult);
        assertThat(myArray).hasSize(1);
    }

    @Test
    void addElement_inputArraySizeAndPositionAndTwoValues_returnsTwoValues() {
        ArrayBuilder arrayBuilder = new ArrayBuilder();
        arrayBuilder.add(2, 0, 10);
        arrayBuilder.add(1, 20);
        int[] myArray = arrayBuilder.getArray();
        int[] expectedResult = new int[2];

        expectedResult[0] = 10;
        expectedResult[1] = 20;

        assertThat(myArray).containsExactly(expectedResult);
        assertThat(myArray).hasSize(2);
    }
}
