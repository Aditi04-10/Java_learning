package Abstraction;

public class SavingAccount extends BankAccount{  //It will give error because it says that either implement both the abstract methods of
                                                 // BankAccount class or do this class also abstract(then we can't make object of this class)
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public void deposit(double amount) {
        System.out.println("Deposited");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawn");
    }
}
