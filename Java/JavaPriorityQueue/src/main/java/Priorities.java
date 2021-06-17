import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Priorities {
    public List<Student> getStudents(List<String> events) {
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < events.size(); i++) {
            String[] eventParts = events.get(i).split(" ");

            if (eventParts.length == 4 && eventParts[0].equals("ENTER")) {
                students.add(new Student(Integer.parseInt(eventParts[3]), eventParts[1], Double.parseDouble(eventParts[2])));
            }
            if (eventParts.length == 1 && eventParts[0].equals("SERVED")) {
                students.sort(Comparator.comparing(Student::getCGPA).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getID)
                );
                students.remove(0);
            }
        }
        return students;
    }
}
