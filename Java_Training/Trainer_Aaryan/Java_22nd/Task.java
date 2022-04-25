package Java_Training.Trainer_Aaryan.Java_22nd;

public class Task {
public static void checkForAdult(int age) {
if (age >= 18) {
System.out.println("Param is an Adult");
} else {
System.out.println("Azeez is not an Adult");
}
}

public static void main(String[] args) {
checkForAdult(24);
}
}

// Example

/*
 * package Basics;
 * 
 * public class task {
 * public static void checkForAdult(int age) {
 * if (age >= 18) {
 * System.out.println("Param is an Adult");
 * }
 * if(age < 18) {
 * System.out.println("Azeez is not an Adult");
 * }
 * }
 * 
 * public static void main(String[] args) {
 * checkForAdult(23);
 * }
 * }
 */

// Example

/*
 * package Basics;
 * 
 * // import
 * import java.util.Scanner;
 * // import java.util.*;
 * 
 * public class task {
 * public static void main(String[] args) {
 * String name = "Paramesh";
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter a age");
 * 
 * // input
 * int age = sc.nextInt();
 * 
 * if (age >= 18) {
 * System.out.println(name + " " + "is an Adult");
 * }
 * else {
 * System.out.println(name + " " + "is not an Adult");
 * }
 * }
 * }
 */

// Example

/*
 * package Basics;
 * 
 * // import
 * import java.util.Scanner;
 * // import java.util.*;
 * 
 * public class task {
 * public static void main(String[] args) {
 * System.out.println("Enter a name");
 * Scanner sc = new Scanner(System.in);
 * // input
 * String name = sc.nextLine();
 * 
 * System.out.println("Enter a age");
 * int age = sc.nextInt();
 * 
 * if (age >= 18) {
 * System.out.println(name + " " + "is an Adult");
 * }
 * else {
 * System.out.println(name + " " + "is not an Adult");
 * }
 * }
 * }
 */

// Example

/*
 * package Java_Training.Trainer_Aaryan.Java_22nd;
 * 
 * import java.util.Scanner; // necessary
 * 
 * public class Task {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Enter your name :- ");
 * String name = sc.nextLine();
 * 
 * System.out.println("Enter your age :-");
 * int age = sc.nextInt();
 * 
 * if(age >= 18) {
 * System.out.println(name + " is an Adult");
 * } else if(age < 0) {
 * System.out.println("Invalid Age!");
 * } else {
 * System.out.println(name + " is not an adult");
 * }
 * sc.close();
 * }
 * }
 */