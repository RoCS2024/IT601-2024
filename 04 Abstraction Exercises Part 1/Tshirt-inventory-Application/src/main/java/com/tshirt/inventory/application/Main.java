package com.tshirt.inventory.application;

import java.util.Scanner;

public class Main {

    private static final int ADD_TSHIRT = 1;
    private static final int SELL_TSHIRT = 2;
    private static final int DISPLAY_INVENTORY = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                performAction(choice, inventory, scanner);
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n1. Add T-shirt to inventory");
        System.out.println("2. Sell T-shirt");
        System.out.println("3. Display current inventory");
        System.out.println("4. Exit");
    }

    private static void performAction(int choice, Inventory inventory, Scanner scanner) {
        switch (choice) {
            case ADD_TSHIRT:
                addTShirtToInventory(inventory, scanner);
                break;
            case SELL_TSHIRT:
                inventory.sellTShirt();
                break;
            case DISPLAY_INVENTORY:
                inventory.displayInventory();
                break;
            case EXIT:
                System.out.println("Exiting...");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }

    private static void addTShirtToInventory(Inventory inventory, Scanner scanner) {
        System.out.print("Enter size: ");
        String size = scanner.next();
        System.out.print("Enter color: ");
        String color = scanner.next();
        System.out.print("Enter price: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid price.");
            scanner.next();
        }
        double price = scanner.nextDouble();
        Inventory.TShirt tshirt = new Inventory.TShirt(size, color, price);
        inventory.addTShirt(tshirt);
        System.out.println("T-shirt added to inventory.");
    }
}
