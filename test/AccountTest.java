import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

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
        assertThat("myAccountName", is(actualAccountName));
    }


    @Test
    public void shouldReturnTheVendorClassThatWasSet() {
        classUnderTest.setVendorClass("myVendorClass");
        String actualVendorClass = classUnderTest.getVendorClass();
        assertThat("myVendorClass", is(actualVendorClass));
    }
    @Test
    public void shouldReturnTheIdThatWasSet(){
        classUnderTest.setId("125414512");
        String actualId = classUnderTest.getId();
        assertThat(actualId,is("125414512"));
    }

}
