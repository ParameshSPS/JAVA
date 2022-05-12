package Java_Training.Trainer_Aaryan.Java_11th.Prime_Numbers;

public class Prime_Numbers {

    public static void main(String[] args) {

        int num = 50, 
        count;

        System.out.println("Prime numbers from 1 to 50 are :");

        for (int i = 1; i <= num; i++) {
            count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}
