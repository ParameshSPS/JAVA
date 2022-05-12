package Java_Training.Trainer_Aaryan.Java_Apr_22nd.Tasks;

// import
import java.util.Scanner;
// import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter a Name");
        Scanner sc = new Scanner(System.in);
        // input
        String name = sc.nextLine();

        System.out.println("Enter a Age");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println(name + " " + "is an Adult");
        } else {
            System.out.println(name + " " + "is not an Adult");
        }
        sc.close();
    }
}