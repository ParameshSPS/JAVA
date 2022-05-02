package Java_Training.Trainer_Aaryan.Java_2nd.Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue_Example {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        q.poll(); // Delete first item

        System.out.println(q.isEmpty());

        q.forEach(System.out::println);
    }
}