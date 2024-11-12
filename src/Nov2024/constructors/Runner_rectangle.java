package Nov2024.constructors;

public class Runner_rectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        System.out.println("Default Area: "+r1.area);
        Rectangle r2 = new Rectangle(6,5);

        System.out.println("Parameterised Area: "+r2.area);



    }
}
