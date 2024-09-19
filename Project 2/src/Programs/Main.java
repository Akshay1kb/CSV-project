import Programs.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Program> programs = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("programs.csv"))) {
            String line = br.readLine(); // Read header
            while ((line = br.readLine()) != null) {
                Program program = CSVProgramReader.programReader(line);
                if (program != null) {
                    programs.add(program);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Program program : programs) {
            System.out.println(program);
        }

        // Optional: Print total number of each type of SubProgram
        long xProgramCount = programs.stream().filter(p -> p instanceof AkshayProgram).count();
        long youthProgramCount = programs.stream().filter(p -> p instanceof YouthProgram).count();
        long zProgramCount = programs.stream().filter(p -> p instanceof BhartiProgram).count();

        System.out.println("Total AkshayProgram(s): " + xProgramCount);
        System.out.println("Total YouthProgram(s): " + youthProgramCount);
        System.out.println("Total BhartiProgram(s): " + zProgramCount);
    }
}
