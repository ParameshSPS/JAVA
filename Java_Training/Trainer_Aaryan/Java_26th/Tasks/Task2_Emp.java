package Java_Training.Trainer_Aaryan.Java_26th.Tasks;

import java.time.LocalDateTime;
// import java.time.ZoneId;
import java.util.Scanner;

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

class EmpSys {
    static Scanner sc = new Scanner(System.in);

    private static Task2_Emp addTask2_Emp() {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a Name: ");
        String name = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter a DateOfBirth: ");
        String date = sc2.nextLine();

        // System.out.println(LocalDateTime.now(ZoneId.of("Asia/Kolkata")));
        System.out.println(LocalDateTime.now());

        Task2_Emp e = new Task2_Emp(name, date);
        System.out.println("Employee Details Added Successfully.");
        System.out.println(e);
        return e;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add a Emp: ");
            System.out.println("2. Exit the file");

            System.out.print("Enter your choice:- ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    addTask2_Emp();
                    break;
                case 2:
                    System.out.println("Thanks for using our Employee System.");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}