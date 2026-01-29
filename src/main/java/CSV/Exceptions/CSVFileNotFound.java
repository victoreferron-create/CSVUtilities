package CSV.Exceptions;

public class CSVFileNotFound extends RuntimeException {
    public CSVFileNotFound(String message) {
        super(message);
    }
}
