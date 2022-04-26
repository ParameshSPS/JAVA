package Java_Training.Trainer_Aaryan.Java_22nd.Tasks;

// import
import java.util.Scanner;
// import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        String name = "Paramesh";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a age");

        // input
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println(name + " " + "is an Adult");
        } else {
            System.out.println(name + " " + "is not an Adult");
        }
        sc.close();
    }
}