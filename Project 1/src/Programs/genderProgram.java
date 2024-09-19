package Programs;

import lab2.Program;

/**
 * genderProgram class extends the Program class to include gender-specific information.
 * It overrides methods to provide headers and row data specific to the gender attribute.
 * 
 * Created by: Akshay Kumar Bharti
 * Student Number: 041134452
 */
public class genderProgram extends Program {
    private String gender; // Stores the gender information

    /**
     * Constructor for genderProgram.
     */
    public genderProgram(String[] data, String gender) {
        super(data);
        this.gender = gender;
    }

    /**
     * Provides the headers for the table specific to genderProgram.
	 *return an array of headers
     */
    @Override
    protected String[] getHeaders() {
        return new String[]{"Gender |\n|--------|"};
    }

    /**
     * Provides the row data specific to the gender attribute.
     *return an array of row data
     */
    @Override
    protected String[] getRowData() {
        return new String[]{gender};
    }

    /**
     * Displays the genderProgram information by printing the table row.
     */
    @Override
    public void display() {
        printTableRow();
    }
}
