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

    final Converter CONVERTER = new Converter();
    Channel channel=new Channel();

    public void run() {
        final String CSV_File = "/home/ken-linux2/Downloads/macycExampleFile.csv - macycExampleFile.csv.csv";
        BufferedReader br = null;
        String line;
        final String SAPERATOR = ",";
        String[] myFile;
        try {
            br = new BufferedReader(new FileReader(CSV_File));
            br.readLine();
            while ((line = br.readLine()) != null) {
                myFile = line.split(SAPERATOR,17);
                channel= CONVERTER.returnLineAsChannel(myFile);
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
}