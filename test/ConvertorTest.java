import domain.Account;
import domain.AdGroup;
import domain.Channel;
import domain.Product;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by kenshoo-linux on 25/07/16.
 */
public class ConvertorTest {
    private Convertor classUnderTest;

    @Before
    public void setup() {
        classUnderTest = new Convertor();
    }

    @Test
    public void shouldReturnChannel() {
        final String str="Google,2831944540,186307692,,,,GOOGLE_WOMENS_ACCESSORIES_PLA,WOMENS ACCESSORIES,GOOGLE,PLA,CENTER CORE,,,WOMENS ACCESSORIES,BRANDS,BRANDS,";
        Channel channel= new Channel();
        channel.setName("Google");
        channel.setAdId(0);
        channel.setCampaignId(186307692L);
        channel.setAccount(new Account("2831944540","GOOGLE_WOMENS_ACCESSORIES_PLA",""));
        channel.setAdGroup(new AdGroup(0,"GOOGLE","","PLA"));
        channel.setProduct(new Product("","WOMENS ACCESSORIES","BRANDS","BRANDS",""));
        Channel actualChannel= classUnderTest.convertToChannel(str);
        assertThat(channel, is(actualChannel));
    }
}
