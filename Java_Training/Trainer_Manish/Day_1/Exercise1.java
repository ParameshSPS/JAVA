package Java_Training.Trainer_Manish.Day_1;

public class Exercise1 {
    public static void findIfEvenOrOdd(int x){
        if(x%2==0) {
            System.out.println(x + " is a Even Number");
        }
        else {
            System.out.println(x + " is a Odd Number");
        }
    }

    public static void main(String[] args) {
        findIfEvenOrOdd(10);
    }
}