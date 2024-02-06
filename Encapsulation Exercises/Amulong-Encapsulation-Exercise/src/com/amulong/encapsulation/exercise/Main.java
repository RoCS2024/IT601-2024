package com.amulong.encapsulation.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter(0.018, 23.65, 2.64, 0.63, 0.017);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Amount in peso: ");
        double amountInPeso = sc.nextDouble();

        System.out.println(amountInPeso + " PHP = " + converter.convertToUSD(amountInPeso) + " USD");
        System.out.println(amountInPeso + " PHP = " + converter.convertToWon(amountInPeso) + " WON");
        System.out.println(amountInPeso + " PHP = " + converter.convertToYen(amountInPeso) + " YEN");
        System.out.println(amountInPeso + " PHP = " + converter.convertToThaiBaht(amountInPeso) + " THAI BAHT");
        System.out.println(amountInPeso + " PHP = " + converter.convertToEuro(amountInPeso) + " EURO");
    }
}
