package Oct2024.ex_2210;
import java.util.Scanner;

public class modulus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        //System.out.println(number);
        number = number % 10;
        System.out.println(number);
    }
}
