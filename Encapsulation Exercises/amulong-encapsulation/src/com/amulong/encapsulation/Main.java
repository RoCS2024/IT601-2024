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
                converter.setCurrentCurrency(0.017);
                convertedAmount = converter.convertToCurrentCurrency(amountInPHP);
                System.out.printf("%.2f PHP is equivalent to %.2f EUR\n", amountInPHP, convertedAmount);
                break;
            case 2:
                converter.setCurrentCurrency(0.018);
                convertedAmount = converter.convertToCurrentCurrency(amountInPHP);
                System.out.printf("%.2f PHP is equivalent to %.2f USD\n", amountInPHP, convertedAmount);
                break;
            case 3:
                converter.setCurrentCurrency(0.64);
                convertedAmount = converter.convertToCurrentCurrency(amountInPHP);
                System.out.printf("%.2f PHP is equivalent to %.2f BAHT\n", amountInPHP, convertedAmount);
                break;
            case 4:
                converter.setCurrentCurrency(2.64);
                convertedAmount = converter.convertToCurrentCurrency(amountInPHP);
                System.out.printf("%.2f PHP is equivalent to %.2f JPY\n", amountInPHP, convertedAmount);
                break;
            case 5:
                converter.setCurrentCurrency(23.74);
                convertedAmount = converter.convertToCurrentCurrency(amountInPHP);
                System.out.printf("%.2f PHP is equivalent to %.2f WON\n", amountInPHP, convertedAmount);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
