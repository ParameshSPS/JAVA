package Java_Training.Trainer_Aaryan.Java_22nd;

// Import
import java.util.*;
// import java.util.Scanner;

public class InputUser {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a Number");

            // inputs

            // double n = sc.nextInt();
            // String n = sc.next();
            int n = scanner.nextInt();

            System.out.println("Your Entered Number is = " + n);
        }
    }
}