package Nov2024.Abstraction.ex1;

public class Abs1 {
    public static void main(String[] args) {
        Shape circle = new Circle(4.25); // Using polymorphism
        Shape rect = new Rectangle(2, 3);

        circle.calculatearea();
        rect.calculatearea();
    }
}

abstract class Shape {
    abstract void calculatearea(); // Abstract method with no parameters

    public void display() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculatearea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of the Circle: " + area);
    }
}

class Rectangle extends Shape {
    int length, breadth;

    // Constructor to initialize length and breadth
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void calculatearea() {
        int area = length * breadth;
        System.out.println("Area of the Rectangle: " + area);
    }
}
