import com.restaurant.Restaurant;
import com.restaurant.casual.CasualDining;
import com.restaurant.fast.FastFood;
import com.restaurant.fine.FineDining;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter restaurant details ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Location: ");
        String location = sc.nextLine();

        System.out.println("Choose restaurant type:");
        System.out.println("1. Fast Food");
        System.out.println("2. Fine Dining");
        System.out.println("3. Casual Dining");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        Restaurant restaurant = null;

        switch (choice) {
            case 1:
                System.out.print("Enter menu items (comma-separated): ");
                String menuInput = sc.nextLine();
                String[] menuItems = menuInput.split(",");
                restaurant = new FastFood(name, location, menuItems);
                break;
            case 2:
                System.out.print("Enter chef's name: ");
                String chef = sc.nextLine();
                restaurant = new FineDining(name, location, chef);
                break;
            case 3:
                System.out.print("Enter seating capacity: ");
                int seatingCapacity = sc.nextInt();
                restaurant = new CasualDining(name, location, seatingCapacity);
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }
        sc.close();

        System.out.println("\nRestaurant Information:");
        restaurant.open();
        restaurant.displayInfo();
        restaurant.close();
    }
}