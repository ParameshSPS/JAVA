package Java_Training.Trainer_Manish.Day_1;

public class Example6 {
    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Sum = " + c);
    }

    public void subtract(int a, int b) {
        int c = a - b;
        System.out.println("Subtract = " + c);
    }

    public void divide(int a, int b) {
        int c = a / b;
        System.out.println("Divide = " + c);
    }

    public void multiple(int a, int b) {
        int c = a * b;
        System.out.println("Multiple = " + c);
    }

    public static void main(String[] args) {
        Example6 obj = new Example6();
        obj.add(40, 20);
        obj.subtract(40, 10);
        obj.divide(10, 4);
        obj.multiple(10, 6);
    }
}