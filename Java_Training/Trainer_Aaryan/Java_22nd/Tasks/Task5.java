package Java_Training.Trainer_Aaryan.Java_22nd.Tasks;

import java.util.Scanner; // necessary

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name :- ");
        String name = sc.nextLine();

        System.out.println("Enter your Age :-");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println(name + " is an Adult");
        } else if (age < 0) {
            System.out.println("Invalid Age");
        } else {
            System.out.println(name + " is not an adult");
        }
        sc.close();
    }
}