package main.java.encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double depth = 0;

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter width of the box:");
                width = Double.parseDouble(scanner.nextLine());
                if (width <= 0) {
                    System.out.println("Width must be a positive number.");
                }
                validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Input. Use Number!");
            }
        }

        validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter height of the box:");
                height = Double.parseDouble(scanner.nextLine());
                if (height <= 0) {
                    System.out.println("Height must be a positive number.");
                }
                validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Input. Use Number!");
            }
        }

        validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter depth of the box:");
                depth = Double.parseDouble(scanner.nextLine());
                if (depth <= 0) {
                    System.out.println("Depth must be a positive number.");
                }
                validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Input. Use Number!");
            }
        }

        Box box1 = new Box(0, 0, 0);

        box1.setWidth(width);
        box1.setHeight(height);
        box1.setDepth(depth);

        System.out.println("\nDimensions of box:");
        System.out.println("Width: " + box1.getWidth());
        System.out.println("Height: " + box1.getHeight());
        System.out.println("Depth: " + box1.getDepth());

        System.out.println("Volume of box1: " + box1.calculateVolume());

        System.out.println("Is box a perfect cube? " + box1.isPerfectCube());

        scanner.close();
    }
}
