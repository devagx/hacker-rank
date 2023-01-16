package OneDArray;

public class ArrayBuilder {
    private int[] result;

    public ArrayBuilder() {
    }

    public void add(int count, int position, int value) {
        result = new int[count];
        result[position] = value;

    }

    public void add(int position, int value) {
        result[position] = value;
    }

    public int[] getArray() {
        return result;
    }
}
