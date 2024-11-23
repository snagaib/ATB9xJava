package Nov2024.generics;

public class ex1_generics {
    public static void main(String[] args) {
        sum(23,45);
       // System.out.println(a+b);
       // sum("abi", "nan");
        //sum(true, false);
    }
    public static <T> T sum(T a, T b){
        System.out.println(a);
        System.out.println(b);
        //System.out.println(a+b);
        return null;
    }
}
