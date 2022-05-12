package Java_Training.Trainer_Aaryan.Java_May_02nd.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList1 {
    public static void main(String[] args) {
        String[] colors = { "Red", "Green", "Blue" };

        // Step 1
        List list = Arrays.asList(colors);
        System.out.println(list);

        // Step 2
        List<String> li = new ArrayList<>();
        Collections.addAll(li, colors);
        System.out.println(li);

        // Step 3
        for (String string : colors) {
            li.add(string);
        }
        System.out.println(li);
    }
}