import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Result {
    private Result() {
    }



    //Alternative solution

    public static String timeConversion(String s) throws ParseException {
        String time = s;
        String listTime[] = time.split(":");
        String hour = listTime[0];
        String minutes = listTime[1];
        String secounds = listTime[2].substring(0, 2);
        String caser = listTime[2].substring(2, 4);
        if(caser.equals("AM")){
            if(hour.equals("12"))
                hour="00";

            return hour+":"+minutes+":"+secounds;
        }else{
            if(!hour.equals("12")){
                int h = Integer.parseInt(hour);
                h = h + 12;
                hour = String.valueOf(h);
            }
            return hour+":"+minutes+":"+secounds;
        }
    }
}
