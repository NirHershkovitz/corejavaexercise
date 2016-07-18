import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AdTest {
    private AdGroup classUnderTest;

    @Before
    public void setup() {
        classUnderTest = new AdGroup();
    }

    @Test
    public void shoulReturnTheAdTypeThatWasSet() {
        classUnderTest.setAdType("testAdType");
        String tstAdType = classUnderTest.getAdType();
        assertEquals("AdType if not what expected", "testAdType", tstAdType);
    }

    @Test
    public void shoulReturnTheEngineThatWasSet() {
        classUnderTest.setEngine("testEngine");
        String tstEngine = classUnderTest.getEngine();
        assertEquals("AdGroup engine if not what expected", "testEngine", tstEngine);
    }

}
