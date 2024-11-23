package Nov2024.Super.ex1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();//This automatically calls Parent Vehicle constructor also.
       // car.display();
        //car.getMax_speed();
        System.out.println(car.getMax_speed());
        Vehicle v1 = new Vehicle(300);
        v1.setMax_speed(340);
        System.out.println("Set max speed ="+v1.getMax_speed());
    }
}
