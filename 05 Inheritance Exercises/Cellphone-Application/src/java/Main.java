import com.celllphone.app.Cellphone;
import com.celllphone.app.Smartphone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Cellphone
        Cellphone basicPhone = new Cellphone(50.0, "GSM", "BasicPhone");

        // Create a Smartphone
        Smartphone smartphone = new Smartphone(100.0, "4G", "Smartphone");

        // Text-based interface for testing
        while (true) {
            System.out.println("Choose a phone to test:");
            System.out.println("1. Basic Phone");
            System.out.println("2. Smartphone");
            System.out.println("3. Exit");

            int choice = getIntInput(scanner);

            switch (choice) {
                case 1:
                    testCellphone(basicPhone, scanner);
                    break;
                case 2:
                    testSmartphone(smartphone, scanner);
                    break;
                case 3:
                    System.out.println("Exiting the application.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void testCellphone(Cellphone cellphone, Scanner scanner) {
        while (true) {
            System.out.println("Choose an action for Basic Phone:");
            System.out.println("1. Display Info");
            System.out.println("2. Make Call");
            System.out.println("3. Send Text");
            System.out.println("4. Go Back");

            int choice = getIntInput(scanner);

            switch (choice) {
                case 1:
                    cellphone.displayInfo();
                    break;
                case 2:
                    System.out.println("Enter call duration in minutes:");
                    int callDuration = getIntInput(scanner);
                    cellphone.makeCall(callDuration);
                    break;
                case 3:
                    cellphone.sendText();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void testSmartphone(Smartphone smartphone, Scanner scanner) {
        while (true) {
            System.out.println("Choose an action for Smartphone:");
            System.out.println("1. Display Info");
            System.out.println("2. Make Call");
            System.out.println("3. Send Text");
            System.out.println("4. Use Data");
            System.out.println("5. Go Back");

            int choice = getIntInput(scanner);

            switch (choice) {
                case 1:
                    smartphone.displayInfo();
                    break;
                case 2:
                    System.out.println("Enter call duration in minutes:");
                    int callDuration = getIntInput(scanner);
                    smartphone.makeCall(callDuration);
                    break;
                case 3:
                    smartphone.sendText();
                    break;
                case 4:
                    System.out.println("Enter data usage in MB:");
                    double dataUsage = getDoubleInput(scanner);
                    smartphone.useData(dataUsage);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static int getIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // consume the invalid input
        }
        return scanner.nextInt();
    }

    private static double getDoubleInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid double.");
            scanner.next(); // consume the invalid input
        }
        return scanner.nextDouble();
    }

}
