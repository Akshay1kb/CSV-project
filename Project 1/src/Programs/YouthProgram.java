package Programs;

import lab2.Program;

/**
 * YouthProgram class extends the Program class to include specific information for youth programs.
 * It overrides methods to provide headers and row data specific to youth programs.
 * 
 * Created by: Akshay Kumar Bharti
 * Student Number: 041134452
 */
public class YouthProgram extends Program {
    private String number; // Stores the number information

    /**
     * Constructor for YouthProgram.
     */
    public YouthProgram(String[] data, String number) {
        super(data);
        this.number = number;
    }

    /**
     * Provides the headers for the table specific to YouthProgram.
     *return an array of headers
     */
    @Override
    protected String[] getHeaders() {
        return new String[]{
            "Programs", "City", "Name", "Address", "TelePhone", "Website", "Number |\n|----------|------|------|---------|-----------|---------|--------|"
        };
    }

    /**
     * Provides the row data specific to the youth program attributes.
     *return an array of row data
     */
    @Override
    protected String[] getRowData() {
        return new String[]{
            data[0], data[1], data[2], data[3], data[4], data[5], number
        };
    }

    /**
     * Displays the youth program information by printing the table row.
     */
    @Override
    public void display() {
        printTableRow();
    }
}
