import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    @Test
    void Student_GivenValidValues_FieldsSetCorrectly() {
        Student myStudent = new Student(1,"Mike", 3.1);
        assertEquals(myStudent.getID(),1);
        assertEquals(myStudent.getName(),"Mike");
        assertEquals(myStudent.getCGPA(),3.1);
    }
}
