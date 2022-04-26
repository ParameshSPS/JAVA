package Java_Training.Trainer_Aaryan.Java_26th;

public class String_Example {
    public static void main(String[] args) {
        String name = "My name is Paramesh";
        // String Name = "My, name is, Paramesh";

        System.out.println(name.length()); // 19
        System.out.println(name.charAt(9)); // s
        System.out.println(name.charAt(name.length() - 1)); // h
        System.out.println(name.substring(11, 19)); // Paramesh
        System.out.println(name.indexOf("a")); // 4
        System.out.println(name.lastIndexOf("a")); // 14
        System.out.println(name.equals("My name is Paramesh")); // True
        System.out.println(name.replace("Paramesh", "Aaryan")); // My name is Aaryan

        System.out.println(reverse(name)); // ==> Create a Reverse String -> 27 line

        String[] sarr = name.split(" ");
        // String[] sarr = Name.split(",");

        for (String str : sarr) {
            System.out.println(str);
        }
    }

    public static String reverse(String s) {
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            str += s.charAt(i);
        }
        return str;
    }
}