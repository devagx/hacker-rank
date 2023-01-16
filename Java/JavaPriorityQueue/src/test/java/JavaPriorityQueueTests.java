import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class JavaPriorityQueueTests {
    @Test
    void getId_withStudentIdOf1_returns1() {
        Student student = new Student(1, "Dave", 1.1);

        assertThat(1).isEqualTo(student.getId());
    }

    @Test
    void getName_withStudentNameDave_returnsDave() {
        Student student = new Student(1, "Dave", 1.1);

        assertThat("Dave").isEqualTo(student.getName());
    }

    @Test
    void getCGPA_withStudentCgpa_returnsValidDouble() {
        Student student = new Student(1, "Dave", 1.1);

        assertThat(1.1).isEqualTo(student.getCGPA());
    }

    @Test
    void getStudentsToServe_emptyListOfEvents_returnsStringWithValueEmpty() {
        List<String> events = new ArrayList<>();

        Priorities priorities = new Priorities();
        List<Student> studentsYetToBeServed = priorities.getStudents(events);

        assertThat(studentsYetToBeServed.get(0).getName()).isEqualTo("EMPTY");
        assertThat(studentsYetToBeServed.size()).isEqualTo(1);
    }

    @Test
    void getStudentsToServe_singleStudentEventAndNoServeCommands_returnsStudentNameFromEvent() {
        List<String> events = new ArrayList<>();

        events.add("1");
        events.add("ENTER" + " " + "John" + " " + "3.75" + " " + "50");

        Priorities priorities = new Priorities();
        List<Student> studentsYetToBeServed = priorities.getStudents(events);

        assertThat(studentsYetToBeServed.get(0).getName()).isEqualTo("John");
        assertThat(studentsYetToBeServed.size()).isEqualTo(1);
    }

    @Test
    void getStudentsToServe_multipleStudentEventsAndNoServeCommands_returnsStudentNamesFromEvents() {
        List<String> events = new ArrayList<>();

        events.add("2");
        events.add("ENTER" + " " + "John" + " " + "3.75" + " " + "50");
        events.add("ENTER" + " " + "Mark" + " " + "3.8" + " " + "24");

        Priorities priorities = new Priorities();
        List<Student> studentsYetToBeServed = priorities.getStudents(events);

        assertThat(studentsYetToBeServed.get(0).getName()).isEqualTo("Mark");
        assertThat(studentsYetToBeServed.get(1).getName()).isEqualTo("John");
        assertThat(studentsYetToBeServed.size()).isEqualTo(2);
    }

    @Test
    void getStudentsToServe_with2StudentEventsWith1ServeCommand_returns1StudentFromEventBasedOnCgpa() {
        List<String> events = new ArrayList<>();

        events.add("3");
        events.add("ENTER" + " " + "John" + " " + "3.75" + " " + "50");
        events.add("ENTER" + " " + "Mark" + " " + "3.8" + " " + "24");
        events.add("SERVED");

        Priorities priorities = new Priorities();
        List<Student> studentsYetToBeServed = priorities.getStudents(events);

        assertThat(studentsYetToBeServed.get(0).getName()).isEqualTo("John");
        assertThat(studentsYetToBeServed.size()).isEqualTo(1);
    }

    @Test
    void getStudentsToServe_with3StudentEventsWith1ServeCommand_returns2StudentFromEventBasedOnCgpa() {
        List<String> events = new ArrayList<>();

        events.add("4");
        events.add("ENTER" + " " + "John" + " " + "3.75" + " " + "50");
        events.add("ENTER" + " " + "Mark" + " " + "3.8" + " " + "24");
        events.add("ENTER" + " " + "Shafaet" + " " + "3.7" + " " + "35");
        events.add("SERVED");

        Priorities priorities = new Priorities();
        List<Student> studentsYetToBeServed = priorities.getStudents(events);

        assertThat(studentsYetToBeServed.get(0).getName()).isEqualTo("John");
        assertThat(studentsYetToBeServed.get(1).getName()).isEqualTo("Shafaet");
        assertThat(studentsYetToBeServed.size()).isEqualTo(2);
    }

    @Test
    void getStudentsToServe_with3StudentEventsWith2ServeCommand_returns2StudentFromEventBasedOnCgpa() {
        List<String> events = new ArrayList<>();

        events.add("5");
        events.add("ENTER" + " " + "John" + " " + "3.75" + " " + "50");
        events.add("ENTER" + " " + "Mark" + " " + "3.8" + " " + "24");
        events.add("ENTER" + " " + "Shafaet" + " " + "3.7" + " " + "35");
        events.add("SERVED");
        events.add("SERVED");

        Priorities priorities = new Priorities();
        List<Student> studentsYetToBeServed = priorities.getStudents(events);

        assertThat(studentsYetToBeServed.get(0).getName()).isEqualTo("Shafaet");
        assertThat(studentsYetToBeServed.size()).isEqualTo(1);
    }

    @Test
    void getStudentsToServe_withMixedStudentEventsAndMixedServeCommands_addSamiha_returnsCorrectStudentsFromEventsBasedOnCgpa() {
        List<String> events = new ArrayList<>();

        events.add("6");
        events.add("ENTER" + " " + "John" + " " + "3.75" + " " + "50");
        events.add("ENTER" + " " + "Mark" + " " + "3.8" + " " + "24");
        events.add("ENTER" + " " + "Shafaet" + " " + "3.7" + " " + "35");
        events.add("SERVED");
        events.add("SERVED");
        events.add("ENTER" + " " + "Samiha" + " " + "3.85" + " " + "36");

        Priorities priorities = new Priorities();
        List<Student> studentsYetToBeServed = priorities.getStudents(events);

        assertThat(studentsYetToBeServed.get(0).getName()).isEqualTo("Samiha");
        assertThat(studentsYetToBeServed.get(1).getName()).isEqualTo("Shafaet");
        assertThat(studentsYetToBeServed.size()).isEqualTo(2);
    }

    @Test
    void getStudentsToServe_withMixedStudentEventsAndMixedServeCommands_serveSamiha_returnsCorrectStudentsFromEventsBasedOnCgpa() {
        List<String> events = new ArrayList<>();

        events.add("7");
        events.add("ENTER" + " " + "John" + " " + "3.75" + " " + "50");
        events.add("ENTER" + " " + "Mark" + " " + "3.8" + " " + "24");
        events.add("ENTER" + " " + "Shafaet" + " " + "3.7" + " " + "35");
        events.add("SERVED");
        events.add("SERVED");
        events.add("ENTER" + " " + "Samiha" + " " + "3.85" + " " + "36");
        events.add("SERVED");

        Priorities priorities = new Priorities();
        List<Student> studentsYetToBeServed = priorities.getStudents(events);

        assertThat(studentsYetToBeServed.get(0).getName()).isEqualTo("Shafaet");
        assertThat(studentsYetToBeServed.size()).isEqualTo(1);
    }

    @Test
    void getStudentsToServe_withMixedStudentEventsAndMixedServeCommands_add4AdditionalStudents_returnsCorrectStudentsFromEventsBasedOnCgpa() {
        List<String> events = new ArrayList<>();

        events.add("11");
        events.add("ENTER" + " " + "John" + " " + "3.75" + " " + "50");
        events.add("ENTER" + " " + "Mark" + " " + "3.8" + " " + "24");
        events.add("ENTER" + " " + "Shafaet" + " " + "3.7" + " " + "35");
        events.add("SERVED");
        events.add("SERVED");
        events.add("ENTER" + " " + "Samiha" + " " + "3.85" + " " + "36");
        events.add("SERVED");
        events.add("ENTER" + " " + "Ashley" + " " + "3.9" + " " + "42");
        events.add("ENTER" + " " + "Maria" + " " + "3.6" + " " + "46");
        events.add("ENTER" + " " + "Anik" + " " + "3.95" + " " + "49");
        events.add("ENTER" + " " + "Dan" + " " + "3.95" + " " + "50");

        Priorities priorities = new Priorities();
        List<Student> studentsYetToBeServed = priorities.getStudents(events);

        assertThat(studentsYetToBeServed.get(0).getName()).isEqualTo("Anik");
        assertThat(studentsYetToBeServed.get(1).getName()).isEqualTo("Dan");
        assertThat(studentsYetToBeServed.get(2).getName()).isEqualTo("Ashley");
        assertThat(studentsYetToBeServed.get(3).getName()).isEqualTo("Shafaet");
        assertThat(studentsYetToBeServed.get(4).getName()).isEqualTo("Maria");
        assertThat(studentsYetToBeServed.size()).isEqualTo(5);
    }

    @Test
    void getStudentsToServe_withStudentsWithSameCgpa_returnStudentBasedOnAlphaOrderName() {
        List<String> events = new ArrayList<>();

        events.add("3");
        events.add("ENTER" + " " + "Dan" + " " + "3.95" + " " + "49");
        events.add("ENTER" + " " + "Anik" + " " + "3.95" + " " + "50");
        events.add("SERVED");

        Priorities priorities = new Priorities();
        List<Student> studentsYetToBeServed = priorities.getStudents(events);

        assertThat(studentsYetToBeServed.get(0).getName()).isEqualTo("Dan");
        assertThat(studentsYetToBeServed.size()).isEqualTo(1);
    }

    @Test
    void getStudentsToServe_withStudentsWithSameNameAndCGPA_returnStudentBasedOnIdAscOrder() {
        List<String> events = new ArrayList<>();

        events.add("4");
        events.add("ENTER" + " " + "Dan" + " " + "3.95" + " " + "49");
        events.add("ENTER" + " " + "Anik" + " " + "3.85" + " " + "50");
        events.add("ENTER" + " " + "Dan" + " " + "3.95" + " " + "30");
        events.add("SERVED");

        Priorities priorities = new Priorities();
        List<Student> studentsYetToBeServed = priorities.getStudents(events);

        assertThat(studentsYetToBeServed.get(0).getName()).isEqualTo("Dan");
        assertThat(studentsYetToBeServed.get(1).getName()).isEqualTo("Anik");
        assertThat(studentsYetToBeServed.size()).isEqualTo(2);
    }

    @Test
    void getStudentsToServe_withMixedStudentEventsAndMixedServeCommands_serveAnik_returnsCorrectStudentsFromEventsBasedOnCgpa() {
        List<String> events = new ArrayList<>();

        events.add("12");
        events.add("ENTER" + " " + "John" + " " + "3.75" + " " + "50");
        events.add("ENTER" + " " + "Mark" + " " + "3.8" + " " + "24");
        events.add("ENTER" + " " + "Shafaet" + " " + "3.7" + " " + "35");
        events.add("SERVED");
        events.add("SERVED");
        events.add("ENTER" + " " + "Samiha" + " " + "3.85" + " " + "36");
        events.add("SERVED");
        events.add("ENTER" + " " + "Ashley" + " " + "3.9" + " " + "42");
        events.add("ENTER" + " " + "Maria" + " " + "3.6" + " " + "46");
        events.add("ENTER" + " " + "Anik" + " " + "3.95" + " " + "49");
        events.add("ENTER" + " " + "Dan" + " " + "3.95" + " " + "50");
        events.add("SERVED");

        Priorities priorities = new Priorities();
        List<Student> studentsYetToBeServed = priorities.getStudents(events);

        for(Student student : studentsYetToBeServed) {
            System.out.println(student.getName());
        }


        assertThat(studentsYetToBeServed.get(0).getName()).isEqualTo("Dan");
        assertThat(studentsYetToBeServed.get(1).getName()).isEqualTo("Ashley");
        assertThat(studentsYetToBeServed.get(2).getName()).isEqualTo("Shafaet");
        assertThat(studentsYetToBeServed.get(3).getName()).isEqualTo("Maria");
        assertThat(studentsYetToBeServed.size()).isEqualTo(4);
    }

}
