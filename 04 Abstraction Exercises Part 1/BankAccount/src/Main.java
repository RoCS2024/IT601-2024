import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountNumber, initialBalance);

        var running = true;
        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 4) {
                    double amount;
                    switch (choice) {
                        case 1:
                            System.out.print("Enter deposit amount: ");
                            amount = scanner.nextDouble();
                            account.deposit(amount);
                            break;
                        case 2:
                            System.out.print("Enter withdrawal amount: ");
                            amount = scanner.nextDouble();
                            account.withdraw(amount);
                            break;
                        case 3:
                            System.out.println("Current balance: $" + account.getBalance());
                            break;
                        case 4:
                            running = false;
                            System.out.println("Exiting...");
                            break;
                    }
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer choice.");
                scanner.next(); // Consume invalid input to avoid infinite loop
            }
        }

        scanner.close();
    }
}


