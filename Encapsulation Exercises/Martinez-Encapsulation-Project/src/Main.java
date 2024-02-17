import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        Scanner scanner = new Scanner(System.in);
        run(cellphone, scanner);
    }

    public static void run(Cellphone cellphone, Scanner scanner) {
        while (true) {
            printMenu();
            int choice = getValidChoice(scanner);

            switch (choice) {
                case 1:
                    double amount = getValidAmount(scanner);
                    cellphone.loadPrepaid(amount);
                    break;
                case 2:
                    double minutes = getValidMinutes(scanner);
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

    private static void printMenu() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Load Prepaid");
        System.out.println("2. Make a Call");
        System.out.println("3. Send a Text");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");
    }

    private static int getValidChoice(Scanner scanner) {
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
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        return choice;
    }

    private static double getValidAmount(Scanner scanner) {
        double amount;
        while (true) {
            System.out.print("Enter the amount to load: ₱");
            if (scanner.hasNextDouble()) {
                amount = scanner.nextDouble();
                if (amount >= 0) {
                    break;
                } else {
                    System.out.println("Invalid amount. Please enter a non-negative value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        return amount;
    }

    private static double getValidMinutes(Scanner scanner) {
        double minutes;
        while (true) {
            System.out.print("Enter the minutes for the call: ");
            if (scanner.hasNextDouble()) {
                minutes = scanner.nextDouble();
                if (minutes >= 0) {
                    break;
                } else {
                    System.out.println("Invalid minutes. Please enter a non-negative value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        return minutes;
    }
}