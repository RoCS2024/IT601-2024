package com.digit.to.word.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        if (number >= 100 && number <= 999) {
            System.out.print("The input has ");
            printDigitWord(number / 100);
            System.out.print(", ");
            printDigitWord((number / 10) % 10);
            System.out.print(" and ");
            printDigitWord(number % 10);
            System.out.println(".");
        } else {
            System.out.println("Please enter a valid 3-digit number.");
        }

        scanner.close();
    }

    public static void printDigitWord(int digit) {
        switch (digit) {
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.print("four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("eight");
                break;
            case 9:
                System.out.print("nine");
                break;
            default:
                System.out.print("Invalid digit");
        }
    }
}
