package Java_Training.Trainer_Aaryan.Java_26th.Tasks;

public class Task2_Emp {
    String Emp_Name;
    String Emp_DOB;
    
    @Override
    public String toString() {
        return "Task2_Emp [Emp_DOB=" + Emp_DOB + ", Emp_Name=" + Emp_Name + "]";
    }

    public String getEmp_Name() {
        return Emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        Emp_Name = emp_Name;
    }

    public String getEmp_DOB() {
        return Emp_DOB;
    }

    public void setEmp_DOB(String emp_DOB) {
        Emp_DOB = emp_DOB;
    }

    public Task2_Emp(String emp_Name, String emp_DOB) {
        Emp_Name = emp_Name;
        Emp_DOB = emp_DOB;
    }    
}
