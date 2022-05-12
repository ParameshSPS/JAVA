package Java_Training.Trainer_Aaryan.Java_May_12th.Leap_Years;

public class Leap_Years {
    public static void main(String[] args) {
        int year = 2022;

        // Range of Leap years
        int n = 10; 
        int count = 0;
        System.out.println("Next Leap Years :: \n");

        while (count != n) {
            year = year + 1;

            // if year is divided by 400 then it is a leap year
            // if the year is divided by 4
            // if the year is century
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                count++;

                System.out.println(year + " ----> is a leap year");
            }
        }
    }
}