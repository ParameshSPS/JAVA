package Java_Training.Trainer_Manish.Day_2.Array;

public class Example5 {
    public static void main(String[] args) {
        String[] cities = { "Chennai", "Kolkata", "Pune", "Mumbai", "Delhi" };
        String cityToFind = "Pune";

        String result = "Not Found";

        for (int index = 0; index < cities.length; index++) {
            if (cityToFind == cities[index]) {
                result = cityToFind + " exist in the given array at index: " + index;
            }
        }
        System.out.println(result);
    }
}