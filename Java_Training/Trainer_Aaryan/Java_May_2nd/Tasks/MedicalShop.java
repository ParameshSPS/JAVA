package Java_Training.Trainer_Aaryan.Java_May_2nd.Tasks;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.UUID;

public class MedicalShop {
    static Queue<Details> q = new ArrayDeque<>();

    public static Details inputDetails() {
        Scanner scanner = new Scanner(System.in);

        String id = UUID.randomUUID().toString();

        System.out.print("Enter name : ");
        String name = scanner.nextLine();

        System.out.print("Enter age : ");
        int age = scanner.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Disease name : ");
        String diseasename = sc1.nextLine();

        System.out.print("Enter your phone no : ");
        int phoneno = scanner.nextInt();

        Details d = new Details(id, name, age, diseasename, phoneno);

        scanner.close();
        sc1.close();
        return d;
    }

    public static void main(String[] args) {
        Details d = inputDetails();

        q.add(d);

        q.forEach(e -> {
            System.out.println("ID : " + e.getId());
            System.out.println("Name : " + e.getName());
            System.out.println("Age : " + e.getAge());
            System.out.println("Disease : " + e.getDiseasename());
            System.out.println("Phone no : " + e.getPhoneno());
        });

        // System.out.println(q);
    }
}

class Details {
    String id;
    String name;
    int age;
    String diseasename;
    int phoneno;

    public Details(String id, String name, int age, String diseasename, int phoneno) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diseasename = diseasename;
        this.phoneno = phoneno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiseasename() {
        return diseasename;
    }

    public void setDiseasename(String diseasename) {
        this.diseasename = diseasename;
    }

    public int getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }
}

// Output
/*
 * ID : cd5a065c-107b-4eaf-b8f0-902339c7e9ed
 * Name : param
 * Age : 24
 * Disease : fever
 * Phone no : 4334343
 */