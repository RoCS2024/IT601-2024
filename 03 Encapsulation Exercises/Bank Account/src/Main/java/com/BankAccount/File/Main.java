package Main.java.com.BankAccount.File;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("BDO We Find Ways");

        System.out.println("Enter account number:");
        String accountNumber = sc.next();

        System.out.println("Enter account holder name:");
        String accountHolderName = sc.next();

        System.out.println("Enter PIN number:");
        String pin = sc.next();

        BankAccount myAccount = new BankAccount(accountNumber, accountHolderName, pin);

        int option = 0;
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Enter amount to deposit:");
                    double amount = sc.nextDouble();
                    if (amount > 0) {
                        myAccount.deposit(amount);
                        System.out.println("Deposit successful. New balance: " + myAccount.getBalance());
                    } else {
                        System.out.println("Invalid amount for deposit.");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter amount to withdraw:");
                    double amount = sc.nextDouble();
                    if (amount > 0 && amount <= myAccount.getBalance()) {
                        System.out.println("Enter your PIN:");
                        String enteredPin = sc.next();
                        if (enteredPin.equals(pin)) {
                            myAccount.withdraw(amount);
                            System.out.println("Withdrawal successful. New balance: " + myAccount.getBalance());
                        } else {
                            System.out.println("Invalid PIN.");
                        }
                    } else {
                        System.out.println("Invalid amount for withdrawal.");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Your current balance: " + myAccount.getBalance());
                    break;
                }
                case 0: {
                    System.out.println("Thank you for banking with us!");
                    break;
                }
                default: {
                    System.out.println("Invalid option. Please try again.");
                    break;
                }
            }
        } while (option != 0);
    }
}
