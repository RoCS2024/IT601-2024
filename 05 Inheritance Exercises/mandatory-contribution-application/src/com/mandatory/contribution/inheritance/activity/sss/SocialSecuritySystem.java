package com.mandatory.contribution.inheritance.activity.sss;

import com.mandatory.contribution.inheritance.activity.MandatoryContribution;

/**
 * Social Security System(SSS) is a child class which is under mandatory contribution that came from the monthly salary of a person.
 * It also calculates how much the deduction on the employee monthly salary.
 * */
public class SocialSecuritySystem extends MandatoryContribution {
    public SocialSecuritySystem(double monthlySalary) {
        super(monthlySalary);
    }

    @Override
    public double calculateContribution() {
        return getMonthlySalary() * 0.14;
    }
}
