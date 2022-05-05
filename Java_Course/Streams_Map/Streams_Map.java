package Java_Course.Streams_Map;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;

public class Streams_Map {
    public static void main(String[] args) {
        
        List<Integer> numList = new ArrayList<>();

        numList.add(10);
        numList.add(20);
        numList.add(30);
        numList.add(40);

        // Example 1
        List<Integer> squList = new ArrayList<>();
        for (Integer i : numList) {
            squList.add(i*i);
        }
        System.out.println("List of squared numbers: " + squList);

        // Example 2
        List<Integer> squList1 = numList.stream().map(a -> a*a).collect(Collectors.toList());
        System.out.println("List of squared numbers: " + squList1);

        // Example 1
        Set<Integer> squSet = new HashSet<>();
        for (Integer i : numList) {
            squList.add(i*i);
        }
        System.out.println("List of squared numbers: " + squSet);

    }
}