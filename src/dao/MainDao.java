package dao;

import domain.Account;
import domain.AdGroup;
import domain.Channel;
import domain.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Created by kenshoo-linux on 01/08/16.
 */
public class MainDao {


    public JdbcTemplate createJdbcTemplate(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/javaProject");
        dataSource.setUsername("root");
        dataSource.setPassword("root56");
        return new JdbcTemplate(dataSource);
    }

    JdbcTemplate jdbcTemplate = createJdbcTemplate();
    AccountDao accountDao = new AccountDao(jdbcTemplate);
    ProductDao productDao = new ProductDao(jdbcTemplate);
    AdGroupDao adGroupDao = new AdGroupDao(jdbcTemplate);
    ChannelDao channelDao = new ChannelDao(jdbcTemplate);

    public void save (Channel channel){
        accountDao.save(channel.getAccount());
        productDao.save(channel.getProduct());
        adGroupDao.save(channel.getAdGroup());
        channelDao.save(channel);//, channel.getAccount(), channel.getAdGroup(),channel.getProduct());
        final String INSERT_SQL = "INSERT INTO channel " +
                "(account_id, ad_group_id, product_group_id) VALUES (?, ?, ?)";
        jdbcTemplate.update(INSERT_SQL, new Object[] {channel.getAccount().getId(), channel.getAdGroup().getId(), channel.getProduct().getGroupId()});

    }

    public Channel find (String channelName) {
        Channel channel = channelDao.find(channelName);
        Account account = accountDao.find(channel.getAccount().getId());
        channel.setAccount(account);
        AdGroup adGroup = adGroupDao.find(channel.getAdGroup().getId());
        channel.setAdGroup(adGroup);
        Product product = productDao.find(channel.getProduct().getGroupId());
        channel.setProduct(product);
        return channel;
    }

    public void delete (Channel channel){
        accountDao.delete(channel.getAccount());
        adGroupDao.delete(channel.getAdGroup());
        productDao.delete(channel.getProduct());
        channelDao.delete(channel);
    }
}
