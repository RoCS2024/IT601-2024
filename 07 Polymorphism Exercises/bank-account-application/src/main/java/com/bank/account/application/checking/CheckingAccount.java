package com.bank.account.application.checking;

import com.bank.account.application.BankAccount;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, String accountHolderName, double balance, int pin, BankAccount myAccount) {
        super(accountNumber, accountHolderName, balance, pin);
        updateBalance(myAccount.getBalance());
    }

    public void displayCheckingAccount() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder Name: " + getAccountHolderName());
        System.out.println("Balance: " + getBalance());
    }
}
