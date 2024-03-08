package com.app.employee.developer;

import com.app.employee.Employee;

public class Developer extends Employee {
    @Override
    public void name() {
        System.out.println("Developers name: Zander");
    }

    @Override
    public void ProgrammingLanguage(){
        System.out.println("Developers programming language: Java");
    }

    @Override
    public void Commission() {

    }

    @Override
    public void salary() {
        System.out.println("Developers salary Php 15000");
    }

    @Override
    public void bonus() {

    }
}
