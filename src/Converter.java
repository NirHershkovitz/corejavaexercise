import java.util.Objects;

/**
 * Created by ken-linux2 on 24/07/16.
 */
public class Converter {

    Account account=new Account();
    Product product=new Product();
    Channel channel=new Channel();
    AdGroup adGroup=new AdGroup();

    public Channel returnLineAsChannel(String oneLine[]){
//        System.out.print(oneLine);
    setAccountData(oneLine[6],oneLine[12],oneLine[1]) ;
    setProductData(null,oneLine[5],oneLine[13],oneLine[14],oneLine[15],oneLine[16]);
    setAdGroupData(oneLine[8],oneLine[3],oneLine[9],oneLine[11]);
    setChannelData(oneLine[0],oneLine[2],oneLine[4]);

    return channel;
}

    public void setAccountData(String name,String vendorClass,String id){
        account.setName(name);
        account.setVendorClass(vendorClass);
        account.setId(id);
    }

    public void setProductData(Long id,String groupId,String class1,String class2,String class3,String cta){
        product.setId(id);
        product.setGroupId(returnAsLongIfNotNull(groupId));
        product.setClass1(class1);
        product.setClass2(class2);
        product.setClass3(class3);
        product.setCta(cta);
    }

    public void setAdGroupData(String engine,String id,String adType,String theme){
        adGroup.setEngine(engine);
        adGroup.setId(returnAsLongIfNotNull(id));
        adGroup.setAdType(adType);
        adGroup.setTheme(theme);
    }

    public void setChannelData(String name,String groupId,String adId){
        channel.setName(name);
        channel.setCampaignId(returnAsLongIfNotNull(groupId));
        channel.setAdGroup(adGroup);
        channel.setAccount(account);
        channel.setProduct(product);
        channel.setAdId(returnAsLongIfNotNull(adId));
    }

    public Long returnAsLongIfNotNull(String id) {
        if(id.isEmpty())
            return null;
        Long idL=Long.valueOf(id);
        return idL;
    }
}
