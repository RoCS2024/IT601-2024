package main.java.inheritance.bankaccount.depositaccount;

import main.java.inheritance.bankaccount.BankAccount;

public class DepositAccount extends BankAccount {
    public DepositAccount(String accountNumber, String accountName, double balance) {
        super(accountNumber, accountName, balance);
    }

    public void displayBalance() {
        System.out.println("Account " + accountNumber + " balance " + balance);
    }
}
