package CSV;

import CSV.Exceptions.CSVFileNotFound;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    BufferedReader reader;

    public CSVReader(BufferedReader pReader) {
        this.reader = pReader;
    }

    public CSVWrapper read(File file) throws IOException {
        if (!file.exists()) {
            throw new CSVFileNotFound("Could not find the CSV file");
        }

        String header_string = reader.readLine();

        CSVWrapper csv = new CSVWrapper(new ArrayList<String>(List.of(header_string.split(","))));

        return null;
    }
}
