package com.restaurant.fine;

import com.restaurant.Restaurant;

public class FineDining extends Restaurant {
    private String chef;

    public FineDining(String name, String location, String chef) {
        super(name, location);
        this.chef = chef;
    }

    @Override
    public void displayInfo() {
        System.out.println("Restaurant Type: Fine Dining");
        System.out.println("Name: " + getName());
        System.out.println("Location: " + getLocation());
        System.out.println("Chef: " + chef);
    }
}