
import com.point.distance.app.point.Point;
import com.point.distance.app.point.point3d.Point3d;
import java.util.Scanner;


public class Main {

    /**
     * Main method executed the  program.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose from the options:");
        System.out.println("1. Calculate distance between p1 and p2 (2D)");
        System.out.println("2. Calculate distance between p3 and p4 (3D)");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            Point p1, p2;

            System.out.println("Enter coordinates for point p1:");
            p1 = readValidPoint(scanner);

            System.out.println("Enter coordinates for point p2:");
            p2 = readValidPoint(scanner);

            /**
             * Calculating and printing distance between p1 and p2
             */
            System.out.println("Distance between p1 and p2: " + p1.getDistanceFrom(p2));
        } else if (choice == 2) {
            double x1, y1, z1, x2, y2, z2;

            System.out.println("Enter coordinates for point p3:");
            System.out.print("x3: ");
            x1 = readValidDouble(scanner);
            System.out.print("y3: ");
            y1 = readValidDouble(scanner);
            System.out.print("z3: ");
            z1 = readValidDouble(scanner);

            System.out.println("Enter coordinates for point p4:");
            System.out.print("x4: ");
            x2 = readValidDouble(scanner);
            System.out.print("y4: ");
            y2 = readValidDouble(scanner);
            System.out.print("z4: ");
            z2 = readValidDouble(scanner);

            /***
             *   Creating two Point3D objects, p3 and p4
             */
            Point3d p3 = new Point3d(x1, y1, z1);
            Point3d p4 = new Point3d(x2, y2, z2);

            // Calculating and printing distance between p3 and p4
            System.out.println("Distance between p3 and p4: " + p3.getDistanceFrom(p4));
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    /**
     * this Method is to read the valid double input of the user.
     * @param scanner Scanner object to read input from.
     * @return Valid double value entered by the user.
     */
    private static double readValidDouble(Scanner scanner) {
        double value;
        while (true) {
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number:");
                scanner.next();
                /**
                 *  Consume invalid input
                 */
            }
        }
        return value;
    }

    /**
     * this method is  to read the valid coordinates for a 2D point.
     * @param scanner Scanner object to read input from.
     * @return Point object with valid coordinates.
     */
    private static Point readValidPoint(Scanner scanner) {
        double x, y;
        System.out.print("x: ");
        x = readValidDouble(scanner);
        System.out.print("y: ");
        y = readValidDouble(scanner);
        return new Point(x, y);
    }
}
