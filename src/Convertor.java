/**
 * Created by kenshoo-linux on 24/07/16.
 */
public class Convertor {

    private long TolongOrNull(String field)
    {
        if(!field.isEmpty())
            return Long.parseLong(field);
        return 0;
    }

    public Channel convertToChannel(String line, String separator)
    {
        String[] words = line.split(separator, 17);
        Channel channel = new Channel();
        Account account = new Account();
        AdGroup adGroup = new AdGroup();
        Product product = new Product();

        //Account
        account.setId(words[1]);
        account.setName(words[6]);
        account.setVendorClass(words[12]);

        //AdGroup
        adGroup.setId(TolongOrNull(words[3]));
        adGroup.setEngine(words[8]);
        adGroup.setType(words[9]);
        adGroup.setTheme(words[11]);

        //Product
        product.setGroupId(words[5]);
        product.setClass1(words[13]);
        product.setClass2(words[14]);
        product.setClass3(words[15]);
        product.setCta(words[16]);

        //Channel
        channel.setName(words[0]);
        channel.setCampaignId(TolongOrNull(words[2]));
        channel.setAdId(TolongOrNull(words[4]));
        channel.setAccount(account);
        channel.setAdGroup(adGroup);
        channel.setProduct(product);

        return channel;
    }
}
