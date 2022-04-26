package Java_Training.Trainer_Manish.Day_2.B_Array;

public class Example1 {
    public static void main(String[] args) {
        int[] marks = { 91, 60, 06, 53, 53, 100 };

        System.out.println(marks[3]); // Output = 30

        for (int index = 0; index < marks.length; index++) {
            System.out.println(marks[index]);
        }
    }
}

// Output = 91, 60, 6, 53, 53, 100;