import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class MinMaxSumTests {
    private final PrintStream standardOutput = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setup() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOutput);
    }

    @Test
    void miniMaxSum_listOfIntegers_printsSingleLine() {
        List<Integer> randomIntList = new ArrayList<>();

        randomIntList.add(10);
        randomIntList.add(20);
        randomIntList.add(30);

        Result.miniMaxSum(randomIntList);

        List<String> captorValues = Arrays.stream(outputStreamCaptor.toString().split("\\r?\\n")).toList();

        assertThat(1).isEqualTo(captorValues.size());
    }

    @Test
    void minMaxSum_listOfIntegers_printsSingleLineWith2LongNumbersSpaceSeparated() {
        List<Integer> randomIntList = new ArrayList<>();

        randomIntList.add(10);
        randomIntList.add(20);
        randomIntList.add(30);

        Result.miniMaxSum(randomIntList);

        List<String> captorValues = Arrays.stream(outputStreamCaptor.toString().split("\\r?\\n")).toList();

        String[] captorValuesSplit = outputStreamCaptor.toString().trim().split(" ");

        for (String captorSplitValue : captorValuesSplit) {
            assertThat(isNumericLong(captorSplitValue)).isEqualTo(true);
        }

        assertThat(2).isEqualTo(captorValuesSplit.length);
        assertThat(1).isEqualTo(captorValues.size());
    }

    @Test
    void minMaxSum_listOfInts_returnsCorrectMinMaxSumTest1() {
        List<Integer> randomIntList = new ArrayList<>();

        randomIntList.add(1);
        randomIntList.add(3);
        randomIntList.add(5);
        randomIntList.add(7);
        randomIntList.add(9);

        Result.miniMaxSum(randomIntList);

        String[] captorValuesSplit = outputStreamCaptor.toString().trim().split(" ");

        assertThat(captorValuesSplit[0]).isEqualTo("16");
        assertThat(captorValuesSplit[1]).isEqualTo("24");
    }

    @Test
    void minMaxSum_listOfInts_returnsCorrectMinMaxSumTest2() {
        List<Integer> randomIntList = new ArrayList<>();

        randomIntList.add(1);
        randomIntList.add(2);
        randomIntList.add(3);
        randomIntList.add(4);
        randomIntList.add(5);

        Result.miniMaxSum(randomIntList);

        String[] captorValuesSplit = outputStreamCaptor.toString().trim().split(" ");

        assertThat(captorValuesSplit[0]).isEqualTo("10");
        assertThat(captorValuesSplit[1]).isEqualTo("14");
    }

    public static boolean isNumericLong(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            long l = Long.parseLong(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}



