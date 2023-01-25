import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DiagonalDifferenceTests {
    @Test
    void diagonalDifference_listOfListsNoNegativeNumbers_returnsAbsoluteDifference() {
        List<List<Integer>> listOfLists = new ArrayList<>();

        List<Integer> innerList = new ArrayList<>();

        innerList.add(1);
        innerList.add(2);
        innerList.add(3);

        listOfLists.add(innerList);

        List<Integer> innerList2 = new ArrayList<>();

        innerList2.add(4);
        innerList2.add(5);
        innerList2.add(6);

        listOfLists.add(innerList2);

        List<Integer> innerList3 = new ArrayList<>();

        innerList3.add(9);
        innerList3.add(8);
        innerList3.add(9);

        listOfLists.add(innerList3);


        int result = Result.diagonalDifference(listOfLists);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void diagonalDifference_listOfListsIncludingNegativeNumbers_returnsAbsoluteDifference() {
        List<List<Integer>> listOfLists = new ArrayList<>();

        List<Integer> innerList = new ArrayList<>();

        innerList.add(11);
        innerList.add(2);
        innerList.add(4);

        listOfLists.add(innerList);

        List<Integer> innerList2 = new ArrayList<>();

        innerList2.add(4);
        innerList2.add(5);
        innerList2.add(6);

        listOfLists.add(innerList2);

        List<Integer> innerList3 = new ArrayList<>();

        innerList3.add(10);
        innerList3.add(8);
        innerList3.add(-12);

        listOfLists.add(innerList3);


        int result = Result.diagonalDifference(listOfLists);

        assertThat(result).isEqualTo(15);
    }
}

