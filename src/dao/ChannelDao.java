package dao;

import domain.Channel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by kenshoo-linux on 27/07/16.
 */
public class ChannelDao {
    public static final String INSERT_SQL = "INSERT INTO channelruth " +
            "(name, ad_id, campaign_id, account_id, ad_group_id, product_group_id) VALUES (?, ?, ?, ?, ?, ?)";
    public static final String SELECT_SQL = "SELECT * FROM channelruth WHERE name=? ";

    private JdbcTemplate jdbcTemplate;

    public ChannelDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Channel channel)  {
        jdbcTemplate.update(INSERT_SQL, new Object[] { channel.getName(),
                channel.getAdId(), channel.getCampaignId(), channel.getAccount().getId(),
                channel.getAdGroup().getId(), channel.getProduct().getGroupId()});
    }

    public Channel find(String id)  {
        RowMapper<Channel> rowMapper = new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                Channel channel = new Channel();
                channel.setName(rs.getString("name"));
                channel.setAdId(rs.getLong("ad_id"));
                channel.setCampaignId(rs.getLong("campaign_id"));
                //Still need to finish. Locate the right row from the Account, Product and AdGroup tables (& return objects);
                //through the main Dao.
//                channel.setAccount(account);
//                channel.setAdGroup(adGroup);
//                channel.setProduct(product);
                return channel;
            }
        };
        return jdbcTemplate.queryForObject(SELECT_SQL, rowMapper, id);
    }


    public void delete (Channel channel){
        final String deleteSql = "DELETE FROM channelruth WHERE NAME = ?";
        //Object[] params = { channel.getName() };
        int rows = jdbcTemplate.update(deleteSql, channel.getName());
    }
}
