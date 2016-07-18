/**
 * Created by ken-linux2 on 14/07/16.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadCSVFile {
    public static void main(String[] args) {
        ReadCSVFile RCF = new ReadCSVFile();
        RCF.run();
    }

    private void run() {
        String csvFile = "/home/ken-linux2/Downloads/macycExampleFile.csv - macycExampleFile.csv.csv";
        BufferedReader br = null;
        String line;
        String str;
        String cvsSplitBy = ",";

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] myFile = line.split(cvsSplitBy);
                for (String item:myFile) {
                    str= item+("\t");
                    System.out.print(str);
                }
               System.out.println();
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