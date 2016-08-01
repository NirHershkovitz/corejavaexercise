package dao;

import domain.Account;
import domain.AdGroup;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by kenshoo-linux on 27/07/16.
 */
public class AccountDao {
    public static final String INSERT_SQL = "INSERT INTO account " +
            "(id, name, vendor_class) VALUES (?, ?, ?)";

    public static final String SELECT_SQL = "SELECT * FROM account WHERE id=? ";

    private JdbcTemplate jdbcTemplate;

    public AccountDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Account account)  {
        jdbcTemplate.update(INSERT_SQL, new Object[] { account.getId(), account.getName(),
                account.getVendorClass()});
    }

    public Account find(String id)  {
        RowMapper<Account> rowMapper = new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                Account account= new Account();
                account.setId(rs.getString("id"));
                account.setName(rs.getString("name"));
                account.setVendorClass(rs.getString("vendor_class"));
                return account;
            }
        };
        return jdbcTemplate.queryForObject(SELECT_SQL, rowMapper, id);
    }

    public void delete (Account account){
        final String deleteSql = "DELETE FROM account WHERE ID = ?";
        int rows = jdbcTemplate.update(deleteSql, account.getId());
    }
}
