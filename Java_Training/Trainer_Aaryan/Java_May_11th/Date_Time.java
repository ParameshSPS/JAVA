package Java_Training.Trainer_Aaryan.Java_May_11th;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;

public class Date_Time {
    public static void main(String[] args) {

        // Method 1
        System.out.println("Current Data Method - 1");
        System.out.println(LocalDateTime.now());

        // Method 2
        System.out.println("\nCurrent Data Method - 2");
        System.out.println(Clock.systemUTC().instant());

        // Method 3
        System.out.println("\nCurrent Data Method - 3");
        Date current_Date = new Date();

        System.out.println(current_Date);

        // Method 4
        System.out.println("\nCurrent Data Method - 4");
        SimpleDateFormat formatDate = new SimpleDateFormat(
                "dd/MM/yyyy  HH:mm:ss z");

        Date date = new Date();

        formatDate.setTimeZone(TimeZone.getTimeZone("IST"));

        System.out.println(formatDate.format(date)); 
    }
}