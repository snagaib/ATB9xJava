package Nov2024.Collection_framework;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class arrlist {
    static  List todo = new ArrayList();

    public static void main(String[] args) {

        todo.add(0,"Unload");
        todo.add(1,"Breakfast");
        todo.add(2,"W/D");
        todo.add(3,"Tidy");
        System.out.println(todo.size());
        System.out.println(todo.contains("Tidy"));
        dash();
        print();
        dash();

        todo.add(2,"curd");

        dash();
        todo.remove("curd");

    }
    public static void dash() {
        System.out.println("-----------------------------------------");
    }
    public static void print(){
        for(Object i : todo){
            System.out.println(i);

        }
    }

}

