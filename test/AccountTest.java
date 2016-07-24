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
    final private Long TEST_ID = Long.valueOf(123456789);

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
        classUnderTest.setId(TEST_ID);
        final Long tstId=classUnderTest.getId();
        assertThat(TEST_ID, is(tstId));
    }

//    @Test
//    public void testEqual() {
//        Account tstAcnt=new Account();
//        boolean ansr=classUnderTest.equals(tstAcnt);
//        boolean rtrn=true;
//        assertEquals(rtrn,ansr);
//    }

}