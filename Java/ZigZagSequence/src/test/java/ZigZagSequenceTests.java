import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ZigZagSequenceTests {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setup() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void findZigZagSequence_arraySize7_printsArraySize7() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};

        Result.findZigZagSequence(input, 7);

        int[] result = Arrays.stream(outputStreamCaptor.toString().trim().split("\\s"))
                .mapToInt(Integer::parseInt).toArray();

        assertThat(result).hasSize(7);
    }

    @Test
    void findZigZagSequence_mixedArray_printsCorrectZigZagArray() {
        int input[] = {1, 2, 3, 4, 5, 6, 7};
        int expected[] = {1, 2, 3, 7, 6, 5, 4};

        Result.findZigZagSequence(input, 7);

        int[] result = Arrays.stream(outputStreamCaptor.toString().trim().split("\\s"))
                .mapToInt(Integer::parseInt).toArray();

        assertThat(result).isEqualTo(expected);
    }
}
