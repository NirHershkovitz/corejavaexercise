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

    @Before
    public void setUp() throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/javaProject");
        dataSource.setUsername("root");
        dataSource.setPassword("root56");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        classUnderTest = new AccountDao(jdbcTemplate);
    }

    @Test
    public void shouldFindTheAccountThatWasSaved() {
        //final String SELECT_SQL = "DELETE FROM channel WHERE name=? ";
        Account account= new Account();
        account.setId("1234567890");
        account.setName("name1");
        account.setVendorClass("vendor_class1");

        classUnderTest.save(account);
        Account result = classUnderTest.find(ID);
        assertNotNull(result);

        assertNotSame(account, result); //not same instance
        assertEquals(account, result);  //but same content
        assertEquals(ID, result.getId());

    }
}