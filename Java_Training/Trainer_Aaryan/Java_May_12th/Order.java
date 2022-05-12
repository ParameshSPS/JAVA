package Java_Training.Trainer_Aaryan.Java_May_12th;

import java.util.*;

public class Order {
    public static void main(String[] args) {
        String str = "abcdefgh";
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);
        System.out.println();

        Arrays.sort(arr); // sorted in ascending order

        // print them backwards i.e. descending order.
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i]);
        System.out.println();
    }
}