public class MyCalculator {
    public long power(int a, int b) throws Exception {
        if ((a < 0 || b < 0)) {
            throw new Exception("n or p should not be negative");
        } else if ((a == 0 && b == 0)) {
            throw new Exception("n and p should not be zero");
        }
        return (long) Math.pow(a, b);
    }
}
