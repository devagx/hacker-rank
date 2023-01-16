import java.util.*;

public class Priorities {
    public Priorities() {

    }

    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pqStudentsYetToBeServed = new PriorityQueue<>(new StudentComparator());

        events.forEach((event) -> {
            String[] eventElements = event.split(" ");
            if (event.equals("SERVED")) {
                pqStudentsYetToBeServed.poll();
            } else if (eventElements[0].equals("ENTER")) {

                pqStudentsYetToBeServed.add(new Student(Integer.parseInt(eventElements[3]), eventElements[1], Double.parseDouble(eventElements[2])));
            }
        });

        List<Student> studentsYetToBeServed = new ArrayList<>();
        while (!pqStudentsYetToBeServed.isEmpty()) {
            studentsYetToBeServed.add(pqStudentsYetToBeServed.poll());
        }

        if (studentsYetToBeServed.size() == 0) {
            studentsYetToBeServed.add(new Student(-1, "EMPTY", 0.0));
        }

        return studentsYetToBeServed;
    }
}


