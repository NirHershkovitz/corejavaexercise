package dao;

import domain.Account;
import domain.AdGroup;
import domain.Channel;
import domain.Product;
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

    public Channel find(String channelName)  {
        RowMapper<Channel> rowMapper = new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                Channel channel = new Channel();
                channel.setName(rs.getString("name"));
                channel.setAdId(rs.getLong("ad_id"));
                channel.setCampaignId(rs.getLong("campaign_id"));
                //Still need to finish. Locate the right row from the Account, Product and AdGroup tables (& return objects);
                //through the main Dao.
                Account account = new Account();
                account.setId(rs.getString("account_id"));
                channel.setAccount(account);

                Product product = new Product();
                product.setGroupId(rs.getString("product_group_id"));
                channel.setProduct(product);

                AdGroup adGroup = new AdGroup();
                adGroup.setId(rs.getLong("ad_group_id"));
                channel.setAdGroup(adGroup);
                return channel;
            }
        };
        return jdbcTemplate.queryForObject(SELECT_SQL, rowMapper, channelName);
    }

    //Question: to get the channel as a channel or as a String (channelName)?
    public void delete (Channel channel){
        final String deleteSql = "DELETE FROM channelruth WHERE NAME = ?";
        int rows = jdbcTemplate.update(deleteSql, channel.getName());
    }
}
