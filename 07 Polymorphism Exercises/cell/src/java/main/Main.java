package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cellphone basicPhone = new Cellphone("GSM", "BasicPhone");
        basicPhone.loadMoney(0.0);

        SmartPhone smartPhone = new SmartPhone("4G", "SmartPhone");
        smartPhone.loadMoney(0.0);

        int option;
        do {
            System.out.println("\nCurrent Load (Regular Phone): ₱" + basicPhone.getLoad());
            System.out.println("Current Load (High end smart Phone): ₱" + smartPhone.getLoad());


            System.out.println("\nOptions:");
            System.out.println("1. Call");
            System.out.println("2. Send a text message");
            System.out.println("3. Load");
            System.out.println("4. Load your data (High end SmartPhone only)");
            System.out.println("5. Exit");
            System.out.print("Pick a number (1-5): ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Another network for call: ");
                    String callNetwork = scanner.next();
                    System.out.print("Call duration (minutes): ");
                    int callDuration = scanner.nextInt();
                    smartPhone.makeCall(callNetwork, callDuration);
                    break;
                case 2:
                    System.out.print("Another network for text: ");
                    String textNetwork = scanner.next();
                    smartPhone.sendText(textNetwork);
                    break;
                case 3:
                    System.out.print("Amount you want to load: ");
                    double loadAmount = scanner.nextDouble();
                    basicPhone.loadMoney(loadAmount);
                    smartPhone.loadMoney(loadAmount);
                    break;
                case 4:
                    if (smartPhone instanceof SmartPhone) {
                        System.out.print("Data usage (GB): ");
                        double dataUsage = scanner.nextDouble();
                        smartPhone.useData(dataUsage);
                    } else {
                        System.out.println("Data loading is only available to High end SmartPhones.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        } while (option != 5);
    }
}