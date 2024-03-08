package com.polymorphism.exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double monthlySalary = 0;


        while (true) {
            System.out.print("Enter the monthly salary of the employee: ");
            if (scanner.hasNextDouble()) {
                monthlySalary = scanner.nextDouble();
                if (monthlySalary > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive value for monthly salary.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
            }
        }

        MandatoryContribution mandatoryContribution = new MandatoryContribution(monthlySalary);

        double socialSecurity = mandatoryContribution.calculateSocialSecurity();
        double pagIbig = mandatoryContribution.calculatePagIbig();
        double philHealth = mandatoryContribution.calculatePhilHealth();

        System.out.println("\nMandatory Contributions:");
        System.out.println("Social Security: " + socialSecurity);
        System.out.println("PAGIBIG: " + pagIbig);
        System.out.println("PhilHealth: " + philHealth);

        double totalContributions = socialSecurity + pagIbig + philHealth;
        System.out.println("\nTotal Mandatory Contributions: " + totalContributions);

        scanner.close();
    }
}

