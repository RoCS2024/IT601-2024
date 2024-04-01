package com.mandatory.contribution.inheritance.activity.pagibig;

import com.mandatory.contribution.inheritance.activity.MandatoryContribution;

/**
 * Pag-ibig is a child class which is under mandatory contribution that came from the monthly salary of a person.
 * It also calculates how much the deduction on the employee monthly salary.
 * */
public class Pagibig extends MandatoryContribution {
    public Pagibig(double monthlySalary) {
        super(monthlySalary);
    }

    @Override
    public double calculateContribution() {
        return getMonthlySalary() * 0.02;
    }
}
