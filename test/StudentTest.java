import org.junit.Before;
import org.junit.Test;
import  static org.junit.Assert.*;
/**
 * Created by nirh on 06/07/16.
 */
public class StudentTest {
    private Student classUnderTest;

    @Before
    public void setup() {
        classUnderTest = new Student();
    }

    @Test
    public void shouldReturnTheNameThatWasSet() {
        classUnderTest.setName("myname");
        String actual = classUnderTest.getName();
        assertEquals("student name if not what expected","myname", actual);
    }

    @Test
    public void shouldThrowExceptionWhenSettingNameToNull() {
        try {
            classUnderTest.setName(null);
            fail();
        } catch (RuntimeException e) {
            //Success
        }
    }
}