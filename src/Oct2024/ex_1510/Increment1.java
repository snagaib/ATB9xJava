package Oct2024.ex_1510;

public class Increment1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        int b=20;
        System.out.println(--b + b++ + b--);
        System.out.println(b);
    }
}
