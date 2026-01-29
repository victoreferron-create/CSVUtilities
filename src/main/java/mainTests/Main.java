package mainTests;

import CSV.CSVReader;
import CSV.CSVWrapper;
import CSV.CSVWriter;

import java.io.*;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {

        File csv_file = new File("C:\\Users\\victo\\test.csv");

        CSVWrapper csv;
        try (BufferedReader br = new BufferedReader(new FileReader(csv_file))) {
            CSVReader csvReader = new CSVReader(br);
            csv = csvReader.read();
        }

        if (csv == null) {
            System.out.println("csv was null");
            return;
        }

        csv.delElement(1);
        csv.addElement(List.of("Victor Emmanuel Ferron","victor.e.ferron@gmail.com"));
        csv.addElement(List.of("Alice Maude Ferron","alic.m.ferron@gmail.com"));

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csv_file))) {
            CSVWriter csvWriter = new CSVWriter(bw);
            csvWriter.write(csv);
        }


    }
}
