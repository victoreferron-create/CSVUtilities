package CSV;

import CSV.Exceptions.*;

import java.util.ArrayList;
import java.util.List;

public class CSVWrapper {
    private List<List<String>> CSVStructure;

    public CSVWrapper(List<String> pCSVHeader) {
        CSVStructure = new ArrayList<>();
        CSVStructure.addFirst(pCSVHeader);
    }

    public void addElement(List<String> element, int index) {

        List<String> header = CSVStructure.getFirst();

        if (element.size() != header.size()) {
            throw new InvalidElementLength("element size : " + element.size() + " must be equal to header size : " + header.size() + "!");
        }

        if (index == 0) {
            throw new ElementBeforeHeaderException("Can not add an element before the CSV header!");
        }

        CSVStructure.add(index , element);
    }

    public void delElement(int index) {
        if (index == 0) {
            throw new DeleteHeaderException("Can not delete the CSV header!");
        }
        CSVStructure.remove(index);
    }

    public void modifyElement(int elementIndex, int attributeIndex, String attribute) {
        if (elementIndex == 0) {
            throw new ModifyHeaderException("Can not modify the CSV header!");
        }

        CSVStructure.get(elementIndex).set(attributeIndex, attribute);
    }

    public List<String> getElement(int index) {
        try {
            return CSVStructure.get(index);
        } catch (IndexOutOfBoundsException e) {
            throw new InvalidElementIndex("Element index is out of bounds!");
        }
    }
}
