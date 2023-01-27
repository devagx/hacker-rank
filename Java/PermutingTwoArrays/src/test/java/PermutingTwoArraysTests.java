import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PermutingTwoArraysTests {
    @Test
    void twoArrays_validPermutation_returnsYes() {
        int k = 1;
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        a.add(0);
        a.add(1);

        b.add(0);
        b.add(2);

        String result = Result.twoArrays(k, a, b);

        assertThat(result).isEqualTo("YES");
    }

    @Test
    void twoArrays_invalidPermutation_returnsNo() {
        int k = 5;
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(2);
        a.add(1);

        b.add(3);
        b.add(3);
        b.add(3);
        b.add(4);

        String result = Result.twoArrays(k, a, b);

        assertThat(result).isEqualTo("NO");
    }
}

