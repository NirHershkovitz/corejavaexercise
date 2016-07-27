package testClassDomain;

import classDomain.Product;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import  static org.junit.Assert.*;
/**
 * Created by ken-linux2 on 13/07/16.
 */
public class ProductTest {

    private Product classUnderTest;
    final private String TEST_MEMBER="testMember";
    final private Long TEST_ID= Long.valueOf(123456789);
    @Before
    public void setUp(){classUnderTest=new Product();}

    @Test
    public void shouldReturnTheIdThatWasSet(){
        classUnderTest.setId(TEST_ID);
        final Long tstId=classUnderTest.getId();
        assertThat("Id if not what expected",TEST_ID, is(tstId));
    }

    @Test
    public void shouldReturnTheProductGroupIdThatWasSet(){
        classUnderTest.setGroupId(TEST_ID);
        final Long tstPrdctGrpId=classUnderTest.getGroupId();
        assertThat("product group id if not what expected",TEST_ID, is(tstPrdctGrpId));
    }

    @Test
     public void shouldReturnTheCtaThatWasSet(){
        classUnderTest.setCta(TEST_MEMBER);
        final String tstCta=classUnderTest.getCta();
        assertThat("Cta if not what expected",TEST_MEMBER, is(tstCta));
    }

    @Test
    public void shouldReturnTheClass1ThatWasSet(){
        classUnderTest.setClass1(TEST_MEMBER);
        final String tstCls1=classUnderTest.getClass1();
        assertThat("Class1 if not what expected", TEST_MEMBER, is(tstCls1));
    }

    @Test
    public void shouldReturnTheClass2ThatWasSet(){
        classUnderTest.setClass2(TEST_MEMBER);
        final String tstCls2=classUnderTest.getClass2();
        assertThat("Class2 if not what expected", TEST_MEMBER, is(tstCls2));
    }

    @Test
    public void shouldReturnTheClass3ThatWasSet(){
        classUnderTest.setClass3(TEST_MEMBER);
        final String tstCls3=classUnderTest.getClass3();
        assertThat("Class3 if not what expected",TEST_MEMBER, is(tstCls3));
    }
}
