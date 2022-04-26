package Java_Training.Trainer_Manish.Day_2.B_Array;

public class Example4 {
    public static void main(String[] args) {
        int[] salaries = { 20000, 25000, 55000, 47000, 38000 };
        int salaryToFind = 55000;

        String result = "Not Found";

        for (int index = 0; index < salaries.length; index++) {
            if (salaryToFind == salaries[index]) {
                // System.out.println("Found");
                // break;
                result = "Found";
                break;
            }
            // else {
            // System.out.println("Not Found");
            // }
        }
        System.out.println(result);
    }
}