package Nov2024.All_concept_Oops;

public class Manager extends Employee{
    String dept;
    int teamSize;
    public Manager(String name, int id, double salary, String dept, int teamSize){
        super(name, id, salary);
        this.teamSize = teamSize;
        this.dept = dept;
            }
            @Override
            public double calculateBonus(){
            return getSalary()* 0.15;

            }

            public void displayDetails(){
            super.displayDetails();
                System.out.println("Dept" +dept);
                System.out.println("Team size:" +teamSize);
            }
}
