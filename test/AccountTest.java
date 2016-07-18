import org.junit.Before;
import org.junit.Test;

import  static org.junit.Assert.*;
/**
 * Created by ken-linux2 on 13/07/16.
 */
public class AccountTest {

    private Account classUnderTest;

    @Before
    public void setUp(){classUnderTest=new Account();}

    @Test
    public void shouldReturnTheAccountNameThatWasSet(){
        classUnderTest.setName("myAccountName");
        String tstaAcntNam=classUnderTest.getName();
        assertEquals("account name if not what expected","myAccountName", tstaAcntNam);
    }

    @Test
    public void shouldReturnTheVendorClassThatWasSet(){
        classUnderTest.setName("myVendorClass");
        String tstavndrCls=classUnderTest.getName();
        assertEquals("vendor class if not what expected","myVendorClass", tstavndrCls);
    }

//    @Test
//    public void testEqual() {
//        Account tstAcnt=new Account();
//        boolean ansr=classUnderTest.equals(tstAcnt);
//        boolean rtrn=true;
//        assertEquals(rtrn,ansr);
//    }

}
