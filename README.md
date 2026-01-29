First stable version.



I am very new to GitHub, so I may make errors.


There are 3 extra classes in this library. CSVWrapper holds a List<List<String>> object inside. Methods include:




addElement(List<String>) to add a row
addElement(List<String>, int index) to add a row at a specefic index (may throw ElementBeforeHeaderException or InvalidElementIndex)
delElement(int index) deletes a row (may throw DeleteHeaderException)
modifyElement(int elementIndex, int attributeIndex, String attribute) modifies a value (or like I call them: attributes) inside a row (may throw ModifyHeaderException)
List<String> getElement(int index) returns a List<String> object (may throw InvalidElementIndex)
List<List<String>> getCSVStructure() returns the actual list of lists the wrapper uses
CSVWrapper requires a List<String> for the CSV header inside the constructor







CSVReader returns a CSVWrapper object when the .read() method is called. The constructor requires a BufferedReader object.




CSVWriter writes to the .csv files using the .write(CSVWrapper csv) method. Their constructor requires a BufferedWriter.
