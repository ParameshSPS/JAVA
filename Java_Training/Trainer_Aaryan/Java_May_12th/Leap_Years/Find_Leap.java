package Java_Training.Trainer_Aaryan.Java_May_12th.Leap_Years;

import java.util.Scanner;

public class Find_Leap {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter an Year :: ");
        try (Scanner sc = new Scanner(System.in)) {
            year = sc.nextInt();
        }
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println(year + " year is a leap year");
        else
            System.out.println(year + " year is not a leap year");
    }
}