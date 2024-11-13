package Nov2024.polymorphism.ex1_overloading;

public class Runner_calculator {
    public static void main(String[] args) {


        calculator calc = new calculator();
        calc.add(2,3);
        calc.add(2.4,3.2);
        calc.add(2,4,7);
        //Store the method returned value in a variable andthen try printing else print in the method itself.
//        System.out.println("Printing using object");
//        System.out.println("sum1:"+calc.sum1);
    }
}
