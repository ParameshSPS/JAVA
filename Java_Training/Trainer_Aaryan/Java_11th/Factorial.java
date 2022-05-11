package Java_Training.Trainer_Aaryan.Java_11th;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        // 5! = 5 * 4 * 3 * 2 * 1
        int result = 1;
        // n - 1
        for (int i = n; i > 0; i--) {
            result *= i;
        }

        System.out.println("Factorial of " + n + " is = " + result);
    }
}
