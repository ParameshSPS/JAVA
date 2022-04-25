package Java_Training.Trainer_Aaryan.Java_25th.Tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter weight range: 1.greater than 90, 2.less than 30, 3.between 45-60");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Fat");
                    break;
                case 2:
                    System.out.println("Thin");
                    break;
                case 3:
                    System.out.println("Healthy");
                    break;
                default:
                    break;
            }
        }
    }
}