package Java_Training.Trainer_Aaryan.Java_26th.Tasks;

public class Tassk6_Marks {
    public static void main(String[] args) {
        int[] Student_Marks = { 20, 60, 06, 53, 53, 98, 59, 35, 87, 45 };

        int max = Student_Marks[0];
        int min = Student_Marks[0];

        int sum = 0;
        for (int i = 0; i < Student_Marks.length; i++) {
            sum = sum + Student_Marks[i];

            if (Student_Marks[i] > max) {
                max = Student_Marks[i];
            }

            if (Student_Marks[i] < min) {
                min = Student_Marks[i];
            }
        }
        int Avg = sum / Student_Marks.length;

        System.out.println("Greatest Marks: " + max);
        System.out.println("Lowest Number: " + min);
        System.out.println("Average of Marks: " + Avg + " %");
    }
}