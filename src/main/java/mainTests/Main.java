package mainTests;

import CSV.CSVReader;
import CSV.CSVWrapper;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\victo\\OneDrive\\Desktop\\test.csv");

        CSVReader csvreader = new CSVReader(new BufferedReader(new FileReader(file)));

        CSVWrapper csv = csvreader.read();

        System.out.println(csv.getElement(1));

        csv.modifyElement(1, 1, "13");

        System.out.println(csv.getElement(1));
    }
}
