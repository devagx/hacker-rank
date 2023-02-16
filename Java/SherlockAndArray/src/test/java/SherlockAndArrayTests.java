import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SherlockAndArrayTests {
    @Test
    void balancedSums_unbalancedArray_returnsNO() {
        List<Integer> input = Arrays.asList(1, 2, 3);

        String result = Result.balancedSums(input);

        assertThat(result).isEqualTo("NO");
    }

    @Test
    void balancedSums_balancedArray_returnsYES() {
        List<Integer> input = Arrays.asList(1, 2, 3, 3);

        String result = Result.balancedSums(input);

        assertThat(result).isEqualTo("YES");
    }
}
