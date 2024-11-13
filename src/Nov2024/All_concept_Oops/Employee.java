package Nov2024.All_concept_Oops;
//Question: Design an Employee Management System
//Objective: Implement a basic Employee Management System that tracks different types of employees using constructors, inheritance, access modifiers, encapsulation, and polymorphism.
//
//Instructions:
//Create a Base Class Employee:
//
//Fields (use appropriate access modifiers to encapsulate data):
//name (String)
//id (int)
//salary (double)
//Constructor: Initialize name, id, and salary.
//        Methods:
//calculateBonus() (polymorphism): Return salary * 0.1 (10% of salary).
//displayDetails(): Print name, id, salary, and bonus (calculated using calculateBonus()).
//Create a Subclass Manager (Inherits from Employee):
//
//Fields:
//department (String)
//teamSize (int)
//Constructor: Initialize name, id, salary, department, and teamSize.
//        Override calculateBonus(): Return salary * 0.15 (15% of salary).
//Override displayDetails(): Call super.displayDetails() to print common details, then print the department and team size.
//Create a Subclass Developer (Inherits from Employee):
//
//Field:
//programmingLanguage (String)
//Constructor: Initialize name, id, salary, and programmingLanguage.
//        Override calculateBonus(): Return salary * 0.12 (12% of salary).
//Override displayDetails(): Call super.displayDetails() to print common details, then print the programming language.
//Main Class:
//
//In the main method, create instances of Manager and Developer using their constructors.
//Set some example values for the Manager and Developer fields.
//Store these objects in an array or list of type Employee.
//Loop through the array and call displayDetails() on each employee to demonstrate polymorphism.
//Expected Output:
//For each Employee object in the array, the overridden displayDetails() method should display the unique information for Manager or Developer along with their calculated bonus.

public class Employee {
    String name;
    int id;


    private double salary;

    public double getSalary() {
        return salary;
    }

//    public void setSalary(double salary) {
//       this.salary = salary;
//    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


        public double calculateBonus(){

            return salary * 0.15;
        }
        public void displayDetails(){
            System.out.println("Name:"+name);
            System.out.println("Id:"+id);
            System.out.println("salary:"+getSalary());
            double bonus = calculateBonus();
            System.out.println("Bonus"+bonus);
        }

    }

