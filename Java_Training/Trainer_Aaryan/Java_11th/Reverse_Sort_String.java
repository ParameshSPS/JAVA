package Java_Training.Trainer_Aaryan.Java_11th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse_Sort_String {
    public static String sort(String str) {
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < str.length(); index++) {
            int n = str.charAt(index); // ASCII
            list.add(n);
        }
        Collections.sort(list);
        String newstr = "";
        for (int i : list) {
            newstr += (char) i;
        }
        return newstr;
    }
    public static void main(String[] args) {
        System.out.println(sort("swetha")); // aehstw
    }
}