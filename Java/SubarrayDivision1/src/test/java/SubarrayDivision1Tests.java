import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SubarrayDivision1Tests {
    @Test
    void birthday_emptyList_returnsZero() {
        List<Integer> squares = new ArrayList<>();
        int result;
        int day = 1;
        int month = 2;

        result = Result.birthday(squares, day, month);

        assertThat(result).isZero();
    }

    @Test
    void birthday_daysAbove31AndValidMonths_returnsZero() {
        List<Integer> squares = List.of(2, 2, 1, 3, 2);
        int result;
        int day = 32;
        int month = 1;

        result = Result.birthday(squares, day, month);

        assertThat(result).isZero();
    }

    @Test
    void birthday_monthsAbove12AndValidDays_returnsZero() {
        List<Integer> squares = List.of(2, 2, 1, 3, 2);
        int result;
        int day = 31;
        int month = 13;

        result = Result.birthday(squares, day, month);

        assertThat(result).isZero();
    }

    @Test
    void birthday_daysZeroAndValidMonths_returnsZero() {
        List<Integer> squares = List.of(2, 2, 1, 3, 2);
        int result;
        int day = 0;
        int month = 5;

        result = Result.birthday(squares, day, month);

        assertThat(result).isZero();
    }

    @Test
    void birthday_monthsZeroAndValidDays_returnsZero() {
        List<Integer> squares = List.of(2, 2, 1, 3, 2);
        int result;
        int day = 5;
        int month = 0;

        result = Result.birthday(squares, day, month);

        assertThat(result).isZero();
    }

    @Test
    void birthday_daysAndMonthsValidWithLengthOf1And1Match_return1() {
        List<Integer> squares = List.of(1, 3, 5, 6, 7);
        int result;
        int day = 5;
        int month = 1;

        result = Result.birthday(squares, day, month);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void birthday_daysAndMonthsValidWithLengthOf1And2Matches_return2() {
        List<Integer> squares = List.of(1, 3, 5, 6, 5);
        int result;
        int day = 5;
        int month = 1;

        result = Result.birthday(squares, day, month);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void birthday_daysAndMonthsValidWithLengthOf2And1Match_return1() {
        List<Integer> squares = List.of(3, 1);
        int result;
        int day = 4;
        int month = 2;

        result = Result.birthday(squares, day, month);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void birthday_daysAndMonthsValidWithLengthOf2And1MatchInMiddleOfArray_return1() {
        List<Integer> squares = List.of(3, 4, 2, 2, 4, 5);
        int result;
        int day = 4;
        int month = 2;

        result = Result.birthday(squares, day, month);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void birthday_daysAndMonthsValidWithLengthOf2And1MatchAtEndOfArray_return1() {
        List<Integer> squares = List.of(3, 4, 2, 3, 3, 1);
        int result;
        int day = 4;
        int month = 2;

        result = Result.birthday(squares, day, month);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void birthday_daysAndMonthsValidWithLengthOf2And2Matches_return2() {
        List<Integer> squares = List.of(3, 2, 2, 3, 3, 1);
        int result;
        int day = 4;
        int month = 2;

        result = Result.birthday(squares, day, month);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void birthday_daysAndMonthsValidWithLengthOf3And1Match_return1() {
        List<Integer> squares = List.of(3, 2, 1, 1, 3, 1);
        int result;
        int day = 4;
        int month = 3;

        result = Result.birthday(squares, day, month);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void birthday_daysAndMonthsValidWithLengthOf2And2Match_return2() {
        List<Integer> squares = List.of(2, 2, 1, 3, 2);
        int result;
        int day = 4;
        int month = 2;

        result = Result.birthday(squares, day, month);

        assertThat(result).isEqualTo(2);
    }
}
