package dao;

import domain.Account;
import domain.AdGroup;
import domain.Channel;
import domain.Product;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.junit.Assert.*;

/**
 * Created by kenshoo-linux on 02/08/16.
 */
public class MainDaoTest {
    public static final String NAME = "name1";
    private MainDao classUnderTest;
    Account account= new Account("1234567890","name1","vendor_class1");
    AdGroup adGroup= new AdGroup(1234567890, "engine1", "type1", "theme1");
    Product product= new Product("1234567890", "class1", "class2", "class3", "cta1");
    Channel channel = new Channel("name1", 123456789, adGroup, account, 987654321, product);

    @Before
    public void setUp() throws Exception {
        JdbcTemplate jdbcTemplate =UtilClass.setUp();
    }

    @Test
    public void shouldFindTheChannelThatWasSaved() {
        classUnderTest.save(channel);
        Channel result = classUnderTest.find(NAME);
        assertNotNull(result);
        assertNotSame(channel, result); //not same instance
        assertEquals(channel, result);  //but same content
    }

    @Test
    public void shouldCheckThatChannelWasDeleted(){
        classUnderTest.delete(channel);
        //Channel result = classUnderTest.find(channel.getName());
        assertNull(classUnderTest.find(channel.getName()));
        //assertNull(result);
    }

}