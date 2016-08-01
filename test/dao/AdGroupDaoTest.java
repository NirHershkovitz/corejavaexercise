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

    @Before
    public void setUp() throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/javaProject");
        dataSource.setUsername("root");
        dataSource.setPassword("root56");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        classUnderTest = new AdGroupDao(jdbcTemplate);
    }

    @Test
    public void shouldFindTheAdGroupThatWasSaved() {
        //final String SELECT_SQL = "DELETE FROM channel WHERE name=? ";
        AdGroup adGroup= new AdGroup();
        adGroup.setId(1234567890);
        adGroup.setEngine("engine1");
        adGroup.setType("type1");
        adGroup.setTheme("theme1");

        classUnderTest.save(adGroup);
        AdGroup result = classUnderTest.find(ID);
        assertNotNull(result);

        assertNotSame(adGroup, result); //not same instance
        assertEquals(adGroup, result);  //but same content
        assertEquals(ID, result.getId());

    }

}