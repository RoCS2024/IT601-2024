package com.polymorphism.demo.animal.dog;

import com.polymorphism.demo.animal.Animal;

public class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println("Arf arf!");
    }

    @Override
    public void move() {
        System.out.println("The dog walked!");
    }

    @Override
    public void eat() {
        System.out.println("The dog has eaten.");
    }

    public final void playDead(){
        System.out.println("Play dead!");
    }
}
