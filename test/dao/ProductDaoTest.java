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

    @Before
    public void setUp() throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/javaProject");
        dataSource.setUsername("root");
        dataSource.setPassword("root56");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        classUnderTest = new ProductDao(jdbcTemplate);
    }

    @Test
    public void shouldFindTheProductThatWasSaved() {
        //final String SELECT_SQL = "DELETE FROM channel WHERE name=? ";
        Product product= new Product();
        product.setGroupId("1234567890");
        product.setClass1("class1");
        product.setClass2("class2");
        product.setClass3("class3");
        product.setCta("cta1");

        classUnderTest.save(product);
        Product result = classUnderTest.find(GROUP_ID);
        assertNotNull(result);

        assertNotSame(product, result); //not same instance
        assertEquals(product, result);  //but same content
        assertEquals(GROUP_ID, result.getGroupId());

    }
}