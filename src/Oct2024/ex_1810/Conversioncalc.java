package Oct2024.ex_1810;
import java.util.Scanner;

public class Conversioncalc {
    public static void main(String[] args) {
        //input num
        //select conversion
        //convert cal
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the conversion table 1 - Km->miles and 2 for Clecius to Farenheit");
        int tab = scan.nextInt();
        switch(tab){
            case 1:
                System.out.println("enter km:");
                double km = scan.nextDouble();
                double miles = km*0.621;
                System.out.printf("miles --->"+miles);
                break;

            case 2:
                System.out.println("Enter Celcius:");
                double celcius = scan.nextDouble();
                double farenheit = (celcius*9/5)+32;
                System.out.printf("Farenheit ---->" +farenheit);
                break;
            default:
                System.out.println("Invalid");
                break;


        }
        scan.close();

    }


}
