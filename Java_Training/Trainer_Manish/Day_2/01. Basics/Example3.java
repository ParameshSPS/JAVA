package Java_Training.Trainer_Manish.Day_2.Basics;

public class Example3 {
    public static void main(String[] args) {
        int marks = 80;

        if (marks < 40) {
            System.out.println("Sorry You Failed");
        } else if (marks >= 40 && marks < 60) {
            System.out.println("Second Devision");
        } else if (marks >= 60 && marks < 75) {
            System.out.println("First Devision");
        } else {
            System.out.println("Distinct");
        }
    }
}