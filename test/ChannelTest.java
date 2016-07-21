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
    public void shoulReturnTheNameThatWasSet() {
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
    public void shoulReturnTheChannelCampaignIdThatWasSet() {
        classUnderTest.setCampaignId("MyChannelCampaignId");
        String actualChannelCampaignId = classUnderTest.getCampaignId();
        assertThat( "MyChannelCampaignId", is(actualChannelCampaignId));
    }

    @Test
    public void shouldThrowExceptionWhenSettingChannelCampaignIdToNull() {
        try {
            classUnderTest.setCampaignId(null);
            fail();
        } catch (RuntimeException e) {
            //Success
        }
    }
    @Test
    public void shoulReturnTheChannelAdgroupThatWasSet() {
        final AdGroup myAdGroup = new AdGroup();
        myAdGroup.setTheme("MyTheme");
        myAdGroup.setType("MyType");
        myAdGroup.setEngine("MyEngine");
        classUnderTest.setAdGroup(myAdGroup);
        AdGroup actualChannelAdgroup = classUnderTest.getAdGroup();
        assertThat(actualChannelAdgroup,is(myAdGroup));
    }


    @Test
    public void shoulReturnTheChannelAccountIdThatWasSet() {
        final Account myAccount =new Account();
        myAccount.setName("MyName");
        myAccount.setVendorClass("MyVendorClass");
        classUnderTest.setAccount(myAccount);
        Account actualChannelAccountId = classUnderTest.getAccount();
        assertThat(myAccount, is(actualChannelAccountId));
    }

    @Test
    public void shouldThrowExceptionWhenSettingChannelAccountToNull() {
        try {
            classUnderTest.setAccount(null);
            fail();
        } catch (RuntimeException e) {
            //Success
        }
    }
    @Test
    public void shoulReturnTheChannelAdIdThatWasSet() {
        classUnderTest.setAdId("MyChannelAdId");
        String actualChanneAdId = classUnderTest.getAdId();
        assertThat("MyChannelAdId", is(actualChanneAdId));
    }


}