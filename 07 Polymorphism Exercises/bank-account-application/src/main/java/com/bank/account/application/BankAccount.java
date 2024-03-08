    package com.bank.account.application;

    public class BankAccount {

        private String accountNumber;

        private String accountHolderName;

        private double balance;

        private int pin;

        public BankAccount(String accountNumber, String accountHolderName, double balance, int pin) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
            this.pin = pin;
        }


        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getAccountHolderName() {
            return accountHolderName;
        }

        public void setAccountHolderName(String accountHolderName) {
            this.accountHolderName = accountHolderName;
        }

        public double getBalance() {
            return balance;
        }

        public void updateBalance(double newBalance) {
            this.balance = newBalance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public int getPin() {
            return pin;
        }

        public void setPin(int pin) {
            this.pin = pin;
        }

        public void deposit(double amount) {balance += amount; }

        public void withdraw(double amount) {balance -= amount; }


    }
