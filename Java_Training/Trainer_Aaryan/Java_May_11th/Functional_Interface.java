package Java_Training.Trainer_Aaryan.Java_May_11th;

// Create a functional interface named Maths define one function add(a, b) with two parameteres a and b. 
// Create one class called M and create object of Maths interface using lambda expression.

@FunctionalInterface
interface Maths {
    int operators(int a, int b);
}

public class Functional_Interface {
    public static void main(String[] args) {
        System.out.println("---------------> Addition <---------------");
        // Addition -> Method 1
        Maths addition = new Maths() {
            @Override
            public int operators(int a, int b) {
                return a + b;
            }
        };

        int add = addition.operators(2, 2);
        System.out.println("\nAddition --> " + add);

        // Lamda Expression 1 (Addition)
        Maths addition1 = (int a, int b) -> {
            return a + b;
        };
        System.out.println("\nAddition - 1 --> " + addition1.operators(2, 2));

        // Lamda Expression 2 (Addition)
        Maths addition2 = (int a, int b) -> (a + b);
        System.out.println("\nAddition - 2 --> " + addition2.operators(2, 2));

        // Lamda Expression 3 (Addition)
        Maths addition3 = (a, b) -> (a + b);
        System.out.println("\nAddition - 3 --> " + addition3.operators(2, 2));

        System.out.println("\n---------------> Substraction <---------------");

        // Lamda Expression (Substraction)
        Maths sub = (a, b) -> (a - b);
        System.out.println("\nSubstraction --> " + sub.operators(6, 2));

        System.out.println("\n---------------> Multiple <---------------");

        // Lamda Expression (Multiple)
        Maths mul = (a, b) -> (a * b);
        System.out.println("\nMultiple --> " + mul.operators(2, 2));

        System.out.println("\n---------------> Division <---------------");

        // Lamda Expression (Division)
        Maths div = (a, b) -> (a / b);
        System.out.println("\nDivision --> " + div.operators(8, 2));
    }
}