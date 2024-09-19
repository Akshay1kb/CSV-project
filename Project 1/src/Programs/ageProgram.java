package Programs;

import lab2.Program;

/**
 * ageProgram class extends the Program class to include age-specific information.
 * It overrides methods to provide headers and row data specific to the age attribute.
 */
public class ageProgram extends Program {
    private String age; // Stores the age information

    /**
     * Constructor for ageProgram.
     *
     */
    public ageProgram(String[] data, String age) {
        super(data);
        this.age = age;
    }

    /**
     * Provides the headers for the table specific to ageProgram.
     * return an array of headers
     */
    @Override
    protected String[] getHeaders() {
        return new String[]{"Age |\n|-----|"};
    }

    /**
     * Provides the row data specific to the age attribute.
     * return an array of row data
     */
    @Override
    protected String[] getRowData() {
        return new String[]{age};
    }

    /**
     * Displays the ageProgram information by printing the table row.
     */
    @Override
    public void display() {
        printTableRow();
    }
}
