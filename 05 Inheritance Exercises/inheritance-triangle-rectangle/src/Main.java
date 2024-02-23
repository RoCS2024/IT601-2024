import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Triangle and Rectangle!");
        System.out.println("Pick a shape that you want:");
        System.out.println("1. Triangle");
        System.out.println("2. Rectangle");

        int choice = scanner.nextInt();
        double area = 0.0;

        switch (choice) {
            case 1:
                System.out.println("Base length of the triangle:");
                double base = validateInput(scanner);
                System.out.println("Height of the triangle:");
                double height = validateInput(scanner);
                Triangle triangle = new Triangle(base, height);
                area = triangle.getArea();
                break;
            case 2:
                System.out.println("Width of the rectangle:");
                double width = validateInput(scanner);
                System.out.println("Height of the rectangle:");
                height = validateInput(scanner);
                Rectangle rectangle = new Rectangle(width, height);
                area = rectangle.getArea();
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                System.exit(0);
        }

        System.out.println("Area: " + area);
    }


    private static double validateInput(Scanner scanner) {
        double input;
        while (true) {
            if (scanner.hasNextDouble()) {
                input = scanner.nextDouble();
                if (input > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive number:");
                }
            } else {
                System.out.println("Invalid input. Please enter a number:");
                scanner.next();
            }
        }
        return input;
    }

}