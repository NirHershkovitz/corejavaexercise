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
    final private Long TEST_ID= Long.valueOf(123456789);

    @Before
    public void setup() {
        classUnderTest = new Channel();
    }

    @Test
    public void shoulReturnTheNameThatWasSet() {
        classUnderTest.setName(TEST_MEMBER);
        final String tstnm = classUnderTest.getName();
        assertThat("channel name if not what expected", TEST_MEMBER, is(tstnm));
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenSettingNameToNull() {
            classUnderTest.setName(null);
    }

    @Test
    public void shoulReturnTheChannelCampaignIdThatWasSet() {
        classUnderTest.setCampaignId(TEST_ID);
        final Long tstCmpnId = classUnderTest.getCampaignId();
        assertThat("ChannelCampaignId if not what expected", TEST_ID, is(tstCmpnId));
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenSettingChannelCampaignIdToNull() {
            classUnderTest.setCampaignId(null);
    }

    @Test
    public void shoulReturnTheChannelAdIdThatWasSet() {
        classUnderTest.setAdId(TEST_ID);
        final Long tstCnlAdId = classUnderTest.getAdId();
        assertThat(TEST_ID, is(tstCnlAdId));
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenSettingChannelAccountToNull() {
        classUnderTest.setAccount(null);
    }

    @Test
    public void shoulReturnTheAdGroupThatWasSet() {
        AdGroup adGroup=new AdGroup(TEST_MEMBER,TEST_ID,TEST_MEMBER,TEST_MEMBER);
        classUnderTest.setAdGroup(adGroup);
        final AdGroup tstAdGrpId = classUnderTest.getAdGroup();
        assertThat(adGroup, is(tstAdGrpId));
    }

    @Test
    public void shoulReturnTheAccountThatWasSet() {
        Account account=new Account(TEST_ID,TEST_MEMBER,TEST_MEMBER);
        classUnderTest.setAccount(account);
        final Account tstAcnt = classUnderTest.getAccount();
        assertThat(account, is(tstAcnt));
    }

    @Test
    public void shoulReturnTheProductThatWasSet() {
        Product product=new Product(TEST_ID,TEST_ID,TEST_MEMBER,TEST_MEMBER,TEST_MEMBER,TEST_MEMBER);
        classUnderTest.setProduct(product);
        final Product tstPrdct = classUnderTest.getProduct();
        assertThat(product, is(tstPrdct));
    }

}
