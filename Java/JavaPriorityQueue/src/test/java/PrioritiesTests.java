import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrioritiesTests {

    @Test
    void getStudents_GivenEmptyCollection_ReturnsEmptyCollection() {
        Priorities myPrioroties = new Priorities();
        List<Student> students = myPrioroties.getStudents(Collections.emptyList());
        assertThat(students).isEmpty();
    }

    @Test
    void getStudents_GivenCorrectSingleEvent_ReturnsListOfStudents_John() {
        Priorities myPrioroties = new Priorities();
        List<String> events = new ArrayList<>();
        events.add("ENTER John 3.75 50");
        List<Student> students = myPrioroties.getStudents(events);
        assertThat(students)
                .extracting(Student::getName)
                .containsExactly("John");
    }

    @Test
    void getStudents_GivenIncorrectSingleEvent_ReturnsEmptyCollection() {
        Priorities myPrioroties = new Priorities();
        List<String> events = new ArrayList<>();
        events.add("abc123");
        List<Student> students = myPrioroties.getStudents(events);
        assertThat(students).isEmpty();
    }

    @Test
    void getStudents_GivenCorrectMultiEvent_ReturnsListOfStudents_John_Shafaet() {
        Priorities myPrioroties = new Priorities();
        List<String> events = new ArrayList<>();
        events.add("ENTER John 3.75 50");
        events.add("ENTER Mark 3.8 24");
        events.add("ENTER Shafaet 3.7 35");
        events.add("SERVED");
        List<Student> students = myPrioroties.getStudents(events);
        assertThat(students)
                .extracting(Student::getName)
                .containsExactly("John", "Shafaet");
    }

    @Test
    void getStudents_GivenCorrectMultiEvent_ReturnsListOfStudents_Shafaet_a() {
        Priorities myPrioroties = new Priorities();
        List<String> events = new ArrayList<>();
        events.add("ENTER John 3.75 50");
        events.add("ENTER Mark 3.8 24");
        events.add("ENTER Shafaet 3.7 35");
        events.add("SERVED");
        events.add("SERVED");
        List<Student> students = myPrioroties.getStudents(events);
        assertThat(students)
                .extracting(Student::getName)
                .containsExactly("Shafaet");
    }

    @Test
    void getStudents_GivenCorrectMultiEvent_ReturnsListOfStudents_Shafaet_b() {
        Priorities myPrioroties = new Priorities();
        List<String> events = new ArrayList<>();
        events.add("ENTER John 3.75 50");
        events.add("ENTER Mark 3.8 24");
        events.add("ENTER Shafaet 3.7 35");
        events.add("SERVED");
        events.add("SERVED");
        events.add("ENTER Samiha 3.85 36");
        events.add("SERVED");
        List<Student> students = myPrioroties.getStudents(events);
        assertThat(students)
                .extracting(Student::getName)
                .containsExactly("Shafaet");
    }

    @Test
    void getStudents_GivenCorrectMultiEvent_ReturnsListOfStudents_Shafaet_Dan_Ashley_Shafaet_Maria() {
        Priorities myPrioroties = new Priorities();
        List<String> events = new ArrayList<>();
        events.add("ENTER John 3.75 50");
        events.add("ENTER Mark 3.8 24");
        events.add("ENTER Shafaet 3.7 35");
        events.add("SERVED");
        events.add("SERVED");
        events.add("ENTER Samiha 3.85 36");
        events.add("SERVED");
        events.add("ENTER Ashley 3.9 42");
        events.add("ENTER Maria 3.6 46");
        events.add("ENTER Anik 3.95 49");
        events.add("ENTER Dan 3.95 50");
        events.add("SERVED");
        List<Student> students = myPrioroties.getStudents(events);
        assertThat(students)
                .extracting(Student::getName)
                .containsExactly("Dan", "Ashley", "Shafaet", "Maria");
    }

    @Test
    void getStudents_GivenSameCGPA_ReturnsListOfStudents_Mark() {
        Priorities myPrioroties = new Priorities();
        List<String> events = new ArrayList<>();
        events.add("ENTER Mark 3.8 24");
        events.add("ENTER Alf 3.8 25");
        events.add("SERVED");
        List<Student> students = myPrioroties.getStudents(events);
        assertThat(students)
                .extracting(Student::getName)
                .containsExactly("Mark");
    }

    @Test
    void getStudents_GivenSameCGPAAndName_ReturnsListOfStudents_25() {
        Priorities myPrioroties = new Priorities();
        List<String> events = new ArrayList<>();
        events.add("ENTER Alf 3.8 24");
        events.add("ENTER Alf 3.8 25");
        events.add("SERVED");
        List<Student> students = myPrioroties.getStudents(events);
        assertThat(students)
                .extracting(Student::getID)
                .containsExactly(25);
    }
}




