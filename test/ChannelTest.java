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
        classUnderTest.setName("testName");
        String tstmn = classUnderTest.getName();
        assertEquals("channel name if not what expected", "testName", tstmn);
    }

    @Test
    public void shouldThrowExceptionWhenSettingNameToNull()
    {
        try {
            classUnderTest.setName(null);
            fail();
        }
        catch (RuntimeException e){
            //Success
        }
    }

    @Test
    public void shoulReturnTheChannelCampaignIdThatWasSet() {
        classUnderTest.setChannel_campaign_id("testChannelCampaignId");
        String tstCmpnId = classUnderTest.getChannel_campaign_id();
        assertEquals("ChannelCampaignId if not what expected", "testChannelCampaignId", tstCmpnId);
    }

    @Test
    public void shouldThrowExceptionWhenSettingChannelCampaignIdToNull()
    {
        try {
            classUnderTest.setChannel_campaign_id(null);
            fail();
        }
        catch (RuntimeException e){
            //Success
        }
    }

    @Test
    public void shoulReturnTheChannelAdIdThatWasSet() {
        classUnderTest.setChannel_ad_id("testChannelAdId");
        String tstCnlAdId = classUnderTest.getChannel_ad_id();
        assertEquals("ChannelAdId if not what expected", "testChannelAdId", tstCnlAdId);
    }

    @Test
    public void shouldThrowExceptionWhenSettingChannelAccountIdToNull()
    {
        try {
            classUnderTest.setChannel_account_id(null);
            fail();
        }
        catch (RuntimeException e){
            //Success
        }
    }
}
