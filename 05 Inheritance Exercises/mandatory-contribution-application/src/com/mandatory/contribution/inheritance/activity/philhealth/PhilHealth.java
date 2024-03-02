package com.mandatory.contribution.inheritance.activity.philhealth;

import com.mandatory.contribution.inheritance.activity.MandatoryContribution;

/**
 * PhilHealth is a child class which is under mandatory contribution that came from the monthly salary of a person.
 * It also calculates how much the deduction on the employee monthly salary.
 * */
public class PhilHealth extends MandatoryContribution {
    public PhilHealth(double monthlySalary) {
        super(monthlySalary);
    }

    @Override
    public double calculateContribution() {
        return getMonthlySalary() * 0.04;
    }
}
