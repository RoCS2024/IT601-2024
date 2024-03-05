package com.polymorphism.demo.animal.cat;

import com.polymorphism.demo.animal.Animal;

public class Cat extends Animal {

    @Override
    public void speak() {
        System.out.println("Meow meow!");
    }

    @Override
    public void move() {
        System.out.println("The cat walked!");
    }

    @Override
    public void eat() {
        System.out.println("This cat has eaten.");
    }
}
