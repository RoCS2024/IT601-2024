package main.java.encapsulation;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double depth = 0;

        boolean validInput;

        validInput = true;
        while (validInput) {
            System.out.print("Enter width of the box:");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                if (width <= 0) {
                    System.out.println("Width must be a positive number.");
                    continue;
                }


            } else {
                System.out.println("Invalid input. Please enter a valid number for width.");
                scanner.next();
                continue;
            }


            System.out.print("Enter height of the box:");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive number.");
                    continue;
                }

            } else {
                System.out.println("Invalid input. Please enter a valid number for height.");
                scanner.next();
                continue;

            }

            System.out.print("Enter depth of the box:");
            if (scanner.hasNextDouble()) {
                depth = scanner.nextDouble();
                if (depth <= 0) {
                    System.out.println("Depth must be a positive number.");
                    continue;
                }
                validInput = false;
            } else {
                System.out.println("Invalid input. Please enter a valid number for depth.");
                scanner.next();
            }
        }



        Box box1 = new Box(width, height, depth);


        System.out.println("\nDimensions of box:");
        System.out.println("Width: " + box1.getWidth());
        System.out.println("Height: " + box1.getHeight());
        System.out.println("Depth: " + box1.getDepth());

        System.out.println("Volume of box1: " + box1.calculateVolume());


        System.out.println("Is box a perfect cube? " + box1.isPerfectCube());

        scanner.close();
    }
}
