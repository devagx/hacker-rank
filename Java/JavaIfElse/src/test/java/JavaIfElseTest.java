
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class JavaIfElseTest {
    @Test
    void getAnswer_inputPositiveIntegerIsOdd_returnsWeird() {
        JavaIfElse javaIfElse = new JavaIfElse();
        String answer = javaIfElse.getAnswer(3);

        assertThat(answer).isEqualTo("Weird");
    }

    @Test
    void getAnswer_inputIsEvenAndGreaterThan20_returnsNotWeird() {
        JavaIfElse javaIfElse = new JavaIfElse();
        String answer = javaIfElse.getAnswer(24);

        assertThat(answer).isEqualTo("Not Weird");
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4})
    void getAnswer_inputIsEvenAndInInclusiveRange2To5_returnsNotWeird(int input) {
        JavaIfElse javaIfElse = new JavaIfElse();
        String answer = javaIfElse.getAnswer(input);

        assertThat(answer).isEqualTo("Not Weird");
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 8, 10, 12, 14, 16, 18, 20})
    void getAnswer_inputIsEvenAndInInclusiveRange6To20_returnsNotWeird(int input) {
        JavaIfElse javaIfElse = new JavaIfElse();
        String answer = javaIfElse.getAnswer(input);

        assertThat(answer).isEqualTo("Not Weird");
    }
}