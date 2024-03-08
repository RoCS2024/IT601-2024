package com.polymorphism.project.shape.circle;

import com.polymorphism.project.shape.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle() {

    }

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("Circle:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
}

