import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by kenshoo-linux on 14/07/16.
 */

public class AccountTest {
    private Account classUnderTest;
    @Before
    public void setup(){classUnderTest=new Account();}

    @Test
    public void shouldReturnTheAccountNameThatWasSet() {
        classUnderTest.setName("myAccountName");
        String actualAccountName = classUnderTest.getName();
        assertEquals("account name is not what expected", "myAccountName", actualAccountName);
    }


    @Test
    public void shouldReturnTheVendorClassThatWasSet() {
        classUnderTest.setVendorClass("myVendorClass");
        String actualVendorClass = classUnderTest.getVendorClass();
        assertEquals("Vendor class name is not what expected", "myVendorClass", actualVendorClass);
    }

}
