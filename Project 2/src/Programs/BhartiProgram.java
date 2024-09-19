package Programs;

public class BhartiProgram extends Program {
    private String specialAttributeZ;

    public BhartiProgram(String programs, String city, String name, String address, String telephone , String website) {
        super(programName, description, startDate, endDate);
        this.specialAttributeZ = specialAttributeZ;
    }

    public void uniqueBehaviorZ() {
        System.out.println("Unique behavior Z: " + specialAttributeZ);
    }

    @Override
    public String toString() {
        return super.toString() + ", Special Attribute Z: " + specialAttributeZ;
    }
}
