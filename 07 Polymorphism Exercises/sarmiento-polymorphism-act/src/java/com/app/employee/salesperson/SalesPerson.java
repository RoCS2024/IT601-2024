package com.app.employee.salesperson;

import com.app.employee.Employee;

public class SalesPerson extends Employee {
    @Override
    public void name() {
        System.out.println("Sales person's name: Rob");
    }

    @Override
    public void salary() {
        System.out.println("Sales person's salary: Php 10000");
    }

    @Override
    public void bonus() {

    }

    @Override
    public void ProgrammingLanguage() {

    }

    @Override
    public void Commission() {
        System.out.println("Sales person's commission: 5%");
    }

}
