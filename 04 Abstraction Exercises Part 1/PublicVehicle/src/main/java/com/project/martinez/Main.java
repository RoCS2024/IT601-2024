package com.project.martinez;

import java.util.Scanner;

import static com.project.martinez.PublicVehicle.fareComputation;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance;

        PublicVehicle vehicle = new PublicVehicle();

        System.out.print("Enter the distance traveled (in kilometers): ");
        distance = getValidInput(sc);

        if (distance < 0) {
            System.out.println("Negative number is invalid");
        } else {
            vehicle.setDistance(distance);
            fareComputation(vehicle, distance);
            System.out.println("Total fare is " + vehicle.getFare() + " pesos for " + vehicle.getDistance() + " Kilometers");
        }
    }

    private static double getValidInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid distance: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

}
