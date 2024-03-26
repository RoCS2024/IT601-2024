package com.virtual.pet.dog;

import com.virtual.pet.Pet;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println(getName() + " is eating.");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing fetch.");
    }

}
