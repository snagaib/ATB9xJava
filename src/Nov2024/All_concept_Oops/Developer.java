package Nov2024.All_concept_Oops;

public class Developer extends Employee{
    String progLang;
    public Developer(String name, int id, double salary, String progLang){
        super(name, id, salary);

        this.progLang = progLang;

    }
    @Override
    public double calculateBonus(){
        return getSalary() *0.12;

    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Prog Lang:"+progLang);
    }

}
