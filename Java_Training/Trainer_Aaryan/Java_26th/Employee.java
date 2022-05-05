package Java_Training.Trainer_Aaryan.Java_26th;

import java.time.LocalDate;
import java.util.Scanner;

public class Employee {
    String eName;
    String eRole;
    double eSalary;
    String dob;
    double exp;

    @Override
    public String toString() {
        return "Employee [dob=" + dob + ", eName=" + eName + ", eRole=" + eRole + ", eSalary=" + eSalary + ", exp="
                + exp + "]";
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteRole() {
        return eRole;
    }

    public void seteRole(String eRole) {
        this.eRole = eRole;
    }

    public double geteSalary() {
        return eSalary;
    }

    public void seteSalary(double eSalary) {
        this.eSalary = eSalary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public Employee(String eName, String eRole, double eSalary, String dob, double exp) {
        this.eName = eName;
        this.eRole = eRole;
        this.eSalary = eSalary;
        this.dob = dob;
        this.exp = exp;
    }
}

class EmployeeSystem {
    static Scanner sc = new Scanner(System.in);

    private static Employee addEmployee() {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        Scanner sc5 = new Scanner(System.in);

        System.out.println("Enter the Employee Name: ");
        String Ename = sc1.nextLine();

        System.out.println("Enter the Employee Role: ");
        String Erole = sc2.nextLine();

        System.out.println("Enter the Employee Salary: ");
        double Esalary = sc3.nextDouble();

        System.out.println("Enter the Employee DOB (dd/mm/yy): ");
        String dob = sc4.nextLine();

        String d = dob.split("/")[0];
        String m = dob.split("/")[1];
        String y = dob.split("/")[2];
        System.out.println(LocalDate.of(Integer.parseInt(y), Integer.parseInt(m), Integer.parseInt(d)));

        System.out.println("Enter the Employee Experience: ");
        double exp = sc5.nextDouble();

        Employee e = new Employee(Ename, Erole, Esalary, dob, exp);
        System.out.println("Employee Details Added Successfully.");
        System.out.println(e);

        sc1.close();
        sc2.close();
        sc3.close();
        sc4.close();
        sc5.close();
        return e;
    }

    public static void main(String[] args) {
        // Menu Driven Program
        while (true) {
            Scanner sc6 = new Scanner(System.in);

            System.out.println("1. Add an Employee");
            System.out.println("2. Exit the Program");

            System.out.print("Enter your choice:- ");
            int choices = sc6.nextInt();

            switch (choices) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    System.out.println("Thanks for using our Employee System.");
                    System.exit(0); // Exit the Program
                    break;
                default:
                    break;
            }

            sc6.close();
        }
    }
}