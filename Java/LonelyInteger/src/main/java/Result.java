import java.util.List;
import java.util.Objects;

public class Result {
    private Result() {

    }

    public static int lonelyInteger(List<Integer> inputValues) {
        inputValues.sort(null);

        if (inputValues.size() == 1) {
            return inputValues.get(0);
        }

        for (int i = 0; i < inputValues.size(); i++) {
            if (i == 0) {
                if (!inputValues.get(i + 1).equals(inputValues.get(i))) {
                    return inputValues.get(i);
                }
            } else if (i == inputValues.size() - 1) {
                return inputValues.get(i);
            } else if (!(inputValues.get(i).equals(inputValues.get(i - 1))) &&
                    !Objects.equals(inputValues.get(i), inputValues.get(i + 1)) && (i != inputValues.size() - 1)) {
                return inputValues.get(i);
            }
        }
        return -1;
    }
}


