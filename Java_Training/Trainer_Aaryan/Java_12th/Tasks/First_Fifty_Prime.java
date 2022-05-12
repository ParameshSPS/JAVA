package Java_Training.Trainer_Aaryan.Java_12th.Tasks;

public class First_Fifty_Prime {
    public static boolean isPrime(int num) {
        // 2 - (num-1)
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
