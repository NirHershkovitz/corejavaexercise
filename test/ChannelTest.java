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
        classUnderTest.setCampaignId("MyChannelCampaignId");
        String actualChannelCampaignId = classUnderTest.getCampaignId();
        assertEquals("channel campaign id name is not what expected", "MyChannelCampaignId", actualChannelCampaignId);
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
    public void shoulReturnTheChannelAdgroupIdThatWasSet() {
        classUnderTest.setAdgroupId("MyChannelAdgroupId");
        String actualChannelAdgroupId = classUnderTest.getAdgroupId();
        assertEquals("channel adgroup id is not what expected", "MyChannelAdgroupId", actualChannelAdgroupId);
    }


    @Test
    public void shoulReturnTheChannelAccountIdThatWasSet() {
        classUnderTest.setAccountId("MyChannelAccountId");
        String actualChannelAccountId = classUnderTest.getAccountId();
        assertEquals("channel account id is not what expected", "MyChannelAccountId", actualChannelAccountId);
    }

    @Test
    public void shouldThrowExceptionWhenSettingChannelAccountIdToNull() {
        try {
            classUnderTest.setAccountId(null);
            fail();
        } catch (RuntimeException e) {
            //Success
        }
    }
    @Test
    public void shoulReturnTheChannelAdIdThatWasSet() {
        classUnderTest.setAdId("MyChannelAdId");
        String actualChanneAdId = classUnderTest.getAdId();
        assertEquals("channel ad id is not what expected", "MyChannelAdId", actualChanneAdId);
    }


}