package Java_Training.Trainer_Aaryan.Java_May_12th.Prime_Numbers;

import java.util.Scanner;

public class Nearest_Prime {

    public static void findNextPrimeNumber(int num) {
        boolean isPrime = false;

        while (!isPrime) {
            isPrime = true;
            num++;

            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Next prime number is : " + num);
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter a number :: ");
            int num = scanner.nextInt();

            if (num < 1) {
                System.out.println("Please enter valid number");
            } else {
                findNextPrimeNumber(num);
            }
        }
    }
}
