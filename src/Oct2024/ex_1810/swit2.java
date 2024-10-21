package Oct2024.ex_1810;
import java.util.Scanner;
public class swit2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("num1");
        int num1 = scan.nextInt();

        System.out.println("num2");
        int num2=scan.nextInt();
        System.out.println("enter operator");

        String operator= scan.next();

        switch (operator){
            case "+":
                System.out.println(num1+num2);
                break;

            case "-":
                System.out.println(num1-num2);
            break;
            case "*":
                System.out.println(num1*num2);
                break;
            case"/":
                System.out.println(num1 / num2);
                break;


            default:
                System.out.println("invalid");
                break;

        }


    }
    //input - num1, num2, result
    //int
    //logic-add,sub
    //

}
