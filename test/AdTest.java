/**
 * Created by kenshoo-linux on 14/07/16.
 */
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by ken-linux2 on 13/07/16.
 */
public class AdTest {
    private Ad classUnderTest;

    @Before
    public void setup() {
        classUnderTest = new Ad();
    }

    @Test
    public void shouldReturnTheAdTypeThatWasSet() {
        classUnderTest.setType("MyAdType");
        String actualAdType = classUnderTest.getType();
        assertEquals("AdType is not what expected", "MyAdType", actualAdType);
    }

    @Test
    public void shouldReturnTheEngineThatWasSet() {
        classUnderTest.setEngine("MyEngine");
        String actualEngine = classUnderTest.getEngine();
        assertEquals("Ad engine is not what expected", "MyEngine", actualEngine);
    }

    @Test
    public void shouldReturnTheThemeThatWasSet(){
        classUnderTest.setTheme("MyTheme");
        String actualTheme = classUnderTest.getTheme();
        assertEquals("Theme is not what expected","MyTheme",actualTheme);
    }

}
