import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class AdGroupTest {
    private AdGroup classUnderTest;
    final private String TEST_MEMBER="testMember";
    final private Long TEST_ID= Long.valueOf(123456789);

    @Before
    public void setup() {
        classUnderTest = new AdGroup();
    }

    @Test
    public void shoulReturnTheAdTypeThatWasSet() {
        classUnderTest.setAdType(TEST_MEMBER);
        final String tstAdType = classUnderTest.getAdType();
        assertThat(TEST_MEMBER, is(tstAdType));
    }

    @Test
    public void shoulReturnTheEngineThatWasSet() {
        classUnderTest.setEngine(TEST_MEMBER);
        final String tstEngine = classUnderTest.getEngine();
        assertThat(TEST_MEMBER, is(tstEngine));
    }

    @Test
    public void shoulReturnTheTHemeThatWasSet() {
        classUnderTest.setTheme(TEST_MEMBER);
        final String tstThm = classUnderTest.getTheme();
        assertThat(TEST_MEMBER, is(tstThm));
    }

    @Test
    public void shoulReturnTheIdThatWasSet() {
        classUnderTest.setId(TEST_ID);
        final Long tstId = classUnderTest.getId();
        assertThat(TEST_ID, is(tstId));
    }
}
