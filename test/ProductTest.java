import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kenshoo-linux on 14/07/16.
 */

public class ProductTest {
    private Product classUnderTest;
    @Before
    public void setup() {
        classUnderTest = new Product();
    }

    @Test
    public void shoulReturnTheProductGroupIdThatWasSet() {
        classUnderTest.setProduct_group_id("MyProductGroupId");
        String actualProductGroupId = classUnderTest.getProduct_group_id();
        assertEquals("Product group id is not what expected", "MyProductGroupId", actualProductGroupId);
    }
    @Test
    public void shoulReturnTheProductClass1ThatWasSet() {
        classUnderTest.setProduct_class_1("MyProductClass1");
        String actualProductClass1 = classUnderTest.getProduct_class_1();
        assertEquals("product class 1 is not what expected", "MyProductClass1", actualProductClass1);
    }
    @Test
    public void shoulReturnTheProductClass2ThatWasSet() {
        classUnderTest.setProduct_class_2("MyProductClass2");
        String actualProductClass2 = classUnderTest.getProduct_class_2();
        assertEquals("product class 2 is not what expected", "MyProductClass2", actualProductClass2);
    }
    @Test
    public void shoulReturnTheProductClass3ThatWasSet() {
        classUnderTest.setProduct_class_3("MyProductClass3");
        String actualProductClass3 = classUnderTest.getProduct_class_3();
        assertEquals("product class 3 is not what expected", "MyProductClass3", actualProductClass3);
    }

    @Test
    public void shouldReturnTheCtaThatWasSet(){
        classUnderTest.setCta("MyCta");
        String actualCta = classUnderTest.getCta();
        assertEquals("cta is not what expected","MyCta",actualCta);
    }



}
