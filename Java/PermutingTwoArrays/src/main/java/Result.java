import java.util.Collections;
import java.util.List;

public class Result {
    private Result() {

    }

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {

        Collections.sort(A);
        Collections.reverse(B);

        int resultCountAasc = 0;

        for (int a = 0; a < A.size(); a++) {
            if ((A.get(a) + B.get(a) >= k)) {
                resultCountAasc++;
            }
        }

        Collections.reverse(A);
        Collections.sort(B);

        int resultCountBasc = 0;

        for (int a = 0; a < A.size(); a++) {
            if ((A.get(a) + B.get(a) >= k)) {
                resultCountBasc++;
            }
        }
        return ((resultCountAasc == A.size()) || (resultCountBasc == A.size())) ? "YES" : "NO";
    }
}
