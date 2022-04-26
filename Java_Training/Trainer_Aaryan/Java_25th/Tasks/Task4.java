package Java_Training.Trainer_Aaryan.Java_25th.Tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        int a = 0;

        if (num > 90) {
            a = 1;
        } else if (num < 30) {
            a = 2;
        }
        if (num >= 45 && num <= 60) {
            a = 3;
        }

        switch (a) {
            case 1:
                System.out.println("Fat");
                break;
            case 2:
                System.out.println("Thin");
                break;
            case 3:
                System.out.println("Health");
                break;
            default:
                System.out.println("Invalid");
        }
        sc.close();
    }
}