package com.inheritance.demo.animal.dog;

import com.inheritance.demo.animal.Animal;

public class Dog extends Animal {
    private String favoriteFood;

    public Dog() {
        super(4);
        this.favoriteFood = "Dog Food";
    }

    public Dog(String name) {
        super(name, 4);
        this.favoriteFood = "Dog Food";
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void showTricks() {
        System.out.println("The dog play-dead");
    }

    @Override
    public void speak() {
        System.out.println("Arf arf!");
    }

    @Override
    public String toString() {
        return "This dog is a " + this.getBreed() + " breed and it's favorite food is " + this.getFavoriteFood();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Dog) || obj == null) {
            return false;
        }

        Dog dog = (Dog) obj;
        return this.getBreed().equals(dog.getBreed())
                && this.getNumberOfLegs() == dog.getNumberOfLegs()
                && this.getName().equals(dog.getName());

    }
}
