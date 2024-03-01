package com.restaurant.fast;

import com.restaurant.Restaurant;

public class FastFood extends Restaurant {
    private String[] menuItems;

    public FastFood(String name, String location, String[] menuItems) {
        super(name, location);
        this.menuItems = menuItems;
    }

    @Override
    public void displayInfo() {
        System.out.println("Restaurant Type: Fast Food");
        System.out.println("Name: " + getName());
        System.out.println("Location: " + getLocation());
        System.out.println("Menu Items:");
        for (String item : menuItems) {
            System.out.println("- " + item);
        }
    }
}