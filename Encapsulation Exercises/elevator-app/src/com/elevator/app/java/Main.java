package com.elevator.app.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxFloors = (int) (Math.random() * 41) + 10;
        int currentFloor = (int) (Math.random() * maxFloors) + 1;
        boolean working = Math.random() < 0.5;

        Elevator elevator = new Elevator();
        elevator.setMaxFloors(maxFloors);
        elevator.setCurrentFloor(currentFloor);
        elevator.setWorking(working);

        System.out.println("Default values of the elevator:");
        System.out.println("Max floors: " + elevator.getMaxFloors());
        System.out.println("Current floor: " + elevator.getCurrentFloor());
        System.out.println("Working: " + elevator.isWorking());

        if (!elevator.isWorking()) {
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

        if (direction.equals("still")) {
            System.out.println("Elevator is still on floor " + elevator.getCurrentFloor());
            scanner.close();
            return;
        }

        System.out.println("Enter passenger destination:");
        int destination = 0;
        boolean validDestination = false;
        while (!validDestination) {
            String input = scanner.nextLine();
            try {
                destination = Integer.parseInt(input);
                if (direction.equals("up") && destination < currentFloor) {
                    System.out.println("Invalid destination! Destination must be higher than or equal to current floor.");
                } else if (direction.equals("down") && destination > currentFloor) {
                    System.out.println("Invalid destination! Destination must be lower than or equal to current floor.");
                } else if (destination <= 0 || destination > maxFloors) {
                    System.out.println("Invalid destination! Please enter a number between 1 and " + maxFloors + ":");
                } else {
                    validDestination = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
        elevator.setDirection(direction);
        elevator.setPassengerDestinations(new int[]{destination});

        System.out.println("Floors the elevator would go through:");
        if (elevator.getCurrentFloor() < destination) {
            for (int floor = elevator.getCurrentFloor(); floor <= destination; floor++) {
                System.out.print(floor + " ");
            }
        } else {
            for (int floor = elevator.getCurrentFloor(); floor >= destination; floor--) {
                System.out.print(floor + " ");
            }
        }
        System.out.println();

        scanner.close();
    }
}
