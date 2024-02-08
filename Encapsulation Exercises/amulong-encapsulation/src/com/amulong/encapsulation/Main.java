package com.amulong.encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in PHP: ");
        double amountInPHP = scanner.nextDouble();

        System.out.println("Choose the currency to convert to: ");
        System.out.println("1. EUR");
        System.out.println("2. USD");
        System.out.println("3. BAHT");
        System.out.println("4. JPY");
        System.out.println("5. WON");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double convertedAmount;

        switch (choice) {
            case 1:
                converter.setValue(0.017);
                converter.setCurrentCurrency("EUR");
                convertedAmount = converter.convertToCurrentCurrency(amountInPHP);
                System.out.printf("%.2f PHP is equivalent to %.2f %s\n", amountInPHP, convertedAmount, converter.getCurrentCurrency());
                break;
            case 2:
                converter.setValue(0.018);
                converter.setCurrentCurrency("USD");
                convertedAmount = converter.convertToCurrentCurrency(amountInPHP);
                System.out.printf("%.2f PHP is equivalent to %.2f %s\n", amountInPHP, convertedAmount, converter.getCurrentCurrency());
                break;
            case 3:
                converter.setValue(0.64);
                converter.setCurrentCurrency("BAHT");
                convertedAmount = converter.convertToCurrentCurrency(amountInPHP);
                System.out.printf("%.2f PHP is equivalent to %.2f %s\n", amountInPHP, convertedAmount, converter.getCurrentCurrency());
                break;
            case 4:
                converter.setValue(2.64);
                converter.setCurrentCurrency("JPY");
                convertedAmount = converter.convertToCurrentCurrency(amountInPHP);
                System.out.printf("%.2f PHP is equivalent to %.2f %s\n", amountInPHP, convertedAmount, converter.getCurrentCurrency());
                break;
            case 5:
                converter.setValue(23.74);
                converter.setCurrentCurrency("WON");
                convertedAmount = converter.convertToCurrentCurrency(amountInPHP);
                System.out.printf("%.2f PHP is equivalent to %.2f %s\n", amountInPHP, convertedAmount, converter.getCurrentCurrency());
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
