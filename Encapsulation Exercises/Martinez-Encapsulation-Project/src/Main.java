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
