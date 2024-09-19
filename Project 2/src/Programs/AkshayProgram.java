package Programs;

public class AkshayProgram extends Program {
    private String specialAttributeX;

    public AkshayProgram(String programs, String city, String name, String address, String telephone,String website) {
        super(programs, city, name, address,telephone,website);
        this.specialAttributeX = specialAttributeX;
    }

    public void uniqueBehaviorX() {
        System.out.println("Unique behavior X: " + specialAttributeX);
    }

    @Override
    public String toString() {
        return super.toString() + ", Special Attribute X: " + specialAttributeX;
    }
}
