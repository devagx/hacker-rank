import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private final static Priorities priorities = new Priorities();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> events = new ArrayList<>();
        int numEvents = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numEvents; i++) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.size() == 0) {
            System.out.println("EMPTY");
        } else {
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }
    }
}