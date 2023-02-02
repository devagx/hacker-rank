import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class XORStrings2Tests {
    @Test
    void strings_xorStringsAreBothNumbers1or0OnlyEachLength7_returnsRandomStringLength7() {
        String input1 = "1010101";
        String input2 = "0101010";

        String result = Result.stringsXor(input1, input2);

        assertThat(result.length()).isEqualTo(7);
    }

    @Test
    void strings_input1ContainsInvalidCharsNumeric_returnsEmptyString() {
        String input1 = "1010012";
        String input2 = "0111010";

        String result = Result.stringsXor(input1, input2);

        assertThat(result.length()).isZero();
    }

    @Test
    void strings_input1ContainsInvalidCharsAlpha_returnsEmptyString() {
        String input1 = "101001A";
        String input2 = "0111010";

        String result = Result.stringsXor(input1, input2);

        assertThat(result.length()).isZero();
    }

    @Test
    void strings_input2ContainsInvalidCharsNumeric_returnsEmptyString() {
        String input1 = "1010010";
        String input2 = "0111012";

        String result = Result.stringsXor(input1, input2);

        assertThat(result.length()).isZero();
    }

    @Test
    void strings_input2ContainsInvalidCharsAlpha_returnsEmptyString() {
        String input1 = "1010010";
        String input2 = "01110B0";

        String result = Result.stringsXor(input1, input2);

        assertThat(result.length()).isZero();
    }

    @Test
    void strings_2validInputStrings_returnsCorrectXorString() {
        String input1 = "10101";
        String input2 = "00101";

        String result = Result.stringsXor(input1, input2);

        assertThat(result).isEqualTo("10000");
    }
}
