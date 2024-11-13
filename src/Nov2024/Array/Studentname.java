package Nov2024.Array;
import java.util.Scanner;

public class Studentname {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define an array to hold 5 student names
        String[] students = new String[5];

        // Get names from the user
        System.out.println("Enter the names of 5 students:");
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            students[i] = scanner.nextLine();
        }

        // Print the names of the students
        System.out.println("\nList of students:");
        for (String student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}

