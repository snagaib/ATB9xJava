package Nov2024.Abstraction.ex1;

public class abs2 {
    public static void main(String[] args) {
        SavingsAccount saving = new SavingsAccount();
        CurrentAccount current = new CurrentAccount();
        saving.deposit();
        saving.withdraw();
        current.deposit();
        current.withdraw();

    }
}
abstract class BankAccount {
    int accnumber;
    double balance;
    public void deposit(){
        System.out.println("Deposited in Abs class");
    }
    abstract void withdraw();
}
class SavingsAccount extends BankAccount {
    @Override
void withdraw(){
        System.out.println("Withdraw in Savings account");
    }

}
class CurrentAccount extends BankAccount {
    void withdraw(){
        System.out.println("Withdraw in Current account");
    }
}
