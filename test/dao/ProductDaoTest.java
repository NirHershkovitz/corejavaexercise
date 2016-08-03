package dao;

import domain.Account;
import domain.Product;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import static org.junit.Assert.*;

/**
 * Created by kenshoo-linux on 01/08/16.
 */
public class ProductDaoTest {
    public static final String GROUP_ID = "1234567890";
    private ProductDao classUnderTest;
    Product product= new Product("1234567890", "class1", "class2", "class3", "cta1");

    @Before
    public void setUp() throws Exception {
        JdbcTemplate jdbcTemplate =UtilClass.setUp();
        classUnderTest = new ProductDao(jdbcTemplate);
    }

    @Test
    public void shouldFindTheProductThatWasSaved() {
        classUnderTest.save(product);
        Product result = classUnderTest.find(GROUP_ID);
        assertNotNull(result);

        assertNotSame(product, result); //not same instance
        assertEquals(product, result);  //but same content
    }

    @Test
    public void shouldCheckThatProductWasDeleted(){
        classUnderTest.delete(product);
        Product result = classUnderTest.find(product.getGroupId());
        assertNull(result);
    }
}