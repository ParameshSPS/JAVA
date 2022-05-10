package Code_Test;

import java.util.*;

public class First_Code {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number: ");

            int num = scanner.nextInt();

            System.out.println("Hello Good Morning Welcome You");

            System.out.println("Enter the String: ");

            String arr[] = new String[num];

            for (int i = 0; i < num; i++)   
            arr[i] = scanner.next();

            int length = 0;

            ArrayList<String> list = new ArrayList<String>();

            for (int i = 0; i < num; i++) {
                length = arr[i].length();

                if (length % 2 == 0) {
                    list.add(arr[i]);
                }
                if (list.size() == 0) {
                    System.out.println("Failed --> Best of Luck For Next Attempt.");
                } else {
                    Iterator it = list.iterator();
                    int max = 1;
                    String res = "";

                    while (it.hasNext()) {
                        String t = (String) it.next();

                        if (t.length() > max) {
                            res = t;
                            max = t.length();
                        }
                    }
                    System.out.println("Passed! Congrats --> " + res);
                }
            }
        }

    }
}