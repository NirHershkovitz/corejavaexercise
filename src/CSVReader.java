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

        BufferedReader br = null;
        //it doesn't allow me to add static.
        final String SEPERATOR = ",";

        try {

            br = new BufferedReader(new FileReader(path));
            String str;
            String line = "";
            int flag = -1;
            Channel channel = new Channel();
            Convertor convertor = new Convertor();
            while ((line = br.readLine()) != null) {
                flag++;
                if (flag > 0) {
                    channel = convertor.convertToChannel(line,SEPERATOR);
                    //Here will be a call for a function from another class
                    //It will insert the channel that been returned to the database.
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
