/**
 * Created by kenshoo-linux on 14/07/16.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {

    public static void main(String[] args) {

        ReadCSV obj = new ReadCSV();
        obj.run();

    }

    public void run() {

        String csvFile = "/home/kenshoo-linux/develop/projects/corejavaexercise (copy)/macycExampleFile.csv - macycExampleFile.csv.csv";
        BufferedReader br = null;
        String line = "";
        String str="";
        String csvSplitBy = ",";
        int i=0;

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use tab as separator
                String[] words = line.split(csvSplitBy);
                for (String item: words) {
                    str = item +"\t\t";
                    System.out.print(str);
                }
                System.out.println();

                //System.out.println("Words [code= " + words[4]
                //       + " , name=" + words[5] + "]");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Done");
    }
}
