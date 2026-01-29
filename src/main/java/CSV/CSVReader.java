package CSV;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    BufferedReader reader;

    public CSVReader(BufferedReader pReader) {
        this.reader = pReader;
    }

    public CSVWrapper read() throws IOException {

        String header_string = reader.readLine();
        CSVWrapper csv;



        if (header_string != null) {

            if (header_string.isBlank()) {
                return null;
            }
            csv = new CSVWrapper(new ArrayList<String>(List.of(header_string.split(","))));
        } else {
            return null;
        }

        String line;
        // this is a comment from GitHub!!!
        while ((line = reader.readLine()) != null) {
            if (line.isBlank()) {
                continue;
            }
            csv.addElement(new ArrayList<>(List.of(line.split(","))));
        }

        return csv;
    }
}
