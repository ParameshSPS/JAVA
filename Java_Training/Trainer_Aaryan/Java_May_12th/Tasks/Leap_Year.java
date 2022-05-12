package Java_Training.Trainer_Aaryan.Java_May_12th.Tasks;

import java.time.Year;

public class Leap_Year {
    public static boolean isLeapYear(int year) {
        return Year.isLeap(year);
    }

    public static void main(String[] args) {
        final int startYear = 2022;
        final int endYear = startYear + 50;

        for (int i = startYear; i < endYear; i++) {
            if (isLeapYear(i)) {
                System.out.println(i);
            }
        }
    }
}