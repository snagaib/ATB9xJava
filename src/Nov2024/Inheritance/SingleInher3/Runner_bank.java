package Nov2024.Inheritance.SingleInher3;

public class Runner_bank {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        SavingsAccount s1 = new SavingsAccount();
        s1.deposits();
        s1.withdraw();
        s1.Interest();
    }
}
