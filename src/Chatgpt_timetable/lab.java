package Chatgpt_timetable;
// Main class
public class lab {

    public static void main(String[] args) {
        Child c = new Child();
        c.loan50k();
        c.load25K();
    }
}

// Child class extending Father
class Child extends Father {

    @Override
    public void loan50k() {
        System.out.println("Child is giving the 50K loan");
    }
}

// Abstract Father class
abstract class Father {
    public abstract void loan50k(); // Ensure public access modifier matches overridden method

    public void load25K() {
        System.out.println("Done by Father!!");
    }
}

