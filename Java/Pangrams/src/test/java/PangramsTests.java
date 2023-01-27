import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PangramsTests {

    @Test
    void pangrams_inputStringOf10Chars_returnStringIsNotPangram() {
        String input = "abcdefghij";

        String result = Result.pangrams(input);

        assertThat(result).isEqualTo("not pangram");
    }

    @Test
    void pangrams_inputStringOf26Chars_returnStringIsPangram() {
        String input = "abcdefghijklmnopqrstuvwxyz";

        String result = Result.pangrams(input);

        assertThat(result).isEqualTo("pangram");
    }

    @Test
    void pangrams_inputStringOf26CharsIncludingNonAlpha_returnStringIsNotPangram() {
        String input = "abcdefghijklmnopqrstuvwx1!";

        String result = Result.pangrams(input);

        assertThat(result).isEqualTo("not pangram");
    }

    @Test
    void pangrams_inputStringOfWordsNotValidPangram_returnStringIsNotPangram() {
        String input = "We promptly judged antique ivory buckles for the prize";

        String result = Result.pangrams(input);

        assertThat(result).isEqualTo("not pangram");
    }


    @Test
    void pangrams_inputStringOfWordsValidPangram_returnStringIsPangram() {
        String input = "We promptly judged antique ivory buckles for the next prize";

        String result = Result.pangrams(input);

        assertThat(result).isEqualTo("pangram");
    }

    @Test
    void pangrams_inputStringOfWordsIncludingUpperCaseValidPangram_returnStringIsPangram() {
        String input = "We promptly judged antique IVORY buckles for the next prize";

        String result = Result.pangrams(input);

        assertThat(result).isEqualTo("pangram");
    }
}