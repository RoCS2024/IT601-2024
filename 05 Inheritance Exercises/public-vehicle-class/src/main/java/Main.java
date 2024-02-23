import bus.Bus;
import jeep.Jeep;
import publicvehicle.PublicVehicle;
import taxi.Taxi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a vehicle: ");
        System.out.println("1. Taxi");
        System.out.println("2. Jeep");
        System.out.println("3. Bus");

        int choice = scanner.nextInt();

        PublicVehicle vehicle;

        switch (choice) {
            case 1:
                vehicle = new Taxi();
                break;
            case 2:
                vehicle = new Jeep();
                break;
            case 3:
                vehicle = new Bus();
                break;
            default:
                System.out.println("Invalid!!");
                return;
        }

        System.out.println("Enter distance traveled in kilometers: ");
        double distance = scanner.nextDouble();

        if (distance < 0) {
            System.out.println("Invalid!!");
            return;
        }

        double fare = vehicle.computeFare(distance);
        System.out.println("The fare is " + fare);
    }
}