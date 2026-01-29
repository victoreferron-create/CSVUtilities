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

        }
    }
}
