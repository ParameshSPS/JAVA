package Java_Training.Trainer_Aaryan.Java_2nd.Tasks;

import java.util.*;

class Details {
    String id;
    String name;
    int age;
    String disease_Name;
    String phone_No;
    int amount;

    public Details(String id2, String name, int age, String disease_Name, String phoneno, int amount) {
        this.id = id2;
        this.name = name;
        this.age = age;
        this.disease_Name = disease_Name;
        this.phone_No = phoneno;
        this.amount = amount;
    }

    public Details(int i, String name2, int age2, String disease_Name2, int j, int amount2) {
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

    @Override
    public String toString() {
        return "Details [age=" + age + ", amount=" + amount + ", disease_Name=" + disease_Name + ", id=" + id
                + ", name=" + name + ", phone_No=" + phone_No + "]";
    }
}

public class MedicalShop1 {
    static Stack<Details> stack = new Stack<>();

    public static Details enterDetails() {
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

        Details d = new Details(id, name, age, diseasename, phoneno, fee);
        // stack.push(data);
        // System.out.println(data);

        scanner.close();
        sc1.close();
        sc2.close();
        return d;
    }

    public static void main(String[] args) {

        Details p1, p2;

        p1 = new Details(1, "param", 23, "cold", 1234, 34);
        p2 = new Details(2, "Aaryan", 30, "Cold", 23455, 55);

        System.out.println(p1);
        System.out.println(p2);

        // enterDetails();

        Details data = enterDetails();

        stack.add(data);

        // System.out.println(stack);

        // stack.forEach(elements -> {
        //     System.out.println("ID = " + elements.getId());
        //     System.out.println("Name = " + elements.getName());
        //     System.out.println("Age = " + elements.getAge());
        //     System.out.println("Disease = " + elements.getDisease_Name());
        //     System.out.println("Contact = " + elements.getPhone_No());
        //     System.out.println("Doctor fee = " + elements.getAmount());
        // });
    }
}