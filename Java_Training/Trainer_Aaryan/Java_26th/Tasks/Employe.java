package Java_Training.Trainer_Aaryan.Java_26th.Tasks;

import java.time.LocalDate;
import java.util.Scanner;

public class Employe {
    String EmpName;
    String Emp_DOJ;

    @Override
    public String toString() {
        return "Employe [EmpName=" + EmpName + ", Emp_DOJ=" + Emp_DOJ + "]";
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getEmp_DOJ() {
        return Emp_DOJ;
    }

    public void setEmp_DOJ(String emp_DOJ) {
        Emp_DOJ = emp_DOJ;
    }

    public Employe(String empName, String emp_DOJ) {
        EmpName = empName;
        Emp_DOJ = emp_DOJ;
    }
}

class Emp_System {
    static Scanner sc = new Scanner(System.in);

    private static Employe addEmploye() {
        try (Scanner sc1 = new Scanner(System.in)) {
            System.out.println("Enter Employee Name: ");
            sc1.nextLine();

            try (Scanner doc_sc = new Scanner(System.in)) {
                System.out.println("Enter the Employee Emp_DOJ (dd/mm/yy) : ");
                String doj = doc_sc.nextLine();
                String d = doj.split("/")[0];
                String m = doj.split("/")[1];
                String y = doj.split("/")[2];

                System.out.println(LocalDate.of(Integer.parseInt(y), Integer.parseInt(m), Integer.parseInt(d)));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Menu Driven Program
        while (true) {
            System.out.println("1. Add an Employee");
            System.out.println("2. Exit the Program");
            System.out.print("Enter your choice :- ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmploye();
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