public class Singleton {
    public String str;
    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }
}