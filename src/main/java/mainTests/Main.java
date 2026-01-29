package mainTests;

import CSV.CSVReader;
import CSV.CSVWrapper;
import CSV.CSVWriter;

import java.io.*;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\victo\\OneDrive\\Desktop\\test.csv");

        CSVWrapper csv = new CSVWrapper(List.of("user name", "email"));


    }
}
