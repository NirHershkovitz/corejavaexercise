package dao;

import domain.AdGroup;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import static org.junit.Assert.*;

/**
 * Created by kenshoo-linux on 01/08/16.
 */
public class AdGroupDaoTest {
    public static final long ID = 1234567890;
    private AdGroupDao classUnderTest;
    AdGroup adGroup= new AdGroup(1234567890, "engine1", "type1", "theme1");

    @Before
    public void setUp() throws Exception {
        JdbcTemplate jdbcTemplate =UtilClass.setUp();
        classUnderTest = new AdGroupDao(jdbcTemplate);
    }

    @Test
    public void shouldFindTheAdGroupThatWasSaved() {
        classUnderTest.save(adGroup);
        AdGroup result = classUnderTest.find(ID);
        assertNotNull(result);

        assertNotSame(adGroup, result); //not same instance
        assertEquals(adGroup, result);  //but same content
    }

    @Test
    public void shouldCheckThatAdGroupWasDeleted(){
        classUnderTest.delete(adGroup);
        AdGroup result = classUnderTest.find(adGroup.getId());
        assertNull(result);
    }

}