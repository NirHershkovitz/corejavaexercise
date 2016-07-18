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
        classUnderTest.setName(TEST_MEMBER);
        final String tstavndrCls=classUnderTest.getName();
        assertThat(TEST_MEMBER, is(tstavndrCls));
    }

//    @Test
//    public void testEqual() {
//        Account tstAcnt=new Account();
//        boolean ansr=classUnderTest.equals(tstAcnt);
//        boolean rtrn=true;
//        assertEquals(rtrn,ansr);
//    }

}
