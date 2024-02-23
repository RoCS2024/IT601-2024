package com.inheritance.demo.animal.cat;

import com.inheritance.demo.animal.Animal;

public class Cat extends Animal {
    public Cat() {
        super(4);
    }

    @Override
    public void speak() {
        System.out.println("Meow...");
    }
}
