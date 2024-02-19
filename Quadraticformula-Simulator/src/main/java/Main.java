package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, C;
        System.out.print("Enter coefficient a: ");
        A = getValidDouble(sc);

        System.out.print("Enter coefficient b: ");
        B = getValidDouble(sc);

        System.out.print("Enter coefficient c: ");
        C = getValidDouble(sc);

        QuadraticFormulaSimulator simulator = new QuadraticFormulaSimulator(A, B, C);

        double root1 = simulator.getRoot1();
        double root2 = simulator.getRoot2();

        if (root1 == -1 && root2 == -1) {
            System.out.println("The equation has complex roots.");
        } else if (root1 == root2) {
            System.out.println("The equation has a single real root: " + root1);
        } else {
            System.out.println("The roots of the equation are:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }
    }

    private static double getValidDouble(Scanner sc) {
        double value;
        while (true) {
            try {
                value = sc.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextLine();
            }
        }
        return value;
    }
}
