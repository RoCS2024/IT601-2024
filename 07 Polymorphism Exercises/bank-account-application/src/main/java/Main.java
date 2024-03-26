import com.bank.account.application.BankAccount;
import com.bank.account.application.checking.CheckingAccount;
import com.bank.account.application.savings.SavingsAccount;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("BDO We Find Ways");

        System.out.println("Enter account number: ");
        String accountNumber = sc.nextLine();

        System.out.println("Enter account holder name: ");
        String accountHolderName = sc.nextLine();

        System.out.println("Enter PIN number: ");
        int pin = sc.nextInt();

        BankAccount myAccount = new BankAccount(accountNumber, accountHolderName, 0.0, pin);
        CheckingAccount myChecking = new CheckingAccount(accountNumber, accountHolderName, 0.0, pin, myAccount);
        SavingsAccount mySavings = new SavingsAccount(accountNumber, accountHolderName, 0.0, 0);

        int option = 0;
        do {
            System.out.println("\nChoose an Option: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Check Account");
            System.out.println("5. Savings Account");
            System.out.println("Enter your choice: ");
            option = sc.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Enter amount to deposit");
                    double amount = sc.nextDouble();
                    if (amount > 0) {
                        myAccount.deposit(amount);
                        System.out.println("Deposit Successful!. New balance: " + myAccount.getBalance());
                        myChecking.updateBalance(myAccount.getBalance());
                        mySavings.updateBalance(myAccount.getBalance());
                    } else {
                        System.out.println("Invalid amount for deposit.");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();
                    if (amount > 0 && amount <= myAccount.getBalance()) {
                        System.out.println("Enter your PIN: ");
                        int enteredPin = sc.nextInt();
                        if (enteredPin == pin) {
                            myAccount.withdraw(amount);
                            System.out.println("Withdrawal Successful!. New balance: " + myAccount.getBalance());
                            myChecking.updateBalance(myAccount.getBalance());
                            mySavings.updateBalance(myAccount.getBalance());
                        } else {
                            System.out.println("Invalid PIN.");
                        }
                    } else {
                        System.out.println("Invalid amount for withdrawal.");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Your current balance " + myAccount.getBalance());
                    break;
                }
                case 4: {
                    myChecking.displayCheckingAccount();
                    break;
                }
                case 5: {

                    System.out.println("1. Add Interest");
                    System.out.println("2. Set Interest Rate");
                    System.out.println("3. Check Balance");
                    System.out.println("Enter your choice: ");
                    int savingsOption = sc.nextInt();
                    switch (savingsOption) {
                        case 1: {
                            mySavings.addInterest();
                            break;
                        }
                        case 2: {
                            System.out.println("Enter the interest rate (in percentage): ");
                            double interestRate = sc.nextDouble();
                            mySavings.setInterestRate(interestRate);
                            break;
                        }
                        case 3: {
                            System.out.println("Your current savings balance: " + mySavings.getBalance());
                            break;
                        }
                        default: {
                            System.out.println("Invalid option for savings account.");
                            break;
                        }
                    }
                    break;
                }
                case 0: {
                    System.out.println("Thank you for Banking with us!");
                    break;
                }
                default: {
                    System.out.println("Invalid option. Please try a valid option.");
                    break;
                }
            }

        } while (option != 0);
    }
}
