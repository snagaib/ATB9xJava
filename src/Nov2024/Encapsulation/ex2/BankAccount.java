package Nov2024.Encapsulation.ex2;

public class BankAccount {
    public double getBalance() {
        return balance;
    }

    private double balance = 1000;
    private String accHolder;

    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }


public double deposit(double money){
        if (money>0){
            balance = balance+ money;
            System.out.println("Dep successful");
                    }
        else {
            System.out.println("Amount is Invalid");

        }
        return balance;
}
public double withdraw(double money){
        if(balance>=money){
            balance = balance - money;
            System.out.println("Withdraw successful");
        }
        else{
            System.out.println("Invalid withdraw request");
        }
        return balance;
}


}
