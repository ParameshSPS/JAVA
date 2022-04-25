package Java_Training.Trainer_Aaryan.Java_25th.Tasks;

public class Employee {  
    int Id;             // Data Element
    String Gender;
    String FirstName;
    int Package;
    String Experience;
    String Location;

    public Employee() { // Default Constructor
        Id = 67620;
        Gender = "Male";
        FirstName = "Paramesh";
        Package = 0000;
        Experience = "4 years";
        Location = "Dharmavaram";
    }

    public Employee(int Id, String Gender, String FirstName, int Package, String Experience,
            String location) {
        this.Id = Id;
        this.Gender = Gender;
        this.FirstName = FirstName;
        this.Package = Package;
        this.Experience = Experience;
        this.Location = location;
    }

    // OverRide - toString()
    @Override
    public String toString() {
        return "Id = " + this.Id + " / Name=" + this.FirstName + " / Gender = " + this.Gender +
                " \nPackage = $" + this.Package + " / Experience = " + this.Experience +
                " / Location = " + this.Location;
    }

    // Getter & Setter
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public int getPackage() {
        return Package;
    }

    public void setPackage(int package1) {
        Package = package1;
    }

    // public double getMonthlySalary() {
    // return Package / 12;
    // }

    public String getExperience() {
        return Experience;
    }

    public void setExperience(String experience) {
        Experience = experience;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    // Main Class
    public static void main(String[] args) {
        Employee E1, E2, E3, E4;

        E1 = new Employee();
        E2 = new Employee(1234, "Male", "Aaryan", 800000, "8 Years", "Pune");
        E3 = new Employee(4567, "Female", "Swetha", 300000, "4 Years", "Hyderabad");
        E4 = new Employee(8901, "Female", "Bhavya", 1900000, "14 Years", "SBC");

        E1.setPackage(4444);

        System.out.println(E1);
        System.out.println(E2);
        System.out.println(E3);
        System.out.println(E4);

        // System.out.println(E1.getMonthlySalary());
    }
}