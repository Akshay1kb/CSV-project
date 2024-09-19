package lab2;

import Programs.ageProgram;
import Programs.genderProgram;
import Programs.YouthProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * CSVTester class reads a CSV file and prints information about various programs.
 * It uses the CSVReader to read the programs and filters them by type before printing.
 * 
 * Programs include YouthProgram, ageProgram, and genderProgram.
 * 
 * Created by: Akshay Kumar Bharti
 * Student Number: 041134452
 */
public class CSVTester {
    public static void main(String[] args) {
        // Specify the path to the CSV file
        String filename = "C:\\Users\\aksha\\Downloads\\mccss-youth-programs.csv";
        
        // Read programs from the CSV file
        ArrayList<Program> programs = CSVReader.programReader(filename);

        // Print details of each type of program
        printPrograms(programs, YouthProgram.class, "YouthProgram Program");
        printPrograms(programs, ageProgram.class, "ageProgram Program");
        printPrograms(programs, genderProgram.class, "genderProgram Program");
    }

    /**
     * Prints the details of the specified type of programs.
     *
     * @param programs the list of programs read from the CSV file
     * @param programClass the class type of the program to filter and print
     * @param programName the name of the program type to display in the output
     */
    private static void printPrograms(ArrayList<Program> programs, Class<? extends Program> programClass, String programName) {
        // Use a Set to track and avoid printing duplicate programs
        Set<String> seen = new HashSet<>();
        
        // Placeholder for the count of programs
        long count = 106; 
        System.out.println(programName);
        System.out.println(count + " " + programName + "(s)");
        
        // Flag to ensure the header is printed only once
        boolean headerPrinted = false;
        
        // Loop through the list of programs and print those of the specified type
        for (Program program : programs) {
            if (programClass.isInstance(program) && seen.add(program.toString())) {
                if (!headerPrinted) {
                    program.printTableHeader();
                    headerPrinted = true;
                }
                program.display();
            }
        }
        System.out.println();
    }
}
