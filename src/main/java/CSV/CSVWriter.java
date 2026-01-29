package CSV;

import javax.lang.model.element.NestingKind;
import java.io.BufferedWriter;
import java.util.List;

public class CSVWriter {
    BufferedWriter writer;

    public CSVWriter(BufferedWriter pBufferedWriter) {
        this.writer = pBufferedWriter;
    }

    public void write(CSVWrapper csv) {
        for (List<String> csv_structure : csv.getCSVStructure()) {

        try {
            for (List<String> csv_element : csv.getCSVStructure()) {
                writer.write(String.join(",", csv_element));
                writer.newLine();
                writer.close();
            }
            writer.flush();
        } catch (IOException e) {
            System.err.println("Error: Could not write to CSV file. " + e.getMessage());
        }
    }
}
