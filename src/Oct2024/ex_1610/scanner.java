package Oct2024.ex_1610;


import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        // Scanner - Class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        // int age = scanner.nextInt();
//        float age = scanner.nextFloat();
        double age = scanner.nextDouble();

        System.out.println(age > 25 ? "Allowed to Goa" : "Not Allowed");


        scanner.close();
    }
}