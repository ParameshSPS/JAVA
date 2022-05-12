package Java_Training.Trainer_Aaryan.Java_May_6th.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

public class Streams_Example {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(22);
        list.add(31);
        list.add(8);
        list.add(0);
        list.add(27);
        list.add(11);
        list.add(24);
        list.add(37);
        list.add(80);
        list.add(04);
        list.add(99);

        // Example 1
        List<Integer> list1 = new ArrayList<>();

        System.out.println("\nPrint multiply: ");
        for (Integer i : list) {
            list1.add(i * i);
        }
        System.out.println(list1);

        // Example 2
        System.out.println("\nPrint multiply using stream(map): ");
        List<Integer> add = list.stream().map(i -> i + i).collect(Collectors.toList());
        System.out.println(add);

        // Example 3
        System.out.println("\nPrint multiply using stream(set): ");
        Set<Integer> add1 = list.stream().map(i -> i * i).collect(Collectors.toSet());
        System.out.println(add1);

        // Example 1
        System.out.println("\nOdd numbers: ");
        Collections.sort(list);
        for (int e : list) {
            if (e % 2 != 0) {
                System.out.println("Odd number: " + e);
            }
        }

        // Example 2
        System.out.println("\nEven number");
        List<Integer> add2 = list.stream().filter(e -> (e % 2 == 0)).sorted().collect(Collectors.toList());
        System.out.println(add2);

        // Example 3
        System.out.println("\nEven number");
        list.stream().filter(e -> (e % 3 == 0)).sorted()
                .collect(Collectors.toMap(e -> e + " Bow", Function.identity()))
                .forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
    }
}