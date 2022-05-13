package Java_Training.Trainer_Aaryan.Java_May_13th.Calculate_Between_TwoDays;

import java.time.LocalDate;

public class CalculateLeapYearExample {

    public static final Integer LAST_DOY_LEAP_YEAR = 366;
    public static final Integer LAST_DOY = 365;

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("Today's Date : " + date);
        System.out.println("Year : " + date.getYear());
        System.out.println("Leap Year ? -> " + checkLeapYear(date.getYear()));
        System.out.println("Number of days : " + getNumberOfDays(date.getYear()));
    }

    private static boolean checkLeapYear(int year) {

        // Algorithm
        // If year is divisible by 400 then it is leap year
        // OR
        // If year is divisible by 4 but not by 100, then it is leap year

        if ((year % 400 == 0) ||
                ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }

    private static int getNumberOfDays(int year) {

        if (checkLeapYear(year)) {
            return LAST_DOY_LEAP_YEAR;
        } else {
            return LAST_DOY;
        }
    }
}