package Java_Training.Trainer_Aaryan.Java_May_06th.Tasks;

public class Employee_Info {
    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpFullName() {
        return empFullName;
    }

    public void setEmpFullName(String empFullName) {
        this.empFullName = empFullName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    private long empId;
    private String empFullName;
    private long salary;
    private Gender gender;

    @Override
    public String toString() {
        return empId + "-->" + empFullName + "-->" + salary + "-->" + gender;
    }
}