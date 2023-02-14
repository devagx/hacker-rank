import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
class GridChallengeTests {
    @Test
    void gridChallenge_singleRow_returnsYES(){
        List<String> input = Arrays.asList("abcd");
        String result = Result.gridChallenge(input);

        assertThat(result).isEqualTo("YES");
    }

    @Test
    void gridChallenge_doubleRowCanNotBeOrdered_returnsNO(){
        List<String> input = Arrays.asList("hfge","bcad");
        String result = Result.gridChallenge(input);

        assertThat(result).isEqualTo("NO");
    }

    @Test
    void gridChallenge_tripleRowCanBeOrdered_returnsYES(){
        List<String> input = Arrays.asList("abc","ade", "efg");
        String result = Result.gridChallenge(input);

        assertThat(result).isEqualTo("YES");
    }

    @Test
    void gridChallenge_multipleRowCanBeOrdered_returnsYES(){
        List<String> input = Arrays.asList("eabcd","fghij", "olkmn", "trpqs", "xywuv");
        String result = Result.gridChallenge(input);

        assertThat(result).isEqualTo("YES");
    }

    @Test
    void gridChallenge_hackerRankTest1_returnsYES(){
        List<String> input = Arrays.asList("kc","iu");
        String result = Result.gridChallenge(input);

        assertThat(result).isEqualTo("YES");
    }

    @Test
    void gridChallenge_hackerRankTest2_returnsNO(){
        List<String> input = Arrays.asList("uxf","vof", "hmp");
        String result = Result.gridChallenge(input);

        assertThat(result).isEqualTo("NO");
    }
}


