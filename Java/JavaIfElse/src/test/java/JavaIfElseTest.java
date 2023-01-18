
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class JavaIfElseTest {
    @Test
    void getAnswer_inputPositiveIntegerIsOdd_returnsWeird() {
        String answer = JavaIfElse.getAnswer(3);

        assertThat(answer).isEqualTo("Weird");
    }

    @Test
    void getAnswer_inputIsEvenAndGreaterThan20_returnsNotWeird() {
        String answer = JavaIfElse.getAnswer(24);

        assertThat(answer).isEqualTo("Not Weird");
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4})
    void getAnswer_inputIsEvenAndInInclusiveRange2To5_returnsNotWeird(int input) {
        String answer = JavaIfElse.getAnswer(input);

        assertThat(answer).isEqualTo("Not Weird");
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 8, 10, 12, 14, 16, 18, 20})
    void getAnswer_inputIsEvenAndInInclusiveRange6To20_returnsNotWeird(int input) {
        String answer = JavaIfElse.getAnswer(input);

        assertThat(answer).isEqualTo("Weird");
    }
}