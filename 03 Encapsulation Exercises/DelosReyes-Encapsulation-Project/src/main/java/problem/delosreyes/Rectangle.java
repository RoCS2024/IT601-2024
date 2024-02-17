package main.java.problem.delosreyes;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle () {
    }

    private Rectangle (int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setLength (int length) {
        this.length = length;
    }

    public void setWidth (int width) {
        this.width = width;
    }

    public int getLength () {
        return this.length;
    }

    public int getWidth () {
        return this.width;
    }

    public int calculateArea() {
        return length * width;
    }

    public int calculatePerimeter() {
        return 2 * (length + width);
    }
}


