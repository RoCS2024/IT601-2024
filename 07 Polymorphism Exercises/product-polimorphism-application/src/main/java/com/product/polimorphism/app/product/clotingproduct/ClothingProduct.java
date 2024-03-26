package com.product.polimorphism.app.product.clotingproduct;

import com.product.polimorphism.app.product.Product;

import java.util.Scanner;

/**
 * this is the subclass of Product class
 */
public class ClothingProduct extends Product {
    private String size;
    /**
     * using super to call the name and price and also setting the size
     */
    public ClothingProduct(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }
    /**
     * where the  calculated price of cloting product return
     * @return
     */
    @Override
    public double calculatePrice() {
        return price * 1.2;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Size: " + size);
    }
    /**
     * user inputs and also validation for their inputs and also returning the new value of the clothing name,price,brand
     * @return
     */
    public static ClothingProduct createClothingProductFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Clothing Services: ");

        System.out.print("Enter clothing product name: ");
        String name = scanner.nextLine();

        double price = -1;
        while (price < 0) {
            System.out.print("Enter clothing product price: $");
            price = scanner.nextDouble();
            if (price < 0) {
                System.out.println("Price cannot be negative. Please enter a valid price.");
            }
        }

        scanner.nextLine();
        System.out.print("Enter clothing product size: ");
        String size = scanner.nextLine();

        return new ClothingProduct(name, price, size);
    }
}
