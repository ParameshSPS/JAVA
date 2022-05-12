package Java_Training.Trainer_Aaryan.Java_May_11th.Prime_Numbers;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n, count;
        System.out.print("Enter the n -> number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            System.out.println("Prime numbers between 1 to " + num + " are ");
            for (int s = 2; s <= num; s++) {
                count = 0;
                for (n = 1; n <= s; n++) {
                    if (s % n == 0) {
                        count++;
                    }
                }
                if (count == 2)
                    System.out.print(s + " ");
            }
        }
    }
}