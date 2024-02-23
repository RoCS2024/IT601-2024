/**
 *
 * */
package com.inheritance.demo.animal;

public class Animal {

    private String name;

    private String breed;

    private int numberOfLegs;

    public Animal(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
    }

    public Animal(String name, int numberOfLegs) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println("This animal has moved.");
    }

    public void speak() {
        System.out.println("This animal has spoken.");
    }
}
