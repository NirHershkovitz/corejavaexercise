import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by kenshoo-linux on 24/07/16.
 */
public class CSVReaderTest {
    private CSVReader classUnderTest;

    @Before
    public void setup() {
        classUnderTest = new CSVReader();

    }

    @Test
    public void shouldSplitStringToArrayByComma()
    {
        //String testPath="home/kenshoo-linux/develop/projects/projectJava/my test csv file.csv";
        //classUnderTest.run(testPath);
        //String [] convertedStr = str.split(",", 17);
        //String actualString="";
        //for(int i=0;i<17;i++)
        //    actualString += convertedStr[i]+",";
        //assertThat(actualString, is(str));
    }


}
