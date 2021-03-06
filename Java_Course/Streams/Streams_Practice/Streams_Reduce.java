package Java_Course.Streams.Streams_Practice;

import java.util.*;
import java.util.stream.IntStream;

public class Streams_Reduce {
    public static void main(String[] args) {
        // stream reduces to single resultant value,
        // for example, maximum, minimum, sum, product, etc.
        // Reducing is the repeated process of combining all elements.

        // creating a list of Strings
        List<String> words = Arrays.asList("SPS", "Param", "for", "ParamQuiz", "ParamforParam");

        // The lambda expression passed to
        // reduce() method takes two Strings
        // and returns the longer String.
        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> longestString = words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length()
                        ? word1
                        : word2);

        // Displaying the longest String
        longestString.ifPresent(System.out::println);

        // Example 1
        // String array
        String[] array = { "Param", "for", "Param" };

        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> String_combine = Arrays.stream(array)
                .reduce((str1, str2) -> str1 + "-" + str2);

        // Displaying the combined String
        if (String_combine.isPresent()) {
            System.out.println(String_combine.get());
        }

        // Example 2
        // to get the sum of all elements
        // Creating list of integers
        List<Integer> array1 = Arrays.asList(-2, 0, 4, 6, 8);

        // Finding sum of all elements
        int sum = array1.stream().reduce(0,
                (element1, element2) -> element1 + element2);

        // Displaying sum of all elements
        System.out.println("The sum of all elements is: " + sum);

        // Example 3
        // To get the product of all elements
        // in given range excluding the rightmost element
        int product = IntStream.range(2, 8)
                .reduce((num1, num2) -> num1 * num2)
                .orElse(-1);

        // Displaying the product
        System.out.println("The product is : " + product);
    }
}