public class Result {
    private Result() {

    }

    public static int pageCount(int totalPages, int destinationPage) {
        if (destinationPage == 1) {
            return 0;
        }
        if (totalPages - destinationPage == 1 && totalPages % 2 == 0) {
            return 1;
        }

        int numPagesToTurnFrom1 = (0 + destinationPage) / 2;
        int numPagesToTurnFromTotal = (totalPages - destinationPage) / 2;


        return Math.min(numPagesToTurnFrom1, numPagesToTurnFromTotal);
    }

    /*
    ALTERNATIVE SOLUTION

    public static int pageCount(int n, int p) {


        int totalPageTurnCountFromFront = n / 2;
        int targetPageTurnCountFromFront = p / 2;
        int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;

        return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack);
    }
     */
}
