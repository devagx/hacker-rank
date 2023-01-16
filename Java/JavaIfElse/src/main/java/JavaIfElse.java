public class JavaIfElse {
    public JavaIfElse() {

    }
    public String getAnswer(int input) {
        if (input % 2 != 0) {
            return "Weird";
        } else if (input >= 2 && input <= 5) {
            return "Not Weird";
        } else if (input >= 6 && input <= 20) {
            return "Not Weird";
        } else if ((input > 20)) {
            return "Not Weird";
        }
        return "";
    }
}