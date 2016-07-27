package testClassDomain;

import classDomain.Account;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import  static org.junit.Assert.*;
/**
 * Created by ken-linux2 on 13/07/16.
 */
public class AccountTest {

    private Account classUnderTest;
    final private String TEST_MEMBER="testMember";

    @Before
    public void setUp(){classUnderTest=new Account();}

    @Test
    public void shouldReturnTheAccountNameThatWasSet(){
        classUnderTest.setName(TEST_MEMBER);
        final String tstaAcntNam=classUnderTest.getName();
        assertThat(TEST_MEMBER, is(tstaAcntNam));
    }

    @Test
    public void shouldReturnTheVendorClassThatWasSet(){
        classUnderTest.setVendorClass(TEST_MEMBER);
        final String tstavndrCls=classUnderTest.getVendorClass();
        assertThat(TEST_MEMBER, is(tstavndrCls));
    }

    @Test
    public void shouldReturnTheIdThatWasSet(){
        classUnderTest.setId(TEST_MEMBER);
        final String tstId=classUnderTest.getId();
        assertThat(TEST_MEMBER, is(tstId));
    }

//    @Test
//    public void testEqual() {
//        classDomain.Account tstAcnt=new classDomain.Account();
//        boolean ansr=classUnderTest.equals(tstAcnt);
//        boolean rtrn=true;
//        assertEquals(rtrn,ansr);
//    }

}