package Java_Training.Trainer_Aaryan.Java_2nd.Tasks;

import java.util.Stack;

public class Medical1 {
    public static void main(String[] args) {
        Stack<String> medical = new Stack<>();

        medical.push("Patient_Name : Paramesh");
        medical.push("Age: 24");
        medical.push("Location: Dharmavaram");
        medical.push("Mobile: 916006535");
        medical.push("Disease: Fever");
        medical.push("Token_Fee: 300");

        System.out.println("Patient Details: " + medical);
    }
}