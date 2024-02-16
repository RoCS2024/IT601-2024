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
        while (choice <= 0) {
            System.out.println("Choice must be greater than 0. Please enter a valid choice: ");
            choice = sc.nextInt();
        }
        newRectangle.setChoice(choice);

        while (choice > 3) {
            System.out.println("Choice must be less than 4. Please enter a valid choice: ");
            choice = sc.nextInt();
        }
        newRectangle.setChoice(choice);


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


        if (choice == 1 ) {
            System.out.println("Area of the Rectangle is: " + newRectangle.calculateArea() + " meters");
            System.out.println("Perimeter of the Rectangle is: " + newRectangle.calculatePerimeter() + " meters");
        } else if (choice == 2) {
            System.out.println("Area of the Rectangle is: " + newRectangle.calculateArea() + " inches");
            System.out.println("Perimeter of the Rectangle is: " + newRectangle.calculatePerimeter() + " inches");
        } else {
            System.out.println("Area of the Rectangle is: " + newRectangle.calculateArea() + " feet");
            System.out.println("Perimeter of the Rectangle is: " + newRectangle.calculatePerimeter() + " feet");
        }
        }
    }
