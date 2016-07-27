/**
 * Created by ken-linux2 on 14/07/16.
 */

import classDomain.Channel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ChannelCSVReader {
    public static void main(String[] args) {
        ChannelCSVReader RCF = new ChannelCSVReader(new Converter());
        final String PATH="/home/ken-linux2/develop/projects/Java Project/src/macycExampleFile.csv - macycExampleFile.csv.csv";
        RCF.read(PATH);
    }

    private final Converter CONVERTER;
    public ChannelCSVReader(Converter CONVERTER) {
        this.CONVERTER = CONVERTER;
    }

    public List<Channel> read(String path) {
        String line;
        final String SAPERATOR = ",";
        ArrayList channelsList = new ArrayList();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            final String HEADER= br.readLine();
//           try {
//           }
//           catch(){
//           }
            while ((line = br.readLine()) != null) {
                channelsList.add(this.CONVERTER.returnLineAsChannel(line, SAPERATOR));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("file not found", e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return channelsList;
    }
}