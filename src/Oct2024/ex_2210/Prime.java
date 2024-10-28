package Oct2024.ex_2210;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        if ( num == 2 || num == 3){
            System.out.println (" Is a prime number");
        }
        else if (num % 2 == 0){
            System.out.println("Not a prime number");
        } else  {


        for (int i = 3; i >= Math.sqrt(num); i+=2 ) {
            if (num % i == 0) {
                System.out.println("Not a prime");
                break;

            }
            //else {
            //    System.out.println("Is a prime number");
           // }
        }
        }
    }
}
