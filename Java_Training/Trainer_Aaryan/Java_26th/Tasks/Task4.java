// Create a array of length 10 and Multiply each element ?
/*
package Java_Training.Trainer_Aaryan.Java_26th.Tasks;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;

        // int Mul = 1;
        // for (int i : arr) {
        //     Mul = Mul * i;
        // }
        // System.out.println(Mul);

        int multiply = 1;
        for (int index = 0; index < arr.length; index++) {
            multiply = multiply * arr[index];
        }
        System.out.println("ArrayMultiply = " + multiply);
    }
}
*/

// Example 1

/*
package Java_Training.Trainer_Aaryan.Java_26th.Tasks;

public class Task4 {
    public static void main(String[] args) {
        int n = 3;
        int[] Array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i] * n);
        }
    }
}
*/

// Example 2

/*
package Java_Training.Trainer_Aaryan.Java_26th.Tasks;

public class Task4 {
    // Iterative Java program to multiply array elements
    public static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    // Method to calculate the product of the array
    public static int multiply() {
        int pro = 1;
        for (int i = 0; i < arr.length; i++)
            pro = pro * arr[i];
        return pro;
    }

    // Driver Code
    public static void main(String[] args) {
        // Method call to calculate product
        System.out.println("Score = " + multiply());
    }
}
*/

// Example 3

package Java_Training.Trainer_Aaryan.Java_26th.Tasks;

public class Task4 {
    public static void main(String[] args) {
        int[] Array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int multiply = 1;
        for (int index = 0; index < Array.length; index++) {
            multiply = multiply * Array[index];
        }

        System.out.println("Multiply: " + multiply);
    }
}