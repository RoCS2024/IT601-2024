package com.elevator.app.java;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int maxFloors = random.nextInt(50) + 10;
        int currentFloor = random.nextInt(maxFloors) + 1;
        boolean working = random.nextBoolean();

        System.out.println("Default values of the elevator:");
        System.out.println("Max floors: " + maxFloors);
        System.out.println("Current floor: " + currentFloor);
        System.out.println("Working: " + working);

        if (!working) {
            System.out.println("The elevator is not currently working. Please try again later.");
            scanner.close();
            return;
        }

        System.out.println("Enter the direction of the elevator (up, down, or still):");
        String direction = scanner.nextLine().toLowerCase();

        while (!direction.equals("up") && !direction.equals("down") && !direction.equals("still")) {
            System.out.println("Invalid direction! Please enter 'up', 'down', or 'still':");
            direction = scanner.nextLine().toLowerCase();
        }

        System.out.println("Enter passenger destination:");
        int destination = scanner.nextInt();
        if (destination == currentFloor) {
            System.out.println("Floors the elevator would go through: " + currentFloor);
            scanner.close();
            return;
        }

        int[] passengerDestinations = new int[1];
        boolean validInput = false;
        while (!validInput) {
            try {
                if ((direction.equals("up") || destination == currentFloor) && destination < currentFloor) {
                    System.out.println("Invalid destination! Destination must be higher than or equal to current floor.");
                } else if (direction.equals("down") && destination >= currentFloor) {
                    System.out.println("Invalid destination! Destination must be lower than current floor.");
                } else if (destination <= 0 || destination > maxFloors) {
                    System.out.println("Invalid destination! Please enter a number between 1 and " + maxFloors + ":");
                } else {
                    passengerDestinations[0] = destination;
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();
            }
        }

        if (currentFloor == passengerDestinations[0]) {
            System.out.println("Floors the elevator would go through: " + currentFloor);
        } else {
            System.out.println("Floors the elevator would go through:");
            int destinationFloor = passengerDestinations[0];
            if (currentFloor < destinationFloor) {
                for (int floor = currentFloor; floor <= destinationFloor; floor++) {
                    System.out.print(floor + " ");
                }
            } else {
                for (int floor = currentFloor; floor >= destinationFloor; floor--) {
                    System.out.print(floor + " ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
