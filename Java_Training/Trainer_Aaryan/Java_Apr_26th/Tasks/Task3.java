// Create a program to show Current Date & Time ?

package Java_Training.Trainer_Aaryan.Java_Apr_26th.Tasks;

import java.time.LocalDate;
// import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task3 {
    public static void main(String[] args) {
        String FirstName = "Paramesh";
        String LastName = "Sidhanatham";

        String FullName = FirstName + " " + LastName;
        System.out.println(FullName);

        System.out.println(LocalDate.now()); // Date
        System.out.println(LocalTime.now()); // Time

        // System.out.println(LocalDateTime.now()); // Date And Time
    }
}