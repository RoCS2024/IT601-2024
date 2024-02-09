import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CellphoneApp cellphoneApp = new CellphoneApp();
        cellphoneApp.run();
    }
}

class CellphoneApp {
    private Cellphone cellphone;
    private Scanner scanner;

    public CellphoneApp() {
        cellphone = new Cellphone();
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            printMenu();
            int choice = getValidChoice();

            switch (choice) {
                case 1:
                    double amount = getValidAmount();
                    cellphone.loadPrepaid(amount);
                    break;
                case 2:
                    double minutes = getValidMinutes();
                    cellphone.makeCall(minutes);
                    break;
                case 3:
                    cellphone.sendText();
                    break;
                case 4:
                    System.out.println("Current balance: ₱" + cellphone.getPrepaidLoad());
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void printMenu() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Load Prepaid");
        System.out.println("2. Make a Call");
        System.out.println("3. Send a Text");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");
    }

    private int getValidChoice() {
        int choice;
        while (true) {
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 5) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            }
        }
        return choice;
    }

    private double getValidAmount() {
        double amount;
        while (true) {
            System.out.print("Enter the amount to load: ₱");
            if (scanner.hasNextDouble()) {
                amount = scanner.nextDouble();
                if (amount >= 0) {
                    break;
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        return amount;
    }

    private double getValidMinutes() {
        double minutes;
        while (true) {
            System.out.print("Enter the minutes for the call: ");
            if (scanner.hasNextDouble()) {
                minutes = scanner.nextDouble();
                if (minutes >= 0) {
                    break;
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        return minutes;
    }
}
