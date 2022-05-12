// For Loop

package Java_Training.Trainer_Aaryan.Java_Apr_25th.Tasks;

public class Task2 {
    public static void main(String[] args) {
        int number = 4;
        for (int i = 1; i <= 10; i++) {
            String multiple = (number + " * " + i + " = " + (number * i));
            System.out.println(multiple);
        }

        // Example 
        int i = 10 + + 11 - - 12 + + 13 - - 14 + + 15;
        System.out.println("Answer is: " + i); // 75
    }
}