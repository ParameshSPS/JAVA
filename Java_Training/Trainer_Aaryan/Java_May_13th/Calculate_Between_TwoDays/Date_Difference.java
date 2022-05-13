package Java_Training.Trainer_Aaryan.Java_May_13th.Calculate_Between_TwoDays;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Date_Difference {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        // LocalDate birthday = LocalDate.of(2001, Month.JULY, 7);
        LocalDate birthday = LocalDate.of(1998, Month.APRIL, 4); // My Birthday

        Period p = Period.between(birthday, today);
        long p2 = ChronoUnit.DAYS.between(birthday, today);

        // Calculate age or Differnce between two dates
        System.out.println("You are " + p.getYears() + " years");
        System.out.println(p.getMonths() + " months");
        System.out.println(p.getDays() + " days old. (" + p2 + " days total)");

        // System.out.println("\nYou are " + p.getYears() + " years, " + p.getMonths() +
        // " months, and " + p.getDays() + " days old. (" + p2 + " days total)");
    }
}