package Java_Training.Trainer_Aaryan.Java_5th;

import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class map {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        System.out.println("Map is empty: " + map.isEmpty()); // true

        map.put("Paramesh", 100);
        map.put("Bhanu", 200);
        map.put("Aaryan", 300);

        System.out.println("Map is empty: " + map.isEmpty()); // false

        System.out.println(map);
        System.out.println("Size of map is: " + map.size()); // 3

        System.out.println(map.get("Paramesh")); // value = 100

        System.out.println("Key : Paramesh, Value : " + map.get("Paramesh"));
        System.out.println("Key : Bhanu, Value : " + map.get("Bhanu"));

        System.out.println("Key : Swetha is there ? " + map.containsKey("Swetha"));
        System.out.println("Value : 300 is there ? " + map.containsValue(300));

        map.remove("Aaryan");
        System.out.println("Key : Aaryan removed");

        map.put("Gopal", 12345678);

        map.forEach((k, v) -> {
            System.out.println("Key : " + k + ", value : " + v);
        });

        if (map.containsKey("Paramesh")) {
            Integer a = map.get("Paramesh");
            System.out.println("Value for key" + " \"Paramesh\" is: " + a);
        }

        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key - " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}