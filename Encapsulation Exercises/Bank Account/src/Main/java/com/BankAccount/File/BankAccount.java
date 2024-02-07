package Main.java.com.BankAccount.File;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String pin;

    public BankAccount(){
    }

    public BankAccount(String accountNumber, String accountHolderName, String pin) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
        this.pin = pin;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount, String enteredPin) {
        if (amount > 0 && amount <= balance) {
            if (enteredPin.equals(pin)) {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            } else {
                System.out.println("Invalid PIN.");
            }
        } else {
            System.out.println("Invalid amount for withdrawal.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
