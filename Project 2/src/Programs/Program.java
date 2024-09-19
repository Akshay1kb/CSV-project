package Programs;
public class Program {
    

    private String programs;
    private String city;
    private String name;
    private String address;
    private String telephone;
    private String website;
    

	protected Program(String programs, String city, String name, String address,String telephone,String website) {
        this.programs = programs;
        this.city = city;
        this.name = name;
        this.address = address;
        this.telephone=telephone;
        this.website=website;
    }

    @Override
    public String toString() {
    	return String.format("| %s | %s | %s | %s | %s | %s |",programs, city, name, address, telephone, website);
    }
}

