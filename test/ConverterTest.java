import classDomain.Account;
import classDomain.AdGroup;
import classDomain.Channel;
import classDomain.Product;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
/**
 * Created by ken-linux2 on 25/07/16.
 */
public class ConverterTest {

   private Converter classUnderTest;

    @Before
    public void setup() {
        classUnderTest = new Converter();
    }

    @Test
    public void ActualChannel(){

        final Channel EXPECTED_CHANNEL=new Channel("Google",186307692L,
            new AdGroup("GOOGLE",null,"PLA",""),
            new Account("2831944540","WOMENS_ACCESSORIES","GOOGLE_WOMENS_ACCESSORIES_PLA"),
            new Product(null,null,"BRANDS","BRANDS","",""),null);

        final String STRING_TEST="Google,2831944540,186307692,,,,GOOGLE_WOMENS_ACCESSORIES_PLA,WOMENS_ACCESSORIES,GOOGLE,PLA,CENTER_CORE,,WOMENS_ACCESSORIES,BRANDS,BRANDS,,";

        final Channel CHANNEL= classUnderTest.returnLineAsChannel(STRING_TEST,",");
        assertThat(EXPECTED_CHANNEL, is(CHANNEL));
    }

}
