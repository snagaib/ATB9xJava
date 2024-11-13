package Nov2024.polymorphism.ex1_overloading;

public class calculator {
    int a, b, c, sum;
    double d, e, sum1;

    public void add(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public void add(double d, double e){
        double sum1 = d + e;
        System.out.println(sum1);

    }
    public void add(int a, int b, int c){
        int sum = a + b + c;
        System.out.println(sum);
    }

}
