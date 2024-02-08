package main.java;

import java.util.Scanner;

public class QuadraticFormulaSimulator {
    private double A;
    private double B;
    private double C;
    public QuadraticFormulaSimulator(double A, double B, double C) throws IllegalArgumentException {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public double getRoot1() {
        double discriminant = Math.pow(B, 2) - 4 * A * C;
        if (discriminant < 0) {
            return (-B + Math.sqrt(-discriminant)) / (2 * A);
        } else {
            return (-B + Math.sqrt(discriminant)) / (2 * A);
        }
    }
    public double getRoot2() {
        double discriminant = Math.pow(B, 2) - 4 * A * C;
        if (discriminant < 0) {
            return Double.NaN;
        } else {
            return (-B - Math.sqrt(discriminant)) / (2 * A);
        }
    }
    public static void main(String[] args) {
        try {
            double a, b, c;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter coefficient A: ");
            a = sc.nextDouble();
            System.out.print("Enter coefficient B: ");
            b = sc.nextDouble();
            System.out.print("Enter constant term C: ");
            c = sc.nextDouble();

            QuadraticFormulaSimulator simulator = new QuadraticFormulaSimulator(a, b, c);

            double root1 = simulator.getRoot1();
            double root2 = simulator.getRoot2();
            if (Double.isNaN(root1) || Double.isNaN(root2)) {
                System.out.println("The equation has complex roots.");
            } else if (root1 == root2) {
                System.out.println("The equation has a single real root: " + root1);
            } else {
                System.out.println("The roots of the equation are:");
                System.out.printf("Root 1: %.4f\n", root1);
                System.out.printf("Root 2: %.4f\n", root2);
            }
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }
    }

