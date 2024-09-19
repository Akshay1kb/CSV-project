package Programs;

public class YouthProgram extends Program {
    private int ageGroup;

    public YouthProgram(String programs, String city, String address, String telephone, String website,String name) {
        super(programs,city,address,name,telephone,website);
        this.ageGroup = ageGroup;
    }

    public void uniqueBehaviorY() {
        System.out.println("Unique behavior Y: Suitable for ages " + ageGroup);
    }

    @Override
    public String toString() {
        return super.toString() + ", Age Group: " + ageGroup;
    }
}
