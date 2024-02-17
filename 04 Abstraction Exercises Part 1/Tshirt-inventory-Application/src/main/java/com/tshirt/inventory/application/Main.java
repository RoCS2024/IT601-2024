package com.tshirt.inventory.application;

import java.util.Scanner;

public class Main {git 
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("\n1. Add T-shirt to inventory");
            System.out.println("2. Sell T-shirt");
            System.out.println("3. Display current inventory");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter size: ");
                        String size = scanner.next();
                        System.out.print("Enter color: ");
                        String color = scanner.next();
                        System.out.print("Enter price: ");
                        double price = scanner.nextDouble();
                        inventory.addTShirt(new TShirt(size, color, price));
                        System.out.println("T-shirt added to inventory.");
                        break;
                    case 2:
                        inventory.sellTShirt();
                        break;
                    case 3:
                        inventory.displayInventory();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
        }
    }
}
