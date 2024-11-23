package Nov2024.Super.ex1;

public class Vehicle {
    public Vehicle(){
        System.out.println("Vehicle constructor");
    }
    public Vehicle(int max_speed){
        this.max_speed = max_speed;
        System.out.println("Vehicle constructor max speed"+max_speed);

    }
    public void display(){
        System.out.println("Vehicle Display");
    }
    private int max_speed = 180;
    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }
}



