import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Created by ken-linux2 on 12/07/16.
 */
public class ChannelTest {
    private Channel classUnderTest;
    final private String TEST_MEMBER="testMember";

    @Before
    public void setup() {
        classUnderTest = new Channel();
    }

    @Test
    public void shoulReturnTheNameThatWasSet() {
        classUnderTest.setName(TEST_MEMBER);
        final String tstmn = classUnderTest.getName();
        assertThat("channel name if not what expected", TEST_MEMBER, is(tstmn));
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenSettingNameToNull() {
            classUnderTest.setName(null);
    }

    @Test
    public void shoulReturnTheChannelCampaignIdThatWasSet() {
        classUnderTest.setCampaignId(TEST_MEMBER);
        final String tstCmpnId = classUnderTest.getCampaignId();
        assertThat("ChannelCampaignId if not what expected", TEST_MEMBER, is(tstCmpnId));
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenSettingChannelCampaignIdToNull() {
            classUnderTest.setCampaignId(null);
    }

    @Test
    public void shoulReturnTheChannelAdIdThatWasSet() {
        classUnderTest.setAdId(TEST_MEMBER);
        final String tstCnlAdId = classUnderTest.getAdId();
        assertThat(TEST_MEMBER, is(tstCnlAdId));
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenSettingChannelAccountIdToNull() {
        classUnderTest.setAccountId(null);
    }
}
