package com.restaurant.casual;

import com.restaurant.Restaurant;

public class CasualDining extends Restaurant {
    private int seatingCapacity;

    public CasualDining(String name, String location, int seatingCapacity) {
        super(name, location);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Restaurant Type: Casual Dining");
        System.out.println("Name: " + getName());
        System.out.println("Location: " + getLocation());
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}