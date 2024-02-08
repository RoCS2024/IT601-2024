import java.util.Scanner;

public class Main {
    private double prepaidLoad;

    public Main() {
        prepaidLoad = 0.0;
    }

    public void loadPrepaid(double amount) {
        prepaidLoad += amount;
        System.out.println("Prepaid load of ₱" + amount + " added successfully. Current balance: ₱" + prepaidLoad);
    }

    public void makeCall(double minutes) {
        double callCost = minutes * 5;
        if (prepaidLoad >= callCost) {
            prepaidLoad -= callCost;
            System.out.println("Call made for " + minutes + " minutes. Remaining balance: ₱" + prepaidLoad);
        } else {
            System.out.println("Insufficient balance. Please load more prepaid credits.");
        }
    }

    public void sendText() {
        double textCost = 1;
        if (prepaidLoad >= textCost) {
            prepaidLoad -= textCost;
            System.out.println("Text message sent. Remaining balance: ₱" + prepaidLoad);
        } else {
            System.out.println("Insufficient balance. Please load more prepaid credits.");
        }
    }

    public static void main(String[] args) {
        Main myPhone = new Main();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Load Prepaid");
            System.out.println("2. Make a Call");
            System.out.println("3. Send a Text");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to load: ₱");
                    double amount = scanner.nextDouble();
                    myPhone.loadPrepaid(amount);
                    break;
                case 2:
                    System.out.println("Enter the minutes for the call: ");
                    double minutes = scanner.nextDouble();
                    myPhone.makeCall(minutes);
                    break;
                case 3:
                    myPhone.sendText();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
