package Java_Training.Trainer_Aaryan.Java_May_11th;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Convert_Char_Int {
    public static void main(String[] args) {

        // Sort
        String sorted = Stream.of("edcba".split(""))
                .sorted()
                .collect(Collectors.joining());

        System.out.println(sorted);

        // Char to Int
        char ch = '4';
        System.out.println("char value: " + ch);

        // Convert char to int
        int a1 = Character.getNumericValue(ch);
        System.out.println("int value: " + a1);

        // Example 1
        char c = 'a'; // char c = 'A';
        char c1 = '4';

        // Convert char to int
        int a = c;
        int b = c1;

        System.out.println(a); // 97
        System.out.println(b); // 52

        // Example 2
        char no = '3';

        int n;

        n = no - '0'; // 51 - 48 = 3
        n = no + '0'; // 51 + 48 = 99

        System.out.println(n);
    }
}