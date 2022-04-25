package Java_Training.Trainer_Manish.Day_2.Array;

public class Example2 {
    public static void main(String[] args) {
        int[] numbers = { 91, 60, 06, 53, 53, 100 };

        int sum = 0;
        for (int index = 0; index < numbers.length; index++) {
            sum = sum + numbers[index];
        }
        System.out.println("Sum:" + sum);
    }
}

// Output = Sum:363;