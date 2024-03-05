package com.polymorphism.demo.animal.unknown;

import com.polymorphism.demo.animal.Animal;

public final class UnknownSpecies extends Animal {

    @Override
    public void speak() {
        System.out.println("This species spoke");
    }

    @Override
    public void move() {
        System.out.println("This species moved");
    }
}
