import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Result {
    private Result() {
    }

    public static String timeConversion(String s) throws ParseException {
        Date date = null;
        String output = null;

        DateFormat inputFormat = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");

        date = inputFormat.parse(s);
        output = outputFormat.format(date);

        return output;
    }
}
