package lab3;
public class YouthProgram {
    private String programs;
    private String city;
    private String name;
    private String address;
    private String telephone;
    private String website;

    public YouthProgram(String csvLine){
    	String[] data = csvLine.split(",", -1); // here i have split the line using commas
        this.programs = stripHTML(data[0].trim());
        this.city = stripHTML(data[1].trim());
        this.name = stripHTML(data[2].trim());
        this.address = stripHTML(data[3].trim());
        this.telephone = stripHTML(data[4].trim());
        this.website = stripHTML(data[5].trim());
    }
    
    private String stripHTML(String input) {
        return input.replaceAll("<[^>]*>", "").replaceAll("^\"|\"$", "");
    }
    
    public String getPrograms() {
        return programs;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getWebsite() {
        return website;
    }
    
    public String toString() {
        return String.format("| %s | %s | %s | %s | %s | %s |",programs, city, name, address, telephone, website);
    }
	

}