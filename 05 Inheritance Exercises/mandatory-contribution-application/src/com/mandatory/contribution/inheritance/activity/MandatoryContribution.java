package com.mandatory.contribution.inheritance.activity;
/**
 * This is the parent class which is the mandatory contribution that came from the monthly salary of a person.
 * */
public class MandatoryContribution {
    private double monthlySalary;
    public MandatoryContribution() {

    }
    public MandatoryContribution(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double calculateContribution() {
        return 0;
    }
}
