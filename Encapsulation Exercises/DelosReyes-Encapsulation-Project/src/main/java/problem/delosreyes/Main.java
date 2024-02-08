package main.java.problem.delosreyes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle newRectangle = new Rectangle();

        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        while (length <= 0) {
            System.out.println("Length must be greater than 0. Please enter a valid length: ");
            length = sc.nextInt();
        }
        newRectangle.setLength(length);

        System.out.print("Enter the width of the rectangle: ");
        int width = sc.nextInt();
        while (width <= 0) {
            System.out.print("Width must be greater than 0. Please enter a valid width: ");
            width = sc.nextInt();
        }
        newRectangle.setWidth(width);

        System.out.println("Area of the Rectangle is: " + newRectangle.calculateArea());
        System.out.println("Perimeter of the Rectangle is: " + newRectangle.calculatePerimeter());
    }
}
