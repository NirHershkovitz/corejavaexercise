/**
 * Created by kenshoo-linux on 14/07/16.
 */
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Created by ken-linux2 on 12/07/16.
 */

public class ChannelTest {
    private Channel classUnderTest;

    @Before
    public void setup() {
        classUnderTest = new Channel();
    }

    @Test
    public void shouldReturnTheNameThatWasSet() {
        classUnderTest.setName("MyName");
        String actualName = classUnderTest.getName();
        assertThat("MyName", is(actualName));
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
    @Test
    public void shouldReturnTheChannelCampaignIdThatWasSet() {
        classUnderTest.setCampaignId((long)1234567890);
        long actualChannelCampaignId = classUnderTest.getCampaignId();
        assertThat((long) 1234567890, is(actualChannelCampaignId));
    }

    @Test
    public void shouldThrowExceptionWhenSettingChannelCampaignIdToNull() {
        try {
            classUnderTest.setCampaignId(Long.parseLong(null));
            fail();
        } catch (RuntimeException e) {
            //Success
        }
    }
    @Test
    public void shouldReturnTheChannelAdgroupThatWasSet() {
        final AdGroup myAdGroup = new AdGroup((long)1234567890,"MyEngine","MyTheme","MyType");
        classUnderTest.setAdGroup(myAdGroup);
        AdGroup actualChannelAdgroup = classUnderTest.getAdGroup();
        assertThat(actualChannelAdgroup,is(myAdGroup));
    }


    @Test
    public void shouldReturnTheChannelAccountThatWasSet() {
        final Account myAccount =new Account("123456789","MyName","MyVendorClass");
        classUnderTest.setAccount(myAccount);
        Account actualChannelAccount = classUnderTest.getAccount();
        assertThat(myAccount, is(actualChannelAccount));
    }

    /*@Test
    public void shouldThrowExceptionWhenSettingChannelAccountToNull() {
        try {
            classUnderTest.setAccount(null);
            fail();
        } catch (RuntimeException e) {
            //Success
        }
    }*/

    @Test
    public void shouldReturnTheChannelAdIdThatWasSet() {
        classUnderTest.setAdId((long)1234567890);
        long actualChanneAdId = classUnderTest.getAdId();
        assertThat((long)1234567890, is(actualChanneAdId));
    }

    @Test
    public void shouldReturnTheProductThatwasSet(){
        final Product myProduct = new Product("MyGroupId","Class1","Class2","Class3","MyCta");
        classUnderTest.setProduct(myProduct);
        Product actualProduct = classUnderTest.getProduct();
        assertThat(actualProduct,is(myProduct));
    }


}