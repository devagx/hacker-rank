import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.getCGPA() < s2.getCGPA()) {
            return 1;
        } else if (s1.getCGPA() > s2.getCGPA()) {
            return -1;
        } else if (s1.getCGPA() == s2.getCGPA()) {
            return s1.getName().compareTo(s2.getName());
        }
        return 0;
    }
}
