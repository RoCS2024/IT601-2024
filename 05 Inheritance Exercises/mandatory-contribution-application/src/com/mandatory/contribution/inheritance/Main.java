package com.mandatory.contribution.inheritance;

import com.mandatory.contribution.inheritance.activity.pagibig.Pagibig;
import com.mandatory.contribution.inheritance.activity.philhealth.PhilHealth;
import com.mandatory.contribution.inheritance.activity.sss.SocialSecuritySystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double monthlySalary;
        /**
         * It is the main class the do-while is validation if the user input is right.
         * In this class also the calculated mandatory contribution will be display with the code.
         * */
        do {
            try {
                System.out.print("Enter the monthly salary: ");
                monthlySalary = scanner.nextDouble();


                if (monthlySalary >= 0) {
                    break;
                } else {
                    System.out.println("Please enter a non-negative value for the monthly salary.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.nextLine();
            }
        } while (true);

        SocialSecuritySystem socialSecuritySystem = new SocialSecuritySystem(monthlySalary);
        Pagibig pagibig = new Pagibig(monthlySalary);
        PhilHealth philHealth = new PhilHealth(monthlySalary);

        double socialSecuritySystemContribution = socialSecuritySystem.calculateContribution();
        double pagibigContribution = pagibig.calculateContribution();
        double philHealthContribution = philHealth.calculateContribution();

        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Social Security System Contribution: " + socialSecuritySystemContribution);
        System.out.println("Pag-Ibig Contribution: " + pagibigContribution);
        System.out.println("PhilHealth Contribution: " + philHealthContribution);
    }
}
