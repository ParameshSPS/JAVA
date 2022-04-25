package Java_Training.Trainer_Manish.Day_2.Array;

public class Example3 {
    public static void main(String[] args) {
        int[] ages = { 91, 60, 06, 53, 53, 100 };

        int sum = 0;
        for (int index = 0; index < ages.length; index++) {
            sum = sum + ages[index];
        }

        int Avg = sum / ages.length;

        System.out.println("Average:" + Avg);
    }
}