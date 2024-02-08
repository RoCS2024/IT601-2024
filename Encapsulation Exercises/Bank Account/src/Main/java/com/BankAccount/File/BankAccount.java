package Main.java.com.BankAccount.File;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String pin;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, String accountHolderName, String pin) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
        this.pin = pin;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getPin() {
        return pin;
    }
}
