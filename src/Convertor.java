import domain.Account;
import domain.AdGroup;
import domain.Channel;
import domain.Product;

/**
 * Created by kenshoo-linux on 24/07/16.
 */
public class Convertor {

    private long tolongOrNull(String field)
    {
        if(!field.isEmpty())
            return Long.parseLong(field);
        return 0;
    }

    public Channel convertToChannel(String line, String separator) //move separator to field
    {
        String[] words = line.split(separator, 17);
        Channel channel = new Channel();
        Account account = new Account();
        AdGroup adGroup = new AdGroup();
        Product product = new Product();

        //domain.Account
        account.setId(words[1]);
        account.setName(words[6]);
        account.setVendorClass(words[12]);

        //domain.AdGroup
        adGroup.setId(tolongOrNull(words[3]));
        adGroup.setEngine(words[8]);
        adGroup.setType(words[9]);
        adGroup.setTheme(words[11]);

        //domain.Product
        product.setGroupId(words[5]);
        product.setClass1(words[13]);
        product.setClass2(words[14]);
        product.setClass3(words[15]);
        product.setCta(words[16]);

        //domain.Channel
        channel.setName(words[0]);
        channel.setCampaignId(tolongOrNull(words[2]));
        channel.setAdId(tolongOrNull(words[4]));
        channel.setAccount(account);
        channel.setAdGroup(adGroup);
        channel.setProduct(product);

        return channel;
    }
}
