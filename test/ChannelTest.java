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
        classUnderTest.setCampaignId("testChannelCampaignId");
        String tstCmpnId = classUnderTest.getCampaignId();
        assertEquals("ChannelCampaignId if not what expected", "testChannelCampaignId", tstCmpnId);
    }

    @Test
    public void shouldThrowExceptionWhenSettingChannelCampaignIdToNull()
    {
        try {
            classUnderTest.setCampaignId(null);
            fail();
        }
        catch (RuntimeException e){
            //Success
        }
    }

    @Test
    public void shoulReturnTheChannelAdIdThatWasSet() {
        classUnderTest.setAdId("testChannelAdId");
        String tstCnlAdId = classUnderTest.getAdId();
        assertEquals("ChannelAdId if not what expected", "testChannelAdId", tstCnlAdId);
    }

    @Test
    public void shouldThrowExceptionWhenSettingChannelAccountIdToNull()
    {
        try {
            classUnderTest.setAccountId(null);
            fail();
        }
        catch (RuntimeException e){
            //Success
        }
    }
}
