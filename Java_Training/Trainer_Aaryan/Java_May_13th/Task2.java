package Java_Training.Trainer_Aaryan.Java_May_13th;

import java.util.Scanner;

public class Task2 {
    static int smallestPrime;
    static int bigPrime;
    static int smallestPrime1;
    static int bigPrime1;
    static int NearestPrimeNum1;

    public static boolean inPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int NearestPrimeNum;
            System.out.println("Enter First number :");
            int n1 = sc.nextInt();
            System.out.println("Enter Second number :");
            int n2 = sc.nextInt();

            if (inPrime(n1)) {
                System.out.println(n1 + " itself it is a Prime Number");
            } else {

                smallestPrime = -1;
                bigPrime = -1;

                for (int j = n1; j > 0; j--) {
                    if (inPrime(j)) {
                        smallestPrime = j;
                        break;

                    }
                }
                int count = n1 + 1;
                while (true) {
                    if (inPrime(count)) {
                        bigPrime = count;
                        break;
                    }
                    count++;
                }

                int step1 = bigPrime - n1;
                int step2 = n1 - smallestPrime;

                if (step1 < step2) {
                    NearestPrimeNum = bigPrime;
                } else {
                    NearestPrimeNum = smallestPrime;
                }

                System.out.println("First Smallest Prime is :" + smallestPrime);
                System.out.println("First biggest Pime is :" + bigPrime);
                System.out.println("Nearest prime number of " + n1 + " is " + NearestPrimeNum);
            }

            if (inPrime(n2)) {
                System.out.println(n2 + " itself it is a Prime Number");
            } else {

                smallestPrime1 = -1;
                bigPrime1 = -1;

                for (int i = n2; i > 0; i--) {
                    if (inPrime(i)) {
                        smallestPrime1 = i;
                        break;
                    }
                }
                int count1 = n2 + 1;
                while (true) {
                    if (inPrime(count1)) {
                        bigPrime1 = count1;
                        break;
                    }
                    count1++;
                }

                int step3 = bigPrime1 - n2;
                int step4 = n2 - smallestPrime1;

                if (step3 < step4) {
                    NearestPrimeNum1 = bigPrime1;
                } else {
                    NearestPrimeNum1 = smallestPrime1;
                }
                System.out.println("Second Smallest Prime is :" + smallestPrime1);
                System.out.println("Second Biggest Prime is :" + bigPrime1);
                System.out.println("Second Nearest prime number of " + n2 + " is " + NearestPrimeNum1);

                int z1 = smallestPrime + smallestPrime1;
                int z2 = bigPrime + bigPrime1;
                int y = z1 * z2;
                System.out.println(y);
            }
        }
    }
}