import com.polymorphism.project.shape.circle.Circle;
import com.polymorphism.project.shape.circle.rectangle.Rectangle;
import com.polymorphism.project.shape.circle.rectangle.triangle.Triangle;
import com.polymorphism.project.shape.Shape;
import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose what you want to do: ");
            System.out.println("1. Get Area of Circle");
            System.out.println("2. Get Area of Rectangle");
            System.out.println("3. Get Area of Triangle");
            System.out.println("4. Quit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter radius of circle: ");
                    double radius = sc.nextDouble();
                    Circle circle = new Circle(radius);
                    circle.displayInfo();
                    break;
                case 2:
                    System.out.println("Enter length of rectangle: ");
                    double length = sc.nextDouble();
                    System.out.println("Enter width of rectangle: ");
                    double width = sc.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    rectangle.displayInfo();
                    break;
                case 3:
                    System.out.println("Enter base of triangle: ");
                    double base = sc.nextDouble();
                    System.out.println("Enter height of triangle: ");
                    double height = sc.nextDouble();
                    Triangle triangle = new Triangle(base, height);
                    triangle.displayInfo();
                    break;
                case 4:
                    System.out.println("Quitting the app.");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        } while (choice != 4);
    }
}
