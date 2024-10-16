package Oct2024.ex_1510;

public class ternary {
    public static void main(String[] args) {
        int a=17, b=18, c=15;
        int result= (a>b&&a>c)?a:((b>a&&b>c)?b:c);
        System.out.printf("the largest number is %d",result);
        System.out.println("/n");

        int ter1= (a>=b&&a>=c)?a:((b>=c)?b:c);
        System.out.printf("According to sir %d", ter1);

    }
}
