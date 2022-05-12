package Java_Training.Trainer_Aaryan.Java_May_2nd.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class Array_List {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // 0
        list.add(20); // 1
        list.add(30); // 2
        list.add(40); // 3
        list.add(-50); // 4

        list.add(5, 50);

        list.remove(4); // Remove the Element or Index

        System.out.println(list); // [10, 20, 30, 40, 50]

        System.out.println(list.size()); // Array length/size = 5

        System.out.println(list.get(1)); // index 1 = 20

        System.out.println(list.contains(90)); // False
        System.out.println(list.contains(30)); // True

        System.out.println(list.indexOf(40)); // index 3

        // Example 1
        System.out.println("1) Elements: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Example 2
        System.out.println("2) Elements :- ");
        for (int list1 : list) {
            System.out.println(list1);
        }

        // Example 3
        System.out.println("Lambda :-");
        list.forEach(element -> System.out.println(element));

        // Example 4
        System.out.println("Enhanced :-");
        list.forEach(System.out::println);

        // Example 5
        System.out.println("Iterator :-");
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Example 6
        // list.forEach(element -> new call());
    }
}

class call implements Consumer<Integer> {

    @Override
    public void accept(Integer s) {
        System.out.println(s);
    }

}