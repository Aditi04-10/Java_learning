package Abstraction;
//This BankAccount class we made for main implementation where there will be all details of what should be implemented for further classes.

abstract public class BankAccount {  //we can't make object of this class because we declared it Abstract
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);   //This is a abstract method
    public abstract void withdraw(double amount);


}
