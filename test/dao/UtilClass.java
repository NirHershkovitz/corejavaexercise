package dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Created by kenshoo-linux on 02/08/16.
 */
public class UtilClass {
    public static JdbcTemplate setUp() throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/javaProject");
        dataSource.setUsername("root");
        dataSource.setPassword("root56");
        return new JdbcTemplate(dataSource);
    }
}
