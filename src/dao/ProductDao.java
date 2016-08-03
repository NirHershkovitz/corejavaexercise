package dao;

import domain.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by kenshoo-linux on 01/08/16.
 */
public class ProductDao {
    public static final String INSERT_SQL = "INSERT INTO product " +
            "(group_id, class_1, class_2, class_3, cta) VALUES (?, ?, ?, ?, ?)";

    public static final String SELECT_SQL = "SELECT * FROM product WHERE group_id= ? ";

    private JdbcTemplate jdbcTemplate;

    public ProductDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Product product)  {
        jdbcTemplate.update(INSERT_SQL, new Object[] { product.getGroupId(), product.getClass1(),
                product.getClass2(), product.getClass3(), product.getCta()});
    }

    public Product find(String groupId)  {
        RowMapper<Product> rowMapper = new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                Product product= new Product();
                product.setGroupId(rs.getString("group_id"));
                product.setClass1(rs.getString("class_1"));
                product.setClass2(rs.getString("class_2"));
                product.setClass3(rs.getString("class_3"));
                product.setCta(rs.getString("cta"));
                return product;
            }
        };
        try {
            return jdbcTemplate.queryForObject(SELECT_SQL, rowMapper, groupId);
        } catch (Exception e){
            return null;
        }
    }

    public void delete (Product product){
        final String deleteSql = "DELETE FROM product WHERE group_id = ?";
        int rows = jdbcTemplate.update(deleteSql, product.getGroupId());
    }
}
