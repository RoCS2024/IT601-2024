import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius;
        do {
            System.out.println("Enter the radius of the circle:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number for the radius:");
                scanner.next();
            }
            radius = scanner.nextDouble();

            if (radius <= 0) {
                System.out.println("Invalid input. Radius must be greater than 0.");
            }
        } while (radius <= 0);

        Circle circle = new Circle(radius);

        System.out.println("Area of the circle: " + circle.computeArea());
        System.out.println("Circumference of the circle: " + circle.computeCircumference());
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}