package com.polymorphism.demo.animal;

public abstract class Animal {

    public abstract void speak();

    public abstract void move();

    public void eat() {
        System.out.println("This animal has eaten");
    }
}
