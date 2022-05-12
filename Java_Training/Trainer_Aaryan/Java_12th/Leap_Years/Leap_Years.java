package Java_Training.Trainer_Aaryan.Java_12th.Leap_Years;

public class Leap_Years {
    public static void main(String[] args) {
        int year = 2022;

        int n = 10; // Range of Leap years

        int count = 0;

        while (count != n) {
            year = year + 1;

            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                count++;

                System.out.println(year + " ----> is a leap year");
            }
        }
    }
}