package Java_Training.Trainer_Aaryan.Java_26th;

import java.time.LocalDate;
import java.util.Scanner;

public class Employee {
    String Ename;
    String Erole;
    double Esalary;
    String dob;
    double exp;

    @Override
    public String toString() {
        return "Employee [Ename=" + Ename + ", Erole=" + Erole + ", Esalary=" + Esalary + ", dob=" + dob + ", exp="
                + exp + "]";
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public String getErole() {
        return Erole;
    }

    public void setErole(String erole) {
        Erole = erole;
    }

    public double getEsalary() {
        return Esalary;
    }

    public void setEsalary(double esalary) {
        Esalary = esalary;
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

    public Employee(String ename, String erole, double esalary, String dob, double exp) {
        Ename = ename;
        Erole = erole;
        Esalary = esalary;
        this.dob = dob;
        this.exp = exp;
    }
}

class EmployeeSystem {
    static Scanner sc = new Scanner(System.in);

    private static Employee addEmployee() {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the Employee Name: ");
        String Ename = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the Employee Role: ");
        String Erole = sc2.nextLine();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the Employee Salary: ");
        double Esalary = sc3.nextDouble();

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter the Employee DOB (dd/mm/yy): ");
        String dob = sc4.nextLine();

        String d = dob.split("/")[0];
        String m = dob.split("/")[1];
        String y = dob.split("/")[2];
        System.out.println(LocalDate.of(Integer.parseInt(y), Integer.parseInt(m), Integer.parseInt(d)));

        Scanner sc5 = new Scanner(System.in);
        System.out.println("Enter the Employee Experience: ");
        double exp = sc5.nextDouble();

        Employee e = new Employee(Ename, Erole, Esalary, dob, exp);
        System.out.println("Employee Details Added Successfully.");
        System.out.println(e);
        return e;
    }

    public static void main(String[] args) {
        // Menu Driven Program
        while (true) {
            System.out.println("1. Add an Employee");
            System.out.println("2. Exit the Program");

            System.out.print("Enter your choice:- ");
            int choice = sc.nextInt();

            switch (choice) {
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
        }
    }
}