package Nov2024.All_concept_Oops;

public class Runner_emp {
    public static void main(String[] args) {
        Employee emp = new Employee("Dan",34,4566);
Manager manager = new Manager("sam",45, 3500, "Citi", 5);
Developer dev = new Developer("DevAr", 46, 3400, "java");
        System.out.println("Manager details below------");
manager.displayDetails();
        System.out.println("Emp details below");
        emp.displayDetails();
        System.out.println("Dev details below------");
dev.displayDetails();
        System.out.println("salary set to 9000");
//emp.setSalary(9000);
        System.out.println("-------------get salary call");
        System.out.println(emp.getSalary());
        System.out.println("emp details below------");
        emp.displayDetails();

    }
}
