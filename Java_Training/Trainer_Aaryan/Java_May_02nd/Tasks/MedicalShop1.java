package Java_Training.Trainer_Aaryan.Java_May_02nd.Tasks;

import java.util.*;

class Infos {
    String id;
    String name;
    int age;
    String disease_Name;
    String phone_No;
    int amount;

    public Infos(String id, String name, int age, String disease_Name, String phone_No, int amount) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease_Name = disease_Name;
        this.phone_No = phone_No;
        this.amount = amount;
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

    public String getDisease_Name() {
        return disease_Name;
    }

    public void setDisease_Name(String disease_Name) {
        this.disease_Name = disease_Name;
    }

    public String getPhone_No() {
        return phone_No;
    }

    public void setPhone_No(String phone_No) {
        this.phone_No = phone_No;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

public class MedicalShop1 {
    static Stack<Infos> stack = new Stack<>();

    public static Infos enterDetails() {
        Scanner scanner = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Disease name: ");
        String diseasename = sc1.nextLine();

        System.out.print("Enter your phone no: ");
        String phoneno = sc2.nextLine() + "";

        System.out.print("Enter your doctor fee: ");
        int fee = scanner.nextInt();

        System.out.println("****Patients detals successfully done****");

        Infos data = new Infos(id, name, age, diseasename, phoneno, fee);

        // stack.push(data);
        // System.out.println(data);

        scanner.close();
        sc1.close();
        sc2.close();
        return data;
    }

    public static void main(String[] args) {

        // enterDetails();

        Infos data = enterDetails();

        stack.push(data);

        // System.out.println(stack);

        stack.forEach(elements -> {
            System.out.println("ID = " + elements.getId());
            System.out.println("Name = " + elements.getName());
            System.out.println("Age = " + elements.getAge());
            System.out.println("Disease = " + elements.getDisease_Name());
            System.out.println("Contact = " + elements.getPhone_No());
            System.out.println("Doctor fee = " + elements.getAmount());
        });
    }
}