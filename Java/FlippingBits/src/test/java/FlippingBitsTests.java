import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FlippingBitsTests {
    @ParameterizedTest
    @CsvSource({
            "2147483647, 2147483648, 4294967295",
            "1, 4294967294, 4294967295",
            "0, 4294967295, 4294967295",
    })
    void flippingBits_4294967295MinusInput_returnsOutput(long input, long output, long baseValue) {
        long result = baseValue - input;

        assertThat(result).isEqualTo(output);
    }

    @ParameterizedTest
    @CsvSource({
            "2147483647, 2147483648",
            "1, 4294967294",
            "0, 4294967295",
    })
    void flippingBits_4294967295MinusInputUsingFunction_returnsOutput(long input, long output) {
        long result = Result.flippingBits(input);

        assertThat(result).isEqualTo(output);
    }
}
