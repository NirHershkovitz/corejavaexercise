package dao;

import domain.Account;
import domain.Channel;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import static org.junit.Assert.*;

/**
 * Created by kenshoo-linux on 01/08/16.
 */
public class AccountDaoTest {

    public static final String ID = "1234567890";
    private AccountDao classUnderTest;
    Account account= new Account("1234567890","name1","vendor_class1");

    @Before
    public void setUp() throws Exception {
        JdbcTemplate jdbcTemplate =UtilClass.setUp();
        classUnderTest = new AccountDao(jdbcTemplate);
    }

    @Test
    public void shouldFindTheAccountThatWasSaved() {
        classUnderTest.save(account);
        Account result = classUnderTest.find(ID);
        assertNotNull(result);

        assertNotSame(account, result); //not same instance
        assertEquals(account, result);  //but same content

    }

    @Test
    public void shouldCheckThatAccountWasDeleted(){
        classUnderTest.delete(account);
        //Account result = classUnderTest.find(account.getId());
        //assertNull(result);
        assertNull(classUnderTest.find(account.getId()));

    }
}