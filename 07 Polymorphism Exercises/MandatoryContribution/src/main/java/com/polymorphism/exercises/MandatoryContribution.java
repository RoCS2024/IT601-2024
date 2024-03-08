package com.polymorphism.exercises;

public class MandatoryContribution {
    private double monthlySalary;

    public MandatoryContribution(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double calculateSocialSecurity() {
        double socialSecurityRate = 0.10;
        return monthlySalary * socialSecurityRate;
    }

    public double calculatePagIbig() {
        double pagIbigAmount = 1000.0;
        return pagIbigAmount;
    }

    public double calculatePhilHealth() {
        double philHealthRate = 0.025;
        return monthlySalary * philHealthRate;
    }
}

