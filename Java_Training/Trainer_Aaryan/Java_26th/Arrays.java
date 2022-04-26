package Java_Training.Trainer_Aaryan.Java_26th;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[4];
        // Same DataType

        arr[0] = 1;
        arr[1] = 2;
        arr[3] = 3;
        arr[2] = 4;

        System.out.println(arr[2]); // Output = 4;

        int sum = 0;
        for (int index = 0; index <= arr.length; index++) {
            // System.out.println(arr[index]);
            sum = sum + index;
        }
        System.out.println("Sum = " + sum);

        // For Each

        int Sum = 0;
        for (int i : arr) {
            // System.out.println(arr[i]);
            sum = sum + i;
        }
        System.out.println(Sum);

        // Example

        Object[] obj = new Object[2];

        obj[0] = "Paramesh";
        obj[1] = 24;

        for (Object ob : obj) {
            System.out.println(ob.toString());
        }

        for (int index = 0; index <= 2; index++) {
            System.out.println(obj[index]);
        }

        // Example

        int[] Array = { 10, 20, 30, 40 };

        System.out.println(Array[2]);

        for (int index = 0; index < Array.length; index++) {
            System.out.println(Array[index]);
        }

        // Example

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}