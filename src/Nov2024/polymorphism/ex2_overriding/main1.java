package Nov2024.polymorphism.ex2_overriding;

public class main1 {
    public static void main(String[] args) {

//This is to use Array to create new objects and iterate calling them.

                Animal[] animals = { new Animal(), new Dog(), new Cat() };

                for (Animal animal : animals) {
                    animal.sound();
                }
            }
        }