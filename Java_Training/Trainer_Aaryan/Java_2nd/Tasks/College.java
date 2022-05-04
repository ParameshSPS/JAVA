package Java_Training.Trainer_Aaryan.Java_2nd.Tasks;

import java.util.*;

public class College {
    static Queue<Details> queue = new ArrayDeque<>();

    public static Details dataEnter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("College Name: ");
        String name = scanner.nextLine();

        System.out.println("College Code: ");
        String code = scanner.nextLine();

        System.out.println("College Location: ");
        String location = scanner.nextLine();

        System.out.println("Staff Count: ");
        int count = scanner.nextInt();

        System.out.println("No.of Students: ");
        int students = scanner.nextInt();

        Details info = new Details(name, code, location, count, students);

        scanner.close();
        return info;
    }

    public static void main(String[] args) {
        Details info = dataEnter();

        queue.add(info);

        // System.out.println(queue);

        queue.forEach(e -> {
            System.out.println(" College Name : " + e.getClgName());
            System.out.println("College Code : " + e.getClgCode());
            System.out.println("College Location : " + e.getLocation());
            System.out.println("College Staff : " + e.getClgStaff());
            System.out.println("Students Count: " + e.getNoOfStudents());
        });
    }
}

class Details {
    String clgName;
    String clgCode;
    String location;
    int clgStaff;
    int noOfStudents;

    public Details(String clgName, String clgCode, String location, int clgStaff, int noOfStudents) {
        this.clgName = clgName;
        this.clgCode = clgCode;
        this.location = location;
        this.clgStaff = clgStaff;
        this.noOfStudents = noOfStudents;
    }

    public String getClgName() {
        return clgName;
    }

    public void setClgName(String clgName) {
        this.clgName = clgName;
    }

    public String getClgCode() {
        return clgCode;
    }

    public void setClgCode(String clgCode) {
        this.clgCode = clgCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getClgStaff() {
        return clgStaff;
    }

    public void setClgStaff(int clgStaff) {
        this.clgStaff = clgStaff;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }
}