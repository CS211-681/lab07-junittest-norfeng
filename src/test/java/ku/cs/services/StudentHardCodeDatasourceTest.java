package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    @Test
    public void testReadData() {
        StudentHardCodeDatasource list = new StudentHardCodeDatasource();
        list.readData();
        StudentList l = new StudentList();
        l.addNewStudent("6710400001", "First");
        l.addNewStudent("6710400002", "Second");
        l.addNewStudent("6710400003", "Third");
        l.addNewStudent("6710400004", "Fourth");
        assertEquals(4, list.readData().getStudents().size());
    }
}