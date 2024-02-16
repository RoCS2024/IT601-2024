package main.java.problem.delosreyes;

public class Rectangle {
    private float length;
    private float width;
    private int choice;
    private int meter;
    private int inch;
    private int feet;

    public Rectangle () {
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public float calculateArea() {
        return length * width;
    }

    public float calculatePerimeter() {
        return 2 * (length + width);
    }
}


