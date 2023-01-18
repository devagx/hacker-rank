import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SparseArraysTests {
    @Test
    void matchStrings_singleQueryAndSingleInputNotMatching_return1valueInArray() {
        List<String> inputStrings = new ArrayList<>();
        List<String> queryStrings = new ArrayList<>();

        inputStrings.add("ab");
        queryStrings.add("ba");

        List<Integer> result = Result.matchingStrings(inputStrings, queryStrings);

        assertThat(result.get(0)).isZero();
        assertThat(result.size()).isEqualTo(1);
    }

    @Test
    void matchStrings_singleQueryAndSingleInputMatching_return1valueInArray() {
        List<String> inputStrings = new ArrayList<>();
        List<String> queryStrings = new ArrayList<>();

        inputStrings.add("ab");
        queryStrings.add("ab");

        List<Integer> result = Result.matchingStrings(inputStrings, queryStrings);

        assertThat(result.get(0)).isEqualTo(1);
        assertThat(result.size()).isEqualTo(1);
    }

    @Test
    void matchStrings_singleQueryAnd2InputMatchingAnd1NotMatching_return1valueInArray() {
        List<String> inputStrings = new ArrayList<>();
        List<String> queryStrings = new ArrayList<>();

        inputStrings.add("ab");
        inputStrings.add("ab");
        inputStrings.add("de");

        queryStrings.add("ab");

        List<Integer> result = Result.matchingStrings(inputStrings, queryStrings);

        assertThat(result.get(0)).isEqualTo(2);
        assertThat(result.size()).isEqualTo(1);
    }

    @Test
    void matchStrings_2QueryAnd2InputMatching_return2valuesInArray() {
        List<String> inputStrings = new ArrayList<>();
        List<String> queryStrings = new ArrayList<>();

        inputStrings.add("ab");
        inputStrings.add("cd");

        queryStrings.add("ab");
        queryStrings.add("cd");

        List<Integer> result = Result.matchingStrings(inputStrings, queryStrings);

        assertThat(result.get(0)).isEqualTo(1);
        assertThat(result.get(1)).isEqualTo(1);

        assertThat(result.size()).isEqualTo(2);
    }

    @Test
    void matchStrings_2QueryAnd1InputMatching_return2valuesInArray() {
        List<String> inputStrings = new ArrayList<>();
        List<String> queryStrings = new ArrayList<>();

        inputStrings.add("ab");
        inputStrings.add("cd");

        queryStrings.add("ab");
        queryStrings.add("cde");

        List<Integer> result = Result.matchingStrings(inputStrings, queryStrings);

        assertThat(result.get(0)).isEqualTo(1);
        assertThat(result.get(1)).isZero();

        assertThat(result.size()).isEqualTo(2);
    }

    @Test
    void matchStrings_2QueryAnd2setsOfInputMatching3Times_return2valuesInArray() {
        List<String> inputStrings = new ArrayList<>();
        List<String> queryStrings = new ArrayList<>();

        inputStrings.add("ab");
        inputStrings.add("ab");
        inputStrings.add("cd");
        inputStrings.add("cd");

        queryStrings.add("ab");
        queryStrings.add("cd");

        List<Integer> result = Result.matchingStrings(inputStrings, queryStrings);

        assertThat(result.get(0)).isEqualTo(2);
        assertThat(result.get(1)).isEqualTo(2);

        assertThat(result.size()).isEqualTo(2);
    }

    @Test
    void matchStrings_2QueryAnd1InputMatching2Times_return2valuesInArray() {
        List<String> inputStrings = new ArrayList<>();
        List<String> queryStrings = new ArrayList<>();

        inputStrings.add("ab");
        inputStrings.add("ab");
        inputStrings.add("cde");

        queryStrings.add("ab");
        queryStrings.add("cd");

        List<Integer> result = Result.matchingStrings(inputStrings, queryStrings);

        assertThat(result.get(0)).isEqualTo(2);
        assertThat(result.get(1)).isZero();

        assertThat(result.size()).isEqualTo(2);
    }

    @Test
    void matchStrings_hackerRankSampleInput1_return3valuesInArray() {
        List<String> inputStrings = new ArrayList<>();
        List<String> queryStrings = new ArrayList<>();

        inputStrings.add("aba");
        inputStrings.add("baba");
        inputStrings.add("aba");
        inputStrings.add("xzxb");

        queryStrings.add("aba");
        queryStrings.add("xzxb");
        queryStrings.add("ab");

        List<Integer> result = Result.matchingStrings(inputStrings, queryStrings);

        assertThat(result.get(0)).isEqualTo(2);
        assertThat(result.get(1)).isEqualTo(1);
        assertThat(result.get(2)).isZero();

        assertThat(result.size()).isEqualTo(3);
    }

    @Test
    void matchStrings_hackerRankSampleInput2_return3valuesInArray() {
        List<String> inputStrings = new ArrayList<>();
        List<String> queryStrings = new ArrayList<>();

        inputStrings.add("def");
        inputStrings.add("de");
        inputStrings.add("fgh");

        queryStrings.add("de");
        queryStrings.add("lmn");
        queryStrings.add("fgh");

        List<Integer> result = Result.matchingStrings(inputStrings, queryStrings);

        assertThat(result.get(0)).isEqualTo(1);
        assertThat(result.get(1)).isZero();
        assertThat(result.get(2)).isEqualTo(1);

        assertThat(result.size()).isEqualTo(3);
    }

    @Test
    void matchStrings_hackerRankSampleInput3_return5valuesInArray() {
        List<String> inputStrings = new ArrayList<>();
        List<String> queryStrings = new ArrayList<>();

        inputStrings.add("abcde");
        inputStrings.add("sdaklfj");
        inputStrings.add("asdjf");
        inputStrings.add("na");
        inputStrings.add("basdn");
        inputStrings.add("sdaklfj");
        inputStrings.add("asdjf");
        inputStrings.add("na");
        inputStrings.add("asdjf");
        inputStrings.add("na");
        inputStrings.add("basdn");
        inputStrings.add("sdaklfj");
        inputStrings.add("asdjf");

        queryStrings.add("abcde");
        queryStrings.add("sdaklfj");
        queryStrings.add("asdjf");
        queryStrings.add("na");
        queryStrings.add("basdn");

        List<Integer> result = Result.matchingStrings(inputStrings, queryStrings);

        assertThat(result.get(0)).isEqualTo(1);
        assertThat(result.get(1)).isEqualTo(3);
        assertThat(result.get(2)).isEqualTo(4);
        assertThat(result.get(3)).isEqualTo(3);
        assertThat(result.get(4)).isEqualTo(2);

        assertThat(result.size()).isEqualTo(5);
    }
}
