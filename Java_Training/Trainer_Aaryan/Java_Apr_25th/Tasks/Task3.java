package Java_Training.Trainer_Aaryan.Java_Apr_25th.Tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter weight range: 1.greater than 90, 2.less than 30, 3.between 45-60");
        Scanner sc = new Scanner(System.in);
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
        sc.close();
    }
}