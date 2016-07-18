import org.junit.Before;
import org.junit.Test;

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
        classUnderTest.setProductGroupId("myProductGroupId");
        String tstPrdctGrpId=classUnderTest.getProductGroupId();
        assertEquals("product group id if not what expected","myProductGroupId", tstPrdctGrpId);
    }

    @Test
    public void shouldReturnTheThemeThatWasSet(){
        classUnderTest.setTheme("myTheme");
        String tstTheme=classUnderTest.getTheme();
        assertEquals("theme if not what expected","myTheme", tstTheme);
    }

    @Test
     public void shouldReturnTheCtaThatWasSet(){
        classUnderTest.setCta("myCta");
        String tstCta=classUnderTest.getCta();
        assertEquals("Cta if not what expected","myCta", tstCta);
    }
}
