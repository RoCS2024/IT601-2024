package com.product.polimorphism.app.product.electronicproduct;

import com.product.polimorphism.app.product.Product;

import java.util.Scanner;
/**
 * this is the subclass of Product class
 */
public class ElectronicProduct extends Product {
    private String brand;

    /**
     * using super to call the name and price and also setting the brand
     */
    public ElectronicProduct(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    /**
     * where the  calculated price of product return
     * @return
     */
    @Override
    public double calculatePrice() {
        return price * 1.1;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
    }

    /**
     * user inputs and also validation for their inputs and also returning the new value of the product name,price,brand
     * @return
     */
    public static ElectronicProduct createElectronicProductFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Electronic Services: ");

        System.out.print("Enter electronic product name: ");
        String name = scanner.nextLine();

        double price = -1;
        while (price < 0) {
            System.out.print("Enter electronic product price: $");
            price = scanner.nextDouble();
            if (price < 0) {
                System.out.println("Price cannot be negative. Please enter a valid price.");
            }
        }

        scanner.nextLine();
        System.out.print("Enter electronic product brand: ");
        String brand = scanner.nextLine();

        return new ElectronicProduct(name, price, brand);
    }
}


