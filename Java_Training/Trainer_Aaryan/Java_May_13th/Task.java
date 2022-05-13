package Java_Training.Trainer_Aaryan.Java_May_13th;

import java.util.Scanner;

public class Task {

    public static void NextPrimeNumber(int num1, int num2) {
        boolean isPrime = false;

        while (!isPrime) {
            isPrime = true;
            num1++;
            num2--;

            // Bigest Prime
            for (int i = 2; i < num1 / 2; i++) {
                if (num1 % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Next Bigest prime number is : " + num1);
            }

            // Smallest Prime
            for (int i = 2; i < num2; i++) {
                if (num2 % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Next Smallest prime number is : " + num2);
            }
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please First number :: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            if (num1 < 1) {
                System.out.println("Please enter valid number");
            } else {
                NextPrimeNumber(num1, num2);
            }
        }
    }
}