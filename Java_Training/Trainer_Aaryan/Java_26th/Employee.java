package Java_Training.Trainer_Aaryan.Java_26th;

import java.util.Scanner;

public class Employee {
    String FirstName;
    String Role;
    double Salary;
    String Location;
    double Exp;

    @Override
    public String toString() {
        return "Employee [Exp=" + Exp + ", FirstName=" + FirstName + ", Location=" + Location + ", Role=" + Role
                + ", Salary=" + Salary + "]";
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public double getExp() {
        return Exp;
    }

    public void setExp(double exp) {
        Exp = exp;
    }

    public Employee(String firstName, String role, double salary, String location, double exp) {
        FirstName = firstName;
        Role = role;
        Salary = salary;
        Location = location;
        Exp = exp;
    }
}

class EmployeeSystem {
    static Scanner sc = new Scanner(System.in);

    private static Employee addEmployee() {
        try (Scanner sc1 = new Scanner(System.in)) {
            System.out.println("Enter the Employee Name : ");
            String FirstName = sc1.nextLine();

            try (Scanner sc2 = new Scanner(System.in)) {
                System.out.println("Enter the Employee Role : ");
                String Role = sc2.nextLine();

                try (Scanner sc3 = new Scanner(System.in)) {
                    System.out.println("Enter the Employee Salary : ");
                    double Salary = sc3.nextDouble();

                    try (Scanner sc4 = new Scanner(System.in)) {
                        System.out.println("Enter the Employee Location : ");
                        String Location = sc4.nextLine();

                        try (Scanner sc5 = new Scanner(System.in)) {
                            System.out.println("Enter the Employee Experience : ");
                            double Exp = sc5.nextDouble();

                            Employee E = new Employee(FirstName, Role, Salary, Location, Exp);
                            System.out.println("Employee Added Successfully");
                            System.out.println(E);
                            return E;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // Menu Driven Program
        while (true) {
            System.out.println("1. Add an Employee Name");
            System.out.println("2. Exit the Program");
            System.out.print("Enter your choice :- ");

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