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
//    public static final String INSERT_SQL = "INSERT INTO channel " +
//            "(name, ad_id, campaign_id, ad_group_id, account_id, product_group_id) VALUES (?, ?, ?, ?, ?, ?)";
    public static final String INSERT_SQL = "INSERT INTO channel " +
            "(name, ad_id, campaign_id) VALUES (?, ?, ?)";
    public static final String SELECT_SQL = "SELECT * FROM channel WHERE name=? ";

    private JdbcTemplate jdbcTemplate;

    public ChannelDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Channel channel){
//        Account account = channel.getAccount();
//        AdGroup adGroup = channel.getAdGroup();
//        Product product = channel.getProduct();

        jdbcTemplate.update(INSERT_SQL, new Object[] { channel.getName(),
                channel.getAdId(), channel.getCampaignId()});
                //, account.getId(), adGroup.getId(), product.getGroupId()});
    }

    public Channel find(String channelName)  {
        RowMapper<Channel> rowMapper = new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                Channel channel = new Channel();
                channel.setName(rs.getString("name"));
                channel.setAdId(rs.getLong("ad_id"));
                channel.setCampaignId(rs.getLong("campaign_id"));

//                AccountDao accountDao = new AccountDao(jdbcTemplate);
//                Account account = accountDao.find(rs.getString("account_id"));
//                channel.setAccount(account);
//
//                ProductDao productDao = new ProductDao(jdbcTemplate);
//                Product product = productDao.find(rs.getString("product_group_id"));
//                channel.setProduct(product);
//
//                AdGroupDao adGroupDao = new AdGroupDao(jdbcTemplate);
//                AdGroup adGroup = adGroupDao.find(rs.getLong("ad_group_id"));
//                channel.setAdGroup(adGroup);
                return channel;
            }
        };
        try {
            return jdbcTemplate.queryForObject(SELECT_SQL, rowMapper, channelName);
        } catch (Exception e){
            return null;
        }
    }

    //Question: to get the channel as a channel or as a String (channelName)?
    public void delete (Channel channel){
        final String deleteSql = "DELETE FROM channel WHERE NAME = ?";
        int rows = jdbcTemplate.update(deleteSql, channel.getName());
    }
}
