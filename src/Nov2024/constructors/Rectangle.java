package Nov2024.constructors;

public class Rectangle {
    public int area;
    int length, breadth;
    Rectangle(int length, int breadth ){
        this.length = length;
        this.breadth = breadth;
        //area = length * breadth;
        area(length, breadth);

    }
    Rectangle(){
        length = 1;
        breadth = 1;
        area(length, breadth);
        //area = length * breadth;
    }
public void area(int length, int breadth){
        area = length*breadth;
        //return area;
}
}
