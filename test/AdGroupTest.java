/**
 * Created by kenshoo-linux on 14/07/16.
 */
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


/**
 * Created by ken-linux2 on 13/07/16.
 */
public class AdGroupTest {
    private AdGroup classUnderTest;

    @Before
    public void setup() {
        classUnderTest = new AdGroup();
    }

    @Test
    public void shouldReturnTheIdThatWasSet() {
        classUnderTest.setId((long)1234567890);
        long actualId = classUnderTest.getId();
        assertThat(actualId, is((long)1234567890));
    }

    @Test
    public void shouldReturnTheAdTypeThatWasSet() {
        classUnderTest.setType("MyAdType");
        String actualAdType = classUnderTest.getType();
        assertThat("MyAdType", is(actualAdType));
    }

    @Test
    public void shouldReturnTheEngineThatWasSet() {
        classUnderTest.setEngine("MyEngine");
        String actualEngine = classUnderTest.getEngine();
       assertThat("MyEngine", is(actualEngine));
    }

    @Test
    public void shouldReturnTheThemeThatWasSet(){
        classUnderTest.setTheme("MyTheme");
        String actualTheme = classUnderTest.getTheme();
        assertThat("MyTheme",is(actualTheme));
    }

}
