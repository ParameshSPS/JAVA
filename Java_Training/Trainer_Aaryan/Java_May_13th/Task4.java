package Java_Training.Trainer_Aaryan.Java_May_13th;

import java.util.Scanner;

public class Task4 {

    static int sp;
    static int bp;
    static int sp1;
    static int bp1;
    static int NearestPrime;
    static int NearestPrime1;

    public static boolean inPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please the first number:: ");
            int num = scanner.nextInt();

            System.out.println("Please the second number:: ");
            int num1 = scanner.nextInt();

            // First Prime Number (Input)
            System.out.println("----First Prime Number Inputs----");

            if (inPrime(num)) {
                System.out.println(num + " itself it is a Prime Number");
            } else {
                int sp = -1;
                int bp = -1;

                for (int j = num; j > 0; j--) {
                    if (inPrime(j)) {
                        sp = j;
                        break;
                    }
                }

                int count = num + 1;

                while (true) {
                    if (inPrime(count)) {
                        bp = count;
                        break;
                    }
                    count++;
                }

                int step1 = bp - num;
                int step2 = num - sp;

                if (step1 < step2) {
                    NearestPrime = bp;
                } else {
                    NearestPrime = sp;
                }

                System.out.println("First Smallest Prime is:: " + sp);
                System.out.println("\nFirst biggest Pime is:: " + bp);
                System.out.println("\nNearest prime number of " + num + " is " + NearestPrime + ".");
            }

            // Second Prime Number (Input)
            System.out.println("\n----Second Prime Number Inputs----");

            if (inPrime(num1)) {
                System.out.println(num1 + " itself it is a Prime Number");
            } else {
                int sp1 = -1;
                int bp1 = -1;

                for (int j = num1; j > 0; j--) {
                    if (inPrime(j)) {
                        sp1 = j;
                        break;
                    }
                }

                int count = num1 + 1;

                while (true) {
                    if (inPrime(count)) {
                        bp1 = count;
                        break;
                    }
                    count++;
                }

                int step3 = bp1 - num1;
                int step4 = num1 - sp1;

                if (step3 < step4) {
                    NearestPrime1 = bp1;
                } else {
                    NearestPrime1 = sp1;
                }

                System.out.println("First Smallest Prime is:: " + sp1);
                System.out.println("\nFirst biggest Pime is:: " + bp1);
                System.out.println("\nNearest prime number of " + num1 + " is " + NearestPrime1 + ".");

                int step5 = sp + sp1;
                int step6 = bp + bp1;
        
                int print = step5 * step6;
        
                System.out.println("\nThe Product is:: " + print);
            }
        }
    }
}