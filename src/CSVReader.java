/**
 * Created by kenshoo-linux on 14/07/16.
 */
import java.io.*;


public class CSVReader{

    public static void main(String[] args) {

        CSVReader obj = new CSVReader();
        obj.run("/home/kenshoo-linux/develop/projects/projectJava/macycExampleFile.csv - macycExampleFile.csv.csv");

    }


    public void run(String path) {

        final String CSV_File = path;
        BufferedReader br = null;
        final String SEPARATOR = ",";

        try {

            br = new BufferedReader(new FileReader(CSV_File));
            String str;
            String line = "";
            int flag = -1;
            Channel channel = new Channel();
            Convertor convertor = new Convertor();
            while ((line = br.readLine()) != null) {
                flag++;
                if (flag > 0) {
                    String[] words = line.split(SEPARATOR, 17);
                    channel = convertor.convertToChannel(words);
                    //Here will be a call for a function from another class
                    //It will insert the channel that been returned to the database.
                    for (String item : words) {
                        str = item + "\t\t";
                        System.out.print(str);
                    }
                    System.out.println();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Done");
        }
    }

}
