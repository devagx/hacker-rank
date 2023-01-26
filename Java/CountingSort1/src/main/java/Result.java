import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Result {

    private Result() {

    }

    public static List<Integer> countingSort(List<Integer> inputArray) {

        List<Integer> outputArray = new ArrayList<>();

        int o = 0;

        while (o < 100) {
            outputArray.add(0);
            o++;
        }

        inputArray.forEach(val -> {
            outputArray.set(val, outputArray.get(val) + 1);
        });

        return outputArray;
    }
}

/*
--  Sort input array inc
-- create outputArray with size of last position of input array

--LOOP INPUT ARRAY
    -set value of output array at position i with value of input array at position i
 */
