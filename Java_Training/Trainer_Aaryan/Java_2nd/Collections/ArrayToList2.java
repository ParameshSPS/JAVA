package Java_Training.Trainer_Aaryan.Java_2nd.Collections;

import java.util.ArrayList;

public class ArrayToList2 {
    public static void main(String[] args) {
        // Array
        String[] fruits = new String[3];

        fruits[0] = "mango";
        fruits[1] = "Apple";
        fruits[2] = "Strawberry";

        System.out.println(fruits[1]); // Apple

        // ArrayList
        ArrayList fruitList = new ArrayList();
        fruitList.add("Mongo");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("ABCD");

        fruitList.remove("ABCD");
        // fruitList.clear();
        System.out.println(fruitList.contains("Apple"));

        System.out.println(fruitList);
    }
}