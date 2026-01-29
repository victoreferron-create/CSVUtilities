# CSV Library (v1.0.0)

This is a simple Java library designed to handle CSV operations using a wrapper structure. 

> [!NOTE]
> I am new to GitHub and may do errors. This is the first stable version of the library.

## 🛠 Features

The library consists of three main components:

### 1. `CSVWrapper`
This is the core data structure. It manages a `List<List<String>>` and ensures your header remains protected.

* **Constructor**: Requires a `List<String>` to define the CSV header.
* **Key Methods**:
    * `addElement(List<String>)`: Adds a new row.
    * `addElement(List<String>, int index)`: Inserts a row at a specific index.
    * `delElement(int index)`: Deletes a row.
    * `modifyElement(int row, int col, String value)`: Updates a specific "attribute."
    * `getCSVStructure()`: Returns the raw data list.

### 2. `CSVReader`
Converts a physical file into a `CSVWrapper` object.
* **Usage**: Pass a `BufferedReader` into the constructor and call `.read()`.

### 3. `CSVWriter`
Saves a `CSVWrapper` object back to a file.
* **Usage**: Pass a `BufferedWriter` into the constructor and call `.write(CSVWrapper csv)`.

## ⚠️ Exceptions
The library includes custom safety checks to prevent you from accidentally deleting or modifying your header:
* `ElementBeforeHeaderException`
* `InvalidElementIndex`
* `DeleteHeaderException`
* `ModifyHeaderException`
