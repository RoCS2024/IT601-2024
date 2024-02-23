import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Circle circle = new Circle();
        boolean running = true;

        while (running) {
            System.out.println(" Circle Calculator ");
            System.out.println("1. Set Radius");
            System.out.println("2. Set Diameter");
            System.out.println("3. Calculate Area");
            System.out.println("4. Calculate Circumference");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    circle.setRadius(radius);
                    break;
                case 2:
                    System.out.print("Enter diameter: ");
                    double diameter = scanner.nextDouble();
                    circle.setRadius(diameter / 2);
                    break;
                case 3:
                    System.out.println("Area: " + circle.getArea());
                    break;
                case 4:
                    System.out.println("Circumference: " + circle.getCircumference());
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

}