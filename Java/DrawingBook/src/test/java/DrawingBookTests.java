import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DrawingBookTests {

    @Test
    void pageCount_totalPagesAndDestinationPageTheSame_returns0() {
        int totalPages = 1;
        int destinationPage = 1;

        int result = Result.pageCount(totalPages, destinationPage);

        assertThat(result).isZero();
    }

    @Test
    void pageCount_5TotalPagesWantingPage4_returns0() {
        int totalPages = 5;
        int destinationPage = 4;

        int result = Result.pageCount(totalPages, destinationPage);

        assertThat(result).isZero();
    }

    @Test
    void pageCount_5TotalPagesWantingPage1_returns1() {
        int totalPages = 5;
        int destinationPage = 1;

        int result = Result.pageCount(totalPages, destinationPage);

        assertThat(result).isZero();
    }

    @Test
    void pageCount_6TotalPagesWantingPage2_returns1() {
        int totalPages = 6;
        int destinationPage = 2;

        int result = Result.pageCount(totalPages, destinationPage);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void pageCount_7TotalPagesWantingPage3_returns1() {
        int totalPages = 7;
        int destinationPage = 3;

        int result = Result.pageCount(totalPages, destinationPage);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void pageCount_6TotalPagesWantingPage5_returns1() {
        int totalPages = 6;
        int destinationPage = 5;

        int result = Result.pageCount(totalPages, destinationPage);

        assertThat(result).isEqualTo(1);
    }
}
