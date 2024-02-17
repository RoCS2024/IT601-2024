package main.java.com.demo.project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        Employee newEmployee = new Employee();

        do {
            System.out.println("Choose from the options: ");
            System.out.println("1. Input Employee details");
            System.out.println("2. Display Employee Record");
            System.out.println("3. Celebrate Birthday");
            System.out.println("0. Quit");
            System.out.println("Enter your choice: ");
            option = sc.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Enter employee id: ");
                    String id = sc.next();
                    newEmployee.setId(id);
                    //TODO: add codes to input other employee details...
                    break;
                }
                case 2: {
                    System.out.println("Employee id: " + newEmployee.getId());
                    //TODO: add codes to print other employee details...
                    break;
                }
                case 3: {
                    newEmployee.celebrateBirthday();
                    //TODO: add codes to display employee's new age...
                    break;
                }
                case 0: {
                    System.out.println("Quitting the app...");
                }
            }
        } while(option != 0);
    }
}
