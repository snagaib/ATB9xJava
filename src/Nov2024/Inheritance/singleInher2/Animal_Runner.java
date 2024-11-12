package Nov2024.Inheritance.singleInher2;

public class Animal_Runner {
    public static void main(String[] args) {
        LAb l1 = new LAb();
        Animal a1 = new Animal();
        a1.makeSound();
        Dog d1 = new Dog();
      //  Dog d2 = d1;
        d1.makeSound();
        l1.makeSound();

    }
}
