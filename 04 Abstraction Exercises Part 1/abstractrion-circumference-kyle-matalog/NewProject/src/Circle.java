// Circle.java
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getArea() {
        return 3.14159 * radius * radius;
    }

    public double getCircumference() {
        return 2 * 3.14159 * radius;
    }
}
