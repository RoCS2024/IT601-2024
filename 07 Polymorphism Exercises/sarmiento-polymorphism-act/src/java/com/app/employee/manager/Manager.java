package com.app.employee.manager;

import com.app.employee.Employee;

public class Manager extends Employee {

    @Override
    public void name() {
        System.out.println("Managers name: Vince");
    }

    @Override
    public void salary() {
        System.out.println("Managers salary: Php 10000");
    }
    @Override
    public void bonus() {
        System.out.println("Managers bonus: Php 20000");
    }

    @Override
    public void ProgrammingLanguage() {

    }

    @Override
    public void Commission() {

    }


}
