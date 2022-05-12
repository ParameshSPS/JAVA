package Java_Training.Trainer_Aaryan.Java_May_12th.Prime_Numbers;

import java.util.Scanner;

public class Prime_Between_2_Num {
    public static void main(String[] args) {
        int n1, n2, i, j;
        System.out.println("Enter two numbers :: ");
        Scanner num = new Scanner(System.in);
        n1 = num.nextInt();
        n2 = num.nextInt();
        System.out.println("\nPrime numbers between two numbers: ");

        for (i = n1; i <= n2; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0)
                    break;
            }
            if (i == j)
                System.out.println(j);
        }

    }
}