package Java_Training.Trainer_Aaryan.Java_26th.Tasks;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        int[] Array = { 10, 20, 30, 40 };

        System.out.println(Array[2]);

        for (int index = 0; index < Array.length; index++) {
            System.out.println(Array[index]);
        }

        // Example 1

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        // Example 2

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        cars[0] = "Cycle";
        System.out.println(cars[1]);
        // Now outputs Cycle instead of Volvo
    }
}