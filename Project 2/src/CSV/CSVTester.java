package lab3;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CSVTester {

	public static void main(String[] args) {
		
		String fileName = "C:\\Users\\aksha\\OneDrive\\Desktop\\mccss-youth-programs.csv";
		int lineCount = 0;
		
		//try-catch block to deal with errors if any comes.
		try (Scanner scanner = new Scanner(new FileReader(fileName))) {
            // Read and ignore the header line
            if (scanner.hasNextLine()) {
                String headerLine = scanner.nextLine();

            }

            // Read and process each line of the CSV file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                YouthProgram program = new YouthProgram(line);
                System.out.println(program.toString());
                lineCount++;
            }
            //scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
		
		//here the total number of lines would be counted
        System.out.printf("Total %d records\n", lineCount);
    }

	}