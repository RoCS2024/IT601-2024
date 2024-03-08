package com.virtual.pet.cat;

import com.virtual.pet.Pet;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println(getName() + " is eating.");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing with the yarn ball.");
    }

}
