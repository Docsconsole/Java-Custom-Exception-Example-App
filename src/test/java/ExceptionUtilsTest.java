
import com.docsconsole.tutorials.userexception.exception.DepartmentNotFoundException;
import com.docsconsole.tutorials.userexception.exception.EmployeeNotFoundException;
import com.docsconsole.tutorials.userexception.util.ExceptionUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionUtilsTest {
    @Test
    public void getEmployeeTest() throws Exception {

        Exception exception = assertThrows(EmployeeNotFoundException.class, () -> {
            new ExceptionUtils().getEmployee(null);
        });
        String expectedMessage = "Employee is not existed with given id.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void getDepartmentTest() throws Exception {

        Exception exception = assertThrows(DepartmentNotFoundException.class, () -> {
            new ExceptionUtils().getDepartment(null);
        });
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, null);
    }
}
