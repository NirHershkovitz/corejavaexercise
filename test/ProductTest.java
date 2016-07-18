import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import  static org.junit.Assert.*;
/**
 * Created by ken-linux2 on 13/07/16.
 */
public class ProductTest {

    private Product classUnderTest;

    @Before
    public void setUp(){classUnderTest=new Product();}

    @Test
    public void shouldReturnTheProductGroupIdThatWasSet(){
        classUnderTest.setGroupId("myProductGroupId");
        final String tstPrdctGrpId=classUnderTest.getGroupId();
        assertThat("product group id if not what expected", "myProductGroupId", is(tstPrdctGrpId));
    }

    @Test
    public void shouldReturnTheThemeThatWasSet(){
        classUnderTest.setTheme("myTheme");
        final String tstTheme=classUnderTest.getTheme();
        assertThat("theme if not what expected", "myTheme", is(tstTheme));
    }

    @Test
     public void shouldReturnTheCtaThatWasSet(){
        classUnderTest.setCta("myCta");
        final String tstCta=classUnderTest.getCta();
        assertThat("Cta if not what expected", "myCta", is(tstCta));
    }
}
