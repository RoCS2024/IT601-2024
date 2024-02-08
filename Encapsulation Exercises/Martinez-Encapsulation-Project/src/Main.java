import java.util.Scanner;

class Cellphone {
    private double prepaidLoad;

    public Cellphone() {
        prepaidLoad = 0.0;
    }

    public void loadPrepaid(double amount) {
        prepaidLoad += amount;
        System.out.println("Prepaid load of ₱" + amount + " added successfully. Current balance: ₱" + prepaidLoad);
    }

    public boolean makeCall(double minutes) {
        double callCost = minutes * 5;
        if (prepaidLoad >= callCost) {
            prepaidLoad -= callCost;
            System.out.println("Call made for " + minutes + " minutes. Remaining balance: ₱" + prepaidLoad);
            return true;
        } else {
            System.out.println("Insufficient balance. Please load more prepaid credits.");
            return false;
        }
    }

    public boolean sendText() {
        double textCost = 1;
        if (prepaidLoad >= textCost) {
            prepaidLoad -= textCost;
            System.out.println("Text message sent. Remaining balance: ₱" + prepaidLoad);
            return true;
        } else {
            System.out.println("Insufficient balance. Please load more prepaid credits.");
            return false;
        }
    }

    public double getPrepaidLoad() {
        return prepaidLoad;
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
            System.out.println("\nChoose an option:");
            System.out.println("1. Load Prepaid");
            System.out.println("2. Make a Call");
            System.out.println("3. Send a Text");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to load: ₱");
                    double amount = scanner.nextDouble();
                    cellphone.loadPrepaid(amount);
                    break;
                case 2:
                    System.out.println("Enter the minutes for the call: ");
                    double minutes = scanner.nextDouble();
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
}

public class Main {
    public static void main(String[] args) {
        CellphoneApp cellphoneApp = new CellphoneApp();
        cellphoneApp.run();
    }
}
