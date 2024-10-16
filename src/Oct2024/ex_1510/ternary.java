package Oct2024.ex_1510;

public class ternary {
    public static void main(String[] args) {
        int a=10, b=12, c=11;
        int result= (a>b&&a>c)?a:((b>a&&b>c)?b:c);
        System.out.printf("the largest number is %d",result);

    }
}
