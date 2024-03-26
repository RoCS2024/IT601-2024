package com.polymorphism.project.shape.circle.rectangle.triangle;

import com.polymorphism.project.shape.Shape;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public void displayInfo() {
        System.out.println("Triangle:");
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area: " + calculateArea());
    }
}
