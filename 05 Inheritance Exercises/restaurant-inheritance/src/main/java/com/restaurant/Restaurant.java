package com.restaurant;

public class Restaurant {
    private String name;
    private String location;

    public Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void open() {
        System.out.println(name + " opens at 7am.");
    }

    public void close() {
        System.out.println(name + " closes at 9pm.");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name; }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) { this.location = location; }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
    }
}