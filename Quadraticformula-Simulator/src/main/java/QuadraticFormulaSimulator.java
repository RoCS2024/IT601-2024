package main.java;

import java.util.Scanner;

public class QuadraticFormulaSimulator {
    private double A;
    private double B;
    private double C;

    public QuadraticFormulaSimulator(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double getRoot1() {
        double discriminant = Math.pow(B, 2) - 4 * A * C;
        if (discriminant < 0) {
            return -1;
        } else {
            return (-B + Math.sqrt(discriminant)) / (2 * A);
        }
    }

    public double getRoot2() {
        double discriminant = Math.pow(B, 2) - 4 * A * C;
        if (discriminant < 0) {
            return -1;
        } else {
            return (-B - Math.sqrt(discriminant)) / (2 * A);
        }
    }
}
