package lab2;

/**
 * Program is an abstract class that provides a framework for various program types.
 * It defines methods for getting headers and row data, and for printing table headers and rows.
 * 
 * Created by: Akshay Kumar Bharti
 * Student Number: 041134452
 */
public abstract class Program {
    protected String[] data; // Array to store the program data

    /**
     * Constructor for the Program class.
     *
     * @param data the data array containing program information
     */
    public Program(String[] data) {
        this.data = data;
    }

    /**
     * Abstract method to get the headers for the table.
     *
     * @return an array of headers
     */
    protected abstract String[] getHeaders();

    /**
     * Abstract method to get the row data for the table.
     *
     * @return an array of row data
     */
    protected abstract String[] getRowData();

    /**
     * Prints the table headers.
     */
    public void printTableHeader() {
        String[] headers = getHeaders();
        for (String header : headers) {
            System.out.print("| " + header + " "); // Print each header with formatting
        }
        System.out.println(""); // Move to the next line after printing headers
    }

    /**
     * Prints the table row data.
     */
    protected void printTableRow() {
        String[] rowData = getRowData();
        for (String item : rowData) {
            System.out.print("| " + item + " "); // Print each row item with formatting
        }
        System.out.println("|"); // Close the row with a pipe symbol and move to the next line
    }

    /**
     * Abstract method to display the program information.
     * Must be implemented by subclasses.
     */
    public abstract void display();
}
