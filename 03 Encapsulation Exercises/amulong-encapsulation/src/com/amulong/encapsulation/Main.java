package com.amulong.encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();

        Scanner scanner = new Scanner(System.in);
        double amount;

        while (true) {
            System.out.print("Enter the amount: ");
            if (scanner.hasNextDouble()) {
                amount = scanner.nextDouble();
                if (amount >= 0) {
                    converter.setValue(amount);
                    break;
                } else {
                    System.out.println("Please enter a non-negative value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid numeric value.");
                scanner.next(); // consume the invalid input
            }
        }

        System.out.println("Choose the currency to convert from: ");
        System.out.println("1. EURO");
        System.out.println("2. USD");
        System.out.println("3. BAHT");
        System.out.println("4. JPY");
        System.out.println("5. WON");
        System.out.print("Enter your choice: ");
        int fromCurrency = scanner.nextInt();

        switch (fromCurrency) {
            case 1:
                converter.setCurrentCurrency("EURO");
                break;
            case 2:
                converter.setCurrentCurrency("USD");
                break;
            case 3:
                converter.setCurrentCurrency("BAHT");
                break;
            case 4:
                converter.setCurrentCurrency("JPY");
                break;
            case 5:
                converter.setCurrentCurrency("WON");
                break;
            default:
                System.out.println("Invalid choice for currency to convert from!");
                return;
        }

        System.out.println("Choose the currency to convert to: ");
        System.out.println("1. EURO");
        System.out.println("2. USD");
        System.out.println("3. BAHT");
        System.out.println("4. JPY");
        System.out.println("5. WON");
        System.out.print("Enter your choice: ");
        int toCurrency = scanner.nextInt();

        double convertedAmount = 0.0;
        String targetCurrency = "";

        switch (toCurrency) {
            case 1:
                convertedAmount = converter.convertToEuro();
                targetCurrency = "EURO";
                break;
            case 2:
                convertedAmount = converter.convertToUSD();
                targetCurrency = "USD";
                break;
            case 3:
                convertedAmount = converter.convertToBaht();
                targetCurrency = "BAHT";
                break;
            case 4:
                convertedAmount = converter.convertToJPY();
                targetCurrency = "JPY";
                break;
            case 5:
                convertedAmount = converter.convertToWon();
                targetCurrency = "WON";
                break;
            default:
                System.out.println("Invalid choice for currency to convert to!");
                return;
        }

        System.out.printf("%.2f %s is equivalent to %.2f %s\n", amount, converter.getCurrentCurrency(), convertedAmount, targetCurrency);
    }
}
