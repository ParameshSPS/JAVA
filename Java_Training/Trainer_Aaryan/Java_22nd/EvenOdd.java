package Java_Training.Trainer_Aaryan.Java_22nd;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();

            // n % 2 == 0 (even)
            // n % 2 not = 0 (odd)

            // int number = 40;

            if (number % 2 == 0) {
                System.out.println(number + " is Even");
            } else {
                System.out.println(number + " is Odd");
            }
        }
    }
}

// 40 is Even