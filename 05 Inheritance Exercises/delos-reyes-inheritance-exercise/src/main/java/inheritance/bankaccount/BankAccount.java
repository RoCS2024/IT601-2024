package main.java.inheritance.bankaccount;

public class BankAccount {
   public static String accountNumber;
   public static String accountName;
   public static double balance;

   public BankAccount (String accountNumber, String accountName, double balance) {
       this.accountNumber = accountNumber;
       this.accountName = accountName;
       this.balance = balance;
   }

    public double getBalance() {
        return balance;
    }


    public void depositMoney (double amount) {
       if (amount > 0) {
           balance += amount;
            System.out.println("Deposited" + " " + amount + " " + " into account" + " " + accountNumber + ". New balance is" + " " + balance);
        } else {
           System.out.println("Invalid amount.");
       }
    }

    public void withdrawMoney (double amount) {
       if (amount > 0 && amount <= balance) {
           balance -= amount;
           System.out.println("Withdrew " + " " + amount + "from account" + " " + accountNumber + " " +"New balance is " + balance);
       } else {
           System.out.println("Insufficient funds.");
       }
    }

    public void displayBalance() {
        System.out.println("Account " + accountNumber + " balance " + balance);
    }


}


