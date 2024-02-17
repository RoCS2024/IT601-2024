package main.java.problem.delosreyes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle newRectangle = new Rectangle();

        System.out.println("Please choose a measurement system you will use:");
        System.out.println("1. Meter");
        System.out.println("2. Inches");
        System.out.println("3. Feet");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        while (choice <= 0 || choice > 3) {
            System.out.println("Choice must be between 1 and 3. Please enter a valid choice: ");
            choice = sc.nextInt();
        }

        if (choice == 1) {
            newRectangle.setUnitOfMeasurement("Meter");
        } else if (choice == 2) {
            newRectangle.setUnitOfMeasurement("Inches");
        } else {
            newRectangle.setUnitOfMeasurement("Feet");
        }

        System.out.println("Enter length of rectangle: ");
        float length = sc.nextFloat();
        while (length <= 0) {
            System.out.println("Length must be greater than 0. Please enter a valid length: ");
            length = sc.nextFloat();
        }
        newRectangle.setLength(length);

        System.out.println("Enter width of rectangle: ");
        float width = sc.nextFloat();
        while (width <= 0) {
            System.out.print("Width must be greater than 0. Please enter a valid width: ");
            width = sc.nextFloat();
        }
        newRectangle.setWidth(width);

        System.out.println("Area of the Rectangle is: " + newRectangle.calculateArea() + " " + newRectangle.getUnitOfMeasurement());
        System.out.println("Perimeter of the Rectangle is: " + newRectangle.calculatePerimeter() + " " + newRectangle.getUnitOfMeasurement());
    }
}