import org.junit.jupiter.api.Test;
import java.text.ParseException;

import static org.assertj.core.api.Assertions.assertThat;

class TimeConversionTests {
    @Test
    void timeConversion_amPmTimeInput_returnsSingleStringWithLengthGreaterThanZeroAndNotNull() throws ParseException {
        String result = Result.timeConversion("12:00:00PM");

        assertThat(result).isNotEmpty().isNotNull();
    }

    @Test
    void timeConversion_amPmTimeInput_returnsSingleStringWithNumbersOnly() throws ParseException {
        String result = Result.timeConversion("12:00:00PM");
        String[] resultSplit = result.split(":");

        for (String resultSplitVal : resultSplit) {
            assertThat(isNumericInt(resultSplitVal)).isTrue();
        }
    }

    @Test
    void timeConversion_amPmTimeInput_returnsSingleStringWithInCorrectFormat() throws ParseException {
        String result = Result.timeConversion("12:00:00PM");
        String[] resultSplit = result.split(":");

        assertThat(resultSplit).hasSize(3);
    }

    @Test
    void timeConversion_amPmTimeInput1_returnsCorrectHourMinuteSeconds() throws ParseException {
        String result = Result.timeConversion("01:30:40PM");

        assertThat(result).isEqualTo("13:30:40");
    }

    @Test
    void timeConversion_amPmTimeInput12pm_returnsCorrectMilitaryTime12() throws ParseException {
        String result = Result.timeConversion("12:00:00PM");

        assertThat(result).isEqualTo("12:00:00");
    }

    @Test
    void timeConversion_amPmTimeInput12am_returnsCorrectMilitaryTime00() throws ParseException {
        String result = Result.timeConversion("12:00:00AM");

        assertThat(result).isEqualTo("00:00:00");
    }

    private static boolean isNumericInt(String input) {
        if (input == null) {
            return false;
        }
        try {
            int i = Integer.parseInt(input);
        } catch (NumberFormatException nfm) {
            return false;
        }
        return true;
    }
}
