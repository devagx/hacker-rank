import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Priorities priorities = new Priorities();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String firstEvent = bufferedReader.readLine();

        if (!(firstEvent.isEmpty() || firstEvent == null) && isNumeric(firstEvent)) {
            int totalEvents = Integer.parseInt(firstEvent);

            List<String> events = new ArrayList<>();

            while (totalEvents-- != 0) {
                events.add(bufferedReader.readLine());
            }

            List<Student> studentsYetToBeServed = priorities.getStudents(events);

            for (Student student : studentsYetToBeServed) {
                System.out.println(student.getName());
            }
        }
        else{
            System.out.println("First event line must be numeric");
        }
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
