package Nov2024.Encapsulation.ex2;

public class Runner_bank {
    public static void main(String[] args) {
        BankAccount myacc = new BankAccount();
        myacc.setAccHolder("Sam");
        myacc.deposit(-500);
        System.out.println("Balance:"+myacc.getBalance());
        myacc.withdraw(11250);
        System.out.println("Balance:"+myacc.getBalance());
    }
}
