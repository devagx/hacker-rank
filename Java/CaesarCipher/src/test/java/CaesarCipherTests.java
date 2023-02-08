import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CaesarCipherTests {
    @Test
    void caesarCipher_0RotationsOnlyAlphaChars_returnsInputString() {
        String input = "Hello";
        String expected = "Hello";

        String result = Result.caesarCipher(input, 0);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void caesarCipher_3RotationsOnlyAlphaChars_returnsCorrectString() {
        String input = "There";
        String expected = "Wkhuh";

        String result = Result.caesarCipher(input, 3);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void caesarCipher_3RotationsContainsAlphaAndNonAlphaChars_returnsCorrectString() {
        String input = "There's";
        String expected = "Wkhuh'v";

        String result = Result.caesarCipher(input, 3);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void caesarCipher_hackerRankExample1_returnsCorrectString() {
        String input = "There's-a-starman-waiting-in-the-sky";
        String expected = "Wkhuh'v-d-vwdupdq-zdlwlqj-lq-wkh-vnb";

        String result = Result.caesarCipher(input, 3);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void caesarCipher_hackerRankExample2_returnsCorrectString() {
        String input = "middle-Outz";
        String expected = "okffng-Qwvb";

        String result = Result.caesarCipher(input, 2);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void caesarCipher_hackerRankExample3_returnsCorrectString() {
        String input = "www.abc.xy";
        String expected = "fff.jkl.gh";

        String result = Result.caesarCipher(input, 87);

        assertThat(result).isEqualTo(expected);
    }
}
