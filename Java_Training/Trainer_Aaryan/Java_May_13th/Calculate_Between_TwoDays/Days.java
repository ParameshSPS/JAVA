package Java_Training.Trainer_Aaryan.Java_May_13th.Calculate_Between_TwoDays;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Days {
    public static void main(String[] args) {
        // Using Calendar - calculating number of months between two dates

        LocalDate bday = LocalDate.of(1998, Month.APRIL, 10);
        LocalDate today = LocalDate.now();
        Period age = Period.between(bday, today);
        int years = age.getYears();
        int months = age.getMonths();
        System.out.println("number of years: " + years);
        System.out.println("number of months: " + months);

    }
}