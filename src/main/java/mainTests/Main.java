package mainTests;

import CSV.CSVWrapper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> csv_header = new ArrayList<>();

        csv_header.addFirst("name");
        csv_header.add("age");
        CSVWrapper csv = new CSVWrapper(csv_header);




        csv.addElement(List.of("Victor", Integer.toString(12)) , 1);

        System.out.println(csv.getElement(1));
    }
}
