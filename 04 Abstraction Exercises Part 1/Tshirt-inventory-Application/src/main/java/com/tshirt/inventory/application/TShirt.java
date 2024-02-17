package com.tshirt.inventory.application;


class TShirt {
    String size;
    String color;
    double price;

    public TShirt(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public void display() {
        System.out.println("Size: " + size + ", Color: " + color + ", Price: " + price);
    }
}
