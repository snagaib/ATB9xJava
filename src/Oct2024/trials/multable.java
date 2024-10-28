package Oct2024.trials;
import java.util.Scanner;
public class multable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the table number:");
        int number = scanner.nextInt();
        for (int i = 0; i < 16; i++) {
            //System.out.println(number, "x" , i, "=", number*i);
            System.out.printf("%d x %d = %d",i,number,i*number);
            System.out.println("\n");
        }
    }
}
