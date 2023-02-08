public class Result {
    private Result() {

    }

    public static int towerBreakers(int towers, int height) {
        return (towers % 2 == 0 || height == 1) ? 2 : 1;
    }
}
