package Java_Training.Trainer_Aaryan.Java_May_11th;

public class Replace_Delete {
    public static void main(String[] args) {
        // Use the replace Function to Remove a Character From String in Java
        String str = "Paramesh For ParameshSPS";

        System.out.println("String after Removing 'For' = " + str.replace("For",
                ""));
        // Paramesh ParameshSPS

        System.out.println("String after Removing First 'SPS' = " +
                str.replace("SPS", ""));
        // Paramesh For Paramesh

        System.out.println("String after replacing all small letters = " +
                str.replaceAll("([a-z])", ""));
        // P F PSPS

        // Example 1
        // Use the deleteCharAt Method to Remove a Character From String in Java
        StringBuilder MyString = new StringBuilder("Hello World");
        System.out.println("\nThe string before removing character: " + MyString);
        MyString = MyString.deleteCharAt(5);
        System.out.println("The string after removing character: " + MyString);
        // HelloFriends

        // Example 2
        // Use the substring Method to Remove a Character From String in Java
        String string = "Hello Friends";
        int Position = 5;
        System.out.println("\nThe string before removing character: " + string);
        string = string.substring(0, Position) + string.substring(Position + 1);
        System.out.println("The string after removing character: " + string);
        // HelloFriends
    }
}