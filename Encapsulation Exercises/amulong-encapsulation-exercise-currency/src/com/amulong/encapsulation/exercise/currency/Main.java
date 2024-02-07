package com.amulong.encapsulation.exercise.currency;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter(0.018, 23.65, 2.64, 0.63, 0.017);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Amount in Peso: ");
        double amountInPeso = sc.nextDouble();

        if ( amountInPeso>= 0) {
            System.out.println(amountInPeso + " PHP = " + converter.convertToUSD(amountInPeso) + " USD");
            System.out.println(amountInPeso + " PHP = " + converter.convertToWon(amountInPeso) + " WON");
            System.out.println(amountInPeso + " PHP = " + converter.convertToYen(amountInPeso) + " YEN");
            System.out.println(amountInPeso + " PHP = " + converter.convertToThaiBaht(amountInPeso) + " THAI BAHT");
            System.out.println(amountInPeso + " PHP = " + converter.convertToEuro(amountInPeso) + " EURO");
        } else {
            System.out.println("Invalid value for PESO.");
        }
    }
}
