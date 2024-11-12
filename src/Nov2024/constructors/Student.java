package Nov2024.constructors;

public class Student {
    String name;
    int age;

    Student(){
        System.out.println("Default constructor");
    }
    Student(String name){
        new Student();
        System.out.println("Name constructor");
    }
    Student(String name, int age){

        this.name = name;
        this.age = age;
        new Student(name);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
