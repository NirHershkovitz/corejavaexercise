package dao;

import domain.AdGroup;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by kenshoo-linux on 01/08/16.
 */
public class AdGroupDao {
        public static final String INSERT_SQL = "INSERT INTO ad_group " +
                "(id, engine, type, theme) VALUES (?, ?, ?, ?)";

        public static final String SELECT_SQL = "SELECT * FROM ad_group WHERE id=? ";

        private JdbcTemplate jdbcTemplate;

        public AdGroupDao(JdbcTemplate jdbcTemplate) {
            this.jdbcTemplate = jdbcTemplate;
        }

        public void save(AdGroup adGroup)  {
            jdbcTemplate.update(INSERT_SQL, new Object[] { adGroup.getId(), adGroup.getEngine(),
                    adGroup.getType(), adGroup.getTheme()});
        }

        public AdGroup find(long id)  {
            RowMapper<AdGroup> rowMapper = new RowMapper() {
                @Override
                public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                    AdGroup adGroup= new AdGroup();
                    adGroup.setId(rs.getLong("id"));
                    adGroup.setEngine(rs.getString("engine"));
                    adGroup.setType(rs.getString("type"));
                    adGroup.setTheme(rs.getString("theme"));
                    return adGroup;
                }
            };
            return jdbcTemplate.queryForObject(SELECT_SQL, rowMapper, id);
        }
        public void delete (AdGroup adGroup){
            final String deleteSql = "DELETE FROM ad_group WHERE ID = ?";
            int rows = jdbcTemplate.update(deleteSql, adGroup.getId());
        }
}
