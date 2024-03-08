package com.virtual.pet.bird;

import com.virtual.pet.Pet;

public class Bird extends Pet {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println(getName() + " is eating.");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is singing.");
    }


}
