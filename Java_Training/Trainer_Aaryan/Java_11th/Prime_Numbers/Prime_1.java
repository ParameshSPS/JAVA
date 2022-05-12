package Java_Training.Trainer_Aaryan.Java_11th.Prime_Numbers;

public class Prime_1 {
    static int i = 2;

    public static boolean isPrime(int n) {

        if (n == 0 || n == 1) {
            return false;
        }

        if (n == i)
            return true;

        if (n % i == 0) {
            return false;
        }
        i++;
        return isPrime(n);
    }

    public static void main(String[] args) {
        if (isPrime(67)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime Number");
        }
    }
}
