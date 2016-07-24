/**
 * Created by ken-linux2 on 14/07/16.
 */
import com.sun.xml.internal.ws.*;

import java.io.*;
import java.io.Closeable;


public class CSVReader{
    public static void main(String[] args) {
        CSVReader RCF = new CSVReader();
        RCF.run();
    }

    private void run() {
        final String CSV_File = "/home/ken-linux2/Downloads/macycExampleFile.csv - macycExampleFile.csv.csv";
        BufferedReader br = null;
        String line;
        final String SAPERATOR = ",";
        String[] myFile;
        Account account=new Account();
        Product product=new Product();
        Channel channel=new Channel();
        AdGroup adGroup=new AdGroup();

        try {
            br = new BufferedReader(new FileReader(CSV_File));
            br.readLine();
            while ((line = br.readLine()) != null) {
                myFile = line.split(SAPERATOR,17);
                account.setName(myFile[6]);
                account.setVendorClass(myFile[12]);
                account.setId(returnAsLongIfNotNull(myFile[1]));

                adGroup.setEngine(myFile[8]);
                adGroup.setId(returnAsLongIfNotNull(myFile[3]));
                adGroup.setAdType(myFile[9]);
                adGroup.setTheme(myFile[11]);

                product.setId(null);
                product.setGroupId(returnAsLongIfNotNull(myFile[5]));
                product.setClass1(myFile[13]);
                product.setClass2(myFile[14]);
                product.setClass3(myFile[15]);
                product.setCta(myFile[16]);

                channel.setName(myFile[0]);
                product.setGroupId(returnAsLongIfNotNull(myFile[2]));
                channel.setAdGroup(adGroup);
                channel.setAccount(account);
                channel.setProduct(product);
                channel.setAdId(returnAsLongIfNotNull(myFile[4]));

               System.out.println();
        }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } try {
            br.close();
                } catch (IOException e) {
                    e.printStackTrace();
        }
        System.out.println("Done");
    }

    public Long returnAsLongIfNotNull(String id) {
        if(id.isEmpty())
            return null;
        Long idL=Long.valueOf(id);
        return idL;
    }
}