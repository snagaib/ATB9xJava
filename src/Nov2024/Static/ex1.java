package Nov2024.Static;

public class ex1 {
    public static void main(String[] args) {
        System.out.println(Student.name);
        //printdetails();
        Student.myStaticMethod();


    }
}
class Student{
    int age = 10;
    static String name = "Stu_name";
    public void printdetails(){
        System.out.println("DEtails of public class");
    }
    static void myStaticMethod(){
        System.out.println("My static method call");
    }
}
