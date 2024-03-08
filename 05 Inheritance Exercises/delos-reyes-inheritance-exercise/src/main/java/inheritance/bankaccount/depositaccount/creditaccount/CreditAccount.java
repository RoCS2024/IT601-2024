package main.java.inheritance.bankaccount.depositaccount.creditaccount;

import main.java.inheritance.bankaccount.BankAccount;

import java.util.Date;

public class CreditAccount extends BankAccount {
    private String cvv;
    private String expirationDate;

    public CreditAccount(String accountNumber, String accountName, double balance) {
        super (accountNumber, accountName, balance);
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }
    }

