/**
 * Created by kenshoo-linux on 14/07/16.
 */
import java.io.*;


public class CSVReader implements Closeable{

    public static void main(String[] args) {

        CSVReader obj = new CSVReader();
        obj.run();

    }

    public void run() {

        final String csvFile = "/home/kenshoo-linux/develop/projects/corejavaexercise (copy)/macycExampleFile.csv - macycExampleFile.csv.csv";
        BufferedReader br = null;
        /////////Nir asked to add "private static final" -why isn't it working?
        //private static final String csvSplitBy = ",";
        String csvSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            String str;
            String line="";
            while ((line = br.readLine()) != null) {
                String[] words = line.split(csvSplitBy);
                for (String item: words) {
                    str = item +"\t\t";
                    System.out.print(str);
                }
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done");

    }

    @Override
    public void close() throws IOException {

    }
}
