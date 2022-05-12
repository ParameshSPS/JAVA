package Java_Training.Trainer_Aaryan.Java_Apr_26th.Tasks;

public class Tassk6_Marks {
    public static void main(String[] args) {
        int[] Student_Marks = { 20, 60, 06, 53, 53, 98, 59, 35, 87, 45 };

        int max = Student_Marks[0];
        int min = Student_Marks[0];

        int sum = 0;
        for (int i = 0; i < Student_Marks.length; i++) {
            sum = sum + Student_Marks[i];

            if (Student_Marks[i] > max) {
                max = Student_Marks[i];
            }

            if (Student_Marks[i] < min) {
                min = Student_Marks[i];
            }
        }
        int Avg = sum / Student_Marks.length;

        System.out.println("Greatest Marks: " + max);
        System.out.println("Lowest Number: " + min);
        System.out.println("Average of Marks: " + Avg + " %");
    }
}


// Example

/*
package Java_Training.Trainer_Aaryan.Java_26th.Tasks;

import java.util.Scanner;

public class Tassk6_Marks {
    public static void main(String[] args) {
        int n, max, min;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("No.Of Elemnts: ");
            n = sc.nextInt();

            int a[] = new int[n];
            System.out.println("Enter the elements of Array: ");
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            max = a[0];
            min = a[0];

            // Greatest Marks
            for (int i = 0; i < n; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }

            // Lowest marks
            for (int i = 0; i < n; i++) {
                if (a[i] < min) {
                    min = a[i];
                }
            }

            // Average
            // formula = sum of all elements/ no. of elements

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + a[i];
            }
            int avg = sum / a.length;

            System.out.println("Greatest = " + max);
            System.out.println("Smallest = " + min);
            System.out.println("Average = " + avg);
        }
    }
}
*/