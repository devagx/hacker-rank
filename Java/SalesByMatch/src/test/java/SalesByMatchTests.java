import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SalesByMatchTests {
    @Test
    void sockMerchant_noSocksEmptyArr_returnsZero() {
        List<Integer> socks = new ArrayList<>();

        int pairs = Result.sockMerchant(0, socks);

        assertThat(pairs).isZero();
    }

    @Test
    void sockMerchant_noPairs_returnsZero() {
        List<Integer> socks = new ArrayList<>(Arrays.asList(20, 10, 30, 40));

        int pairs = Result.sockMerchant(4, socks);

        assertThat(pairs).isZero();
    }

    @Test
    void sockMerchant_1Pair_returns1() {
        List<Integer> socks = new ArrayList<>(Arrays.asList(20, 10, 20, 40));

        int pairs = Result.sockMerchant(4, socks);

        assertThat(pairs).isEqualTo(1);
    }

    @Test
    void sockMerchant_2Pairs_returns2() {
        List<Integer> socks = new ArrayList<>(Arrays.asList(20, 10, 20, 40, 10));

        int pairs = Result.sockMerchant(5, socks);

        assertThat(pairs).isEqualTo(2);
    }

    @Test
    void sockMerchant_1PairWith1ExtraSockTheSame_returns1() {
        List<Integer> socks = new ArrayList<>(Arrays.asList(10, 20, 20, 20, 30));

        int pairs = Result.sockMerchant(5, socks);

        assertThat(pairs).isEqualTo(1);
    }

    @Test
    void sockMerchant_2PairWith1ExtraSockTheSame_returns2() {
        List<Integer> socks = new ArrayList<>(Arrays.asList(10, 10, 20, 40, 10, 20));

        int pairs = Result.sockMerchant(6, socks);

        assertThat(pairs).isEqualTo(2);
    }

    @Test
    void sockMerchant_2PairWith2ExtraSockTheSame_returns2() {
        List<Integer> socks = new ArrayList<>(Arrays.asList(10, 9, 20, 20, 10, 10, 20));

        int pairs = Result.sockMerchant(7, socks);

        assertThat(pairs).isEqualTo(2);
    }

    @Test
    void sockMerchant_1PairWith1ExtraSockTheSameAtStartOfArray_returns1() {
        List<Integer> socks = new ArrayList<>(Arrays.asList(8, 8, 8, 20, 30, 40, 50));

        int pairs = Result.sockMerchant(7, socks);

        assertThat(pairs).isEqualTo(1);
    }

    @Test
    void sockMerchant_1PairWith1ExtraSockTheSameAtEndOfArray_returns1() {
        List<Integer> socks = new ArrayList<>(Arrays.asList(8, 9, 10, 20, 30, 30, 30));

        int pairs = Result.sockMerchant(7, socks);

        assertThat(pairs).isEqualTo(1);
    }

    @Test
    void sockMerchant_hackerrankExample1_returns3() {
        List<Integer> socks = new ArrayList<>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));

        int pairs = Result.sockMerchant(9, socks);

        assertThat(pairs).isEqualTo(3);
    }

    @Test
    void sockMerchant_hackerrankExample2_returns50() {
        List<Integer> socks = new ArrayList<>(Arrays.asList(42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42));

        int pairs = Result.sockMerchant(100, socks);

        assertThat(pairs).isEqualTo(50);
    }

    @Test
    void sockMerchant_hackerrankExample3_returns30() {
        List<Integer> socks = new ArrayList<>(Arrays.asList(44, 55, 11, 15, 4, 72, 26, 91, 80, 14, 43, 78, 70, 75, 36, 83, 78, 91, 17, 17, 54, 65, 60, 21, 58, 98, 87, 45, 75, 97, 81, 18, 51, 43, 84, 54, 66, 10, 44, 45, 23, 38, 22, 44, 65, 9, 78, 42, 100, 94, 58, 5, 11, 69, 26, 20, 19, 64, 64, 93, 60, 96, 10, 10, 39, 94, 15, 4, 3, 10, 1, 77, 48, 74, 20, 12, 83, 97, 5, 82, 43, 15, 86, 5, 35, 63, 24, 53, 27, 87, 45, 38, 34, 7, 48, 24, 100, 14, 80, 54));

        int pairs = Result.sockMerchant(100, socks);

        assertThat(pairs).isEqualTo(30);
    }
}
