package Java_Training.Trainer_Aaryan.Java_May_02nd.Collections;

import java.util.Stack;

public class Stack_Example {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.isEmpty()); // False

        s.pop(); // Delete last item

        s.forEach(System.out::println);
        // System.out.println(s);
    }
}