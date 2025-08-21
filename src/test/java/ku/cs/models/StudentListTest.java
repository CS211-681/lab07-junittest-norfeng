package ku.cs.models;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;



class StudentListTest {
    private StudentList sl;

    @BeforeEach
    void intialize() {
        sl = new StudentList();
        sl.addNewStudent("6710451402", "Bell");
    }
    @Test
    void testFindStudentById(){
        sl.findStudentById("6710451402");
        assertEquals("Bell", sl.findStudentById("6710451402").getName());
    }

    @Test
    void testFilterByName(){
        StudentList filtered = sl.filterByName("Bell");
        assertEquals(1, filtered.getStudents().size());
    }

    @Test
    void testGiveScoreToId(){
        sl.giveScoreToId("6710451402", 100.0);
        assertEquals(100.0, sl.findStudentById("6710451402").getScore());
    }

    @Test
    void testViewGradeOfId(){
        sl.giveScoreToId("6710451402", 100.0);
        sl.viewGradeOfId("6710451402");
        assertEquals("A", sl.viewGradeOfId("6710451402"));
    }
}