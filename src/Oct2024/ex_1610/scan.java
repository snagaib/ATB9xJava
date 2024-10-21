package Oct2024.ex_1610;
import java.sql.SQLOutput;
import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age");

        int age = scan.nextInt();
        System.out.printf("Age is %d", age);
    }
}