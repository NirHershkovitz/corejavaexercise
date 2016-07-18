/**
 * Created by kenshoo-linux on 14/07/16.
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
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
        assertEquals("channel name is not what expected", "MyName", actualName);
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
        classUnderTest.setChannel_campaign_id("MyChannelCampaignId");
        String actualChannelCampaignId = classUnderTest.getChannel_campaign_id();
        assertEquals("channel campaign id name is not what expected", "MyChannelCampaignId", actualChannelCampaignId);
    }

    @Test
    public void shouldThrowExceptionWhenSettingChannelCampaignIdToNull() {
        try {
            classUnderTest.setChannel_campaign_id(null);
            fail();
        } catch (RuntimeException e) {
            //Success
        }
    }
    @Test
    public void shoulReturnTheChannelAdgroupIdThatWasSet() {
        classUnderTest.setChannel_adgroup_id("MyChannelAdgroupId");
        String actualChannelAdgroupId = classUnderTest.getChannel_adgroup_id();
        assertEquals("channel adgroup id is not what expected", "MyChannelAdgroupId", actualChannelAdgroupId);
    }


    @Test
    public void shoulReturnTheChannelAccountIdThatWasSet() {
        classUnderTest.setChannel_account_id("MyChannelAccountId");
        String actualChannelAccountId = classUnderTest.getChannel_account_id();
        assertEquals("channel account id is not what expected", "MyChannelAccountId", actualChannelAccountId);
    }

    @Test
    public void shouldThrowExceptionWhenSettingChannelAccountIdToNull() {
        try {
            classUnderTest.setChannel_account_id(null);
            fail();
        } catch (RuntimeException e) {
            //Success
        }
    }
    @Test
    public void shoulReturnTheChannelAdIdThatWasSet() {
        classUnderTest.setChannel_ad_id("MyChannelAdId");
        String actualChanneAdId = classUnderTest.getChannel_ad_id();
        assertEquals("channel ad id is not what expected", "MyChannelAdId", actualChanneAdId);
    }


}