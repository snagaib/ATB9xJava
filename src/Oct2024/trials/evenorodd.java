package Oct2024.trials;
import java.util.Scanner;
public class evenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");

        int number = sc.nextInt();
        if (number%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Number is odd");
        }



    }
}