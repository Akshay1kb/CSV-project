package lab2;

import Programs.ageProgram;
import Programs.genderProgram;
import Programs.YouthProgram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * CSVReader class reads a CSV file and creates Program objects based on the data.
 * It supports reading and parsing data for YouthProgram, ageProgram, and genderProgram.
 * 
 * Created by: Akshay Kumar Bharti
 * Student Number: 041134452
 */
public class CSVReader {

    /**
     * Reads the CSV file and returns a list of Program objects.
     */
    public static ArrayList<Program> programReader(String filename) {
        ArrayList<Program> programs = new ArrayList<>();

        // Try-with-resources to ensure the BufferedReader is closed after use
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean header = true; // Flag to skip the header line

            // Read each line from the CSV file
            while ((line = br.readLine()) != null) {
                if (header) {
                    header = false;
                    continue; // Skip the header line
                }

                // Split the line by commas, ignoring commas within quotes
                String[] data = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                
                // Extract the program type and clean the data
                String programType = data[0].replace("\"", "").trim();
                String[] programData = {
                    programType,
                    data[1].replaceAll("<[^>]*>", "").replace("\"", "").trim(),
                    data[2].replaceAll("<[^>]*>", "").replace("\"", "").trim(),
                    data[3].replaceAll("<[^>]*>", "").replace("\"", "").trim(),
                    data[4].replaceAll("<[^>]*>", "").replace("\"", "").trim(),
                    data[5].replaceAll("<[^>]*>", "").replace("\"", "").trim(),
                    data[6].replaceAll("<[^>]*>", "").replace("\"", "").trim()
                };
                // Extract specific data fields for age, gender, and number
                String age = data[data.length - 3];
                String gender = data[data.length - 2];
                String number = data[data.length - 1];

                // Create YouthProgram objects based on the program type
                switch (programType.trim()) {
                    case "Youth Outreach Worker Program, Gang Prevention and Intervention Program":
                    case "Youth Outreach Worker Program":
                    case "Youth Mentorship Program":
                    case "Gang Prevention and Intervention Program":
                    case "Restorative Justice and Conflict Mediation":
                    case "Student and Family Advocates Initiative":
                    case "Youth Opportunities Fund":
                    case "Youth Violence and Human Trafficking Prevention Program":
                        programs.add(new YouthProgram(programData, number));
                        break;
                    default:
                        // Handle other cases or skip
                        break;
                }

                // Create ageProgram objects based on the program type
                switch (programType.trim()) {
                    case "Youth Outreach Worker Program, Gang Prevention and Intervention Program":
                    case "Youth Outreach Worker Program":
                    case "Youth Mentorship Program":
                    case "Gang Prevention and Intervention Program":
                    case "Restorative Justice and Conflict Mediation":
                    case "Student and Family Advocates Initiative":
                    case "Youth Opportunities Fund":
                    case "Youth Violence and Human Trafficking Prevention Program":
                        programs.add(new ageProgram(programData, age));
                        break;
                    default:
                        // Handle other cases or skip
                        break;
                }

                // Create genderProgram objects based on the program type
                switch (programType.trim()) {
                    case "Youth Outreach Worker Program, Gang Prevention and Intervention Program":
                    case "Youth Outreach Worker Program":
                    case "Youth Mentorship Program":
                    case "Gang Prevention and Intervention Program":
                    case "Restorative Justice and Conflict Mediation":
                    case "Student and Family Advocates Initiative":
                    case "Youth Opportunities Fund":
                    case "Youth Violence and Human Trafficking Prevention Program":
                        programs.add(new genderProgram(programData, gender));
                        break;
                    default:
                        // Handle other cases or skip
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Print stack trace in case of an IOException
        }

        return programs;
    }
}
