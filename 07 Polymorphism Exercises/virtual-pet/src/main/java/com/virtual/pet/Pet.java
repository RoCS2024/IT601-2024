package com.virtual.pet;

public abstract class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed() {
        System.out.println(name + "has been fed.");
    }

    public abstract void play();

}
