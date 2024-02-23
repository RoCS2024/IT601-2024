package main.java.inheritance;

import main.java.inheritance.bankaccount.depositaccount.DepositAccount;
import main.java.inheritance.bankaccount.BankAccount;
import main.java.inheritance.bankaccount.depositaccount.creditaccount.CreditAccount;

import java.util.Date;
import java.util.Scanner;

import static main.java.inheritance.bankaccount.BankAccount.accountNumber;
import static main.java.inheritance.bankaccount.BankAccount.balance;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {
            BankAccount depositAccount = new DepositAccount("146783029348", "Aiah Delos Reyes", 1000.0);

            depositAccount.displayBalance();


            int choice;
            do {
                System.out.println("What do you want to do: ");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Make payment online");
                System.out.println("4. Quit.");
                System.out.println("Enter your choice: ");
                choice = sc.nextInt();
                while (choice <= 0 || choice > 4) {
                    System.out.println("Choice must be between 1 and 3. Please enter a valid choice: ");
                    choice = sc.nextInt();
                }
                if (choice == 1) {
                    System.out.println("Enter amount you want to deposit: ");
                    double amount = sc.nextInt();
                    depositAccount.depositMoney(amount);
                    System.out.println("You have successfully deposited to your account " + accountNumber + " Your new balance is " + " " + depositAccount.getBalance());
                } else if (choice == 2) {
                    System.out.println("Enter amount you want to withdraw: ");
                    double amount = sc.nextInt();
                        if (amount > 10000) {
                            System.out.println("You can only withdraw money less than or equals to P10,000. Please enter valid amount again: ");
                        } else if (amount > depositAccount.getBalance()) {
                            System.out.println("You have insufficient balance. Please try again.");
                        } else {
                            depositAccount.withdrawMoney(amount);
                            System.out.println("You have successfully withdrew from your account " + accountNumber + " Your new balance is " + " " + depositAccount.getBalance());
                        }
                } else {
                    System.out.println("Enter amount you will pay: ");
                    double amount = sc.nextInt();
                    depositAccount.withdrawMoney(amount);
                        if (amount > balance) {
                            System.out.println("You have insufficient funds. Please try again.");
                        } else {
                            System.out.println("Payment is successful. Your new balance is " + " " + depositAccount.getBalance());
                        }
                }
            } while (choice != 4);
        }
    }
}








