import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PlusMinusTests {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setup() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /*  output stream is a shared static resource used by other parts of the system,
        we should take care of restoring it to its original state when our test terminates.
     */
    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void plusMinus_arrayOf4Ints_standardOutputPrints3ResultsIgnoringFirstElement() {
        List<Integer> arrInputInts = new ArrayList<>();

        arrInputInts.add(3); //indicates number of elements in input array
        arrInputInts.add(10);
        arrInputInts.add(20);
        arrInputInts.add(30);

        Result.plusMinus(arrInputInts);

        List<String> captorValues =
                Arrays.stream(outputStreamCaptor.toString().trim().split("\\r?\\n")).toList();

        assertThat(captorValues.size()).isEqualTo(3);
    }

    @Test
    void plusMinus_arrayOfInts_standardOutputPrints3ResultsTo6DecimalPlaces() {
        List<Integer> arrInputInts = new ArrayList<>();

        arrInputInts.add(2);
        arrInputInts.add(2);
        arrInputInts.add(1);
        arrInputInts.add(10);
        arrInputInts.add(12);

        Result.plusMinus(arrInputInts);

        List<String> captorValues = Arrays.stream(outputStreamCaptor.toString().trim().split("\\r?\\n")).toList();

        captorValues.forEach((value) -> {
                    int numDecimalPlaces = String.valueOf(value).replaceAll(".*\\.", "").length();
                    assertThat(numDecimalPlaces).isEqualTo(6);
                }
        );
        assertThat(captorValues.size()).isEqualTo(3);
    }

    @Test
    void plusMinus_arrayOfInts_standardOutputPrints3ResultsToCorrectRatiosTest1() {
        List<Integer> arrInputInts = new ArrayList<>();

        arrInputInts.add(5); //indicates number of elements in input array
        arrInputInts.add(1);
        arrInputInts.add(1);
        arrInputInts.add(0);
        arrInputInts.add(-1);
        arrInputInts.add(-1);

        Result.plusMinus(arrInputInts);

        List<String> captorValues =
                Arrays.stream(outputStreamCaptor.toString().trim().split("\\r?\\n")).toList();

        assertThat(captorValues.get(0)).isEqualTo("0.400000");
        assertThat(captorValues.get(1)).isEqualTo("0.400000");
        assertThat(captorValues.get(2)).isEqualTo("0.200000");
        assertThat(captorValues.size()).isEqualTo(3);
    }

    @Test
    void plusMinus_arrayOfInts_standardOutputPrints3ResultsToCorrectRatiosTest2() {
        List<Integer> arrInputInts = new ArrayList<>();

        arrInputInts.add(6); //indicates number of elements in input array
        arrInputInts.add(-4);
        arrInputInts.add(3);
        arrInputInts.add(-9);
        arrInputInts.add(0);
        arrInputInts.add(4);
        arrInputInts.add(1);

        Result.plusMinus(arrInputInts);

        List<String> captorValues =
                Arrays.stream(outputStreamCaptor.toString().trim().split("\\r?\\n")).toList();

        assertThat(captorValues.get(0)).isEqualTo("0.500000");
        assertThat(captorValues.get(1)).isEqualTo("0.333333");
        assertThat(captorValues.get(2)).isEqualTo("0.166667");
        assertThat(captorValues.size()).isEqualTo(3);
    }
}
