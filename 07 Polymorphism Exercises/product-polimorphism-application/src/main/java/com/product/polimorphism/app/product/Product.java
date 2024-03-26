package com.product.polimorphism.app.product;

/**
 * Class Product is the parent class
 */
 public class Product {
     private String name;
    /**
     * using protected means that you were accepting that the price can be modified and access by the subclasses
     */
    protected double price;

     public Product(String name, double price) {
         this.name = name;
         this.price = price;
     }

    /**
     * retyrning the new value of the price
     * @return
     */
     public double calculatePrice() {
         return price;
     }

    /**
     * displaying the name and the calculate price of the product that user will input
     */
     public void displayInfo() {
         System.out.println("Product: " + name);
         System.out.println("Price: $" + calculatePrice());
     }

 }

