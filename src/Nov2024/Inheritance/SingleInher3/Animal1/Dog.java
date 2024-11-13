package Nov2024.Inheritance.SingleInher3.Animal1;

public class Dog extends Animal1 {
String breed;
Dog(String name, String breed){
    this.name = name;
    System.out.println("Name:"+name);
    this.breed = breed;
    System.out.println("Breed:"+breed);
}
public void speak(){
    System.out.println("Dog barks");
}
}
