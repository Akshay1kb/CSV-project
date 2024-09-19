package Programs;

import Programs.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CVSProgramReader {
    public static Program programReader(String csvLine) {
        String[] data = csvLine.split(",");
        String programs = data[0];
        String city = data[1];
        String name = data[2];
        String address = data[3];
        String telephone = data[4];
        String website = data[5];
        String  = data[4];

        switch (programType) {
            case "AkshayProgram":
                String specialAttributeX = data[5];
                return new AkshayProgram(programs,city,address,name,telephone,website);
            case "YouthProgram":
                int ageGroup = Integer.parseInt(data[5]);
                return new YouthProgram(programs,city,address,name,telephone,website);
            case "BhartiProgram":
                String specialAttributeZ = data[5];
                return new BhartiProgram(programs,city,address,name,telephone,website);
            default:
                return null;
        }
    }
}
