package com.polymorphism.demo.animal.bird;

import com.polymorphism.demo.animal.Animal;

public class Bird extends Animal {
    @Override
    public void speak() {
        System.out.println("Twit twit!");
    }

    @Override
    public void move() {
        System.out.println("The bird flew");
    }

    @Override
    public void eat() {
        System.out.println("The bird has eaten!");
    }
}
