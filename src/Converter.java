import classDomain.Account;
import classDomain.AdGroup;
import classDomain.Channel;
import classDomain.Product;

/**
 * Created by ken-linux2 on 24/07/16.
 */
public class Converter {



    public Channel returnLineAsChannel(String line,String separetor){
     String[] oneLine = line.split(separetor, 17);
     Account account=new Account(oneLine[1],oneLine[12],oneLine[6]);
     Product product=new Product(null,toLongOrNull(oneLine[5]),oneLine[13],oneLine[14],oneLine[15],oneLine[16]);
     AdGroup adGroup=new AdGroup(oneLine[8],toLongOrNull(oneLine[3]),oneLine[9],oneLine[11]);
     Channel channel=new Channel( oneLine[0],toLongOrNull(oneLine[2]),adGroup,account,product,toLongOrNull(oneLine[4]));
     return channel;
}
    public Long toLongOrNull(String field) {
        return !field.isEmpty()?Long.valueOf(field):null;
    }
}
