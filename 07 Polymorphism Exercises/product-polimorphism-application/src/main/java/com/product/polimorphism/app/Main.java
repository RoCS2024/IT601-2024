package com.product.polimorphism.app;
import com.product.polimorphism.app.product.clotingproduct.ClothingProduct;
import com.product.polimorphism.app.product.electronicproduct.ElectronicProduct;

public class Main {

    /***
     * Displaying the laptop info and also the clothing info
     * @param args
     */
    public static void main(String[] args) {
        // Creating instances of different products using user input
        ElectronicProduct laptop = ElectronicProduct.createElectronicProductFromUserInput();
        ClothingProduct shirt = ClothingProduct.createClothingProductFromUserInput();


        System.out.println("\nLaptop Info:");
        laptop.displayInfo();

        System.out.println("\nShirt Info:");
        shirt.displayInfo();
    }
}