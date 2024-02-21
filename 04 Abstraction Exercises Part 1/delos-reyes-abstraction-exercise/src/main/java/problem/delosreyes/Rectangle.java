package main.java.problem.delosreyes;

public class Rectangle {
    private float length;
    private float width;
    public static String unitOfMeasurement;

    public Rectangle() {
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }


    public float calculateArea() {
        return length * width;
    }

    public float calculatePerimeter() {
        return 2 * (length + width);
    }
}
