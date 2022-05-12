package Java_Training.Trainer_Aaryan.Java_May_05th;

import java.util.*;

public class Set_Example {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(100);
        set.add(200);
        set.add(300);

        set.add(100);

        set.remove(200);

        set.forEach(System.out::println);

    }
}