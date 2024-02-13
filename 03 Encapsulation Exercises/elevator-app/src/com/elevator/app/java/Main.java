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

        System.out.println("Welcome to the Elevator Simulator!");
        System.out.println("Current Status:");
        System.out.println("Max floors: " + elevator.getMaxFloors());
        System.out.println("Current floor: " + elevator.getCurrentFloor());
        System.out.println("Working: " + (elevator.isWorking() ? "Yes" : "No"));

        if (!elevator.isWorking()) {
            System.out.println("Sorry, the elevator is currently out of service. Please try again later.");
            scanner.close();
            return;
        }

        System.out.println("Enter the direction of the elevator (up, or down):");
        String direction = scanner.nextLine().toLowerCase();
        while (!direction.equals("up") && !direction.equals("down")) {
            System.out.println("Invalid direction! Please enter 'up', or 'down':");
            direction = scanner.nextLine().toLowerCase();
        }

        int destination = 0;
        boolean validDestination = false;
        int num = 0;
        while (!validDestination) {
            System.out.println("\nEnter passenger destination floor (1 to " + maxFloors + ") or 'done' to finish:");
            System.out.println("Current Floor:" + currentFloor);
            System.out.println("Direction:" + direction);
            String input = scanner.nextLine();
            if (input.toLowerCase().equals("done")) {
                validDestination = true;
                break;
            }
            try {
                destination = Integer.parseInt(input);
                if (destination < 1 || destination > maxFloors) {
                    System.out.println("Please input a value between 1 and " + maxFloors + ".");
                } else {
                    elevator.setPassengerDestinations(destination, num);
                    num++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number or 'done'.");
            }
        }
        int[] highest = new int[num];
        int[] lowest = new int[num];
        int num2 = 0;
        int num3 = 0;
        for (int i = 0; i < num; i++) {
            int destinationFloor = elevator.getPassengerDestinations(i);
            if (currentFloor <= destinationFloor) {
                highest[num2] = destinationFloor;
                num2++;
            }
            if (currentFloor >= destinationFloor){
                lowest[num3] = destinationFloor;
                num3++;
            }
        }

        for (int i = 0; i < num2; i++) {
            for (int j = i + 1; j < num2; j++) {
                if (highest[i] > highest[j]) {
                    int temp = highest[i];
                    highest[i] = highest[j];
                    highest[j] = temp;
                }
            }
        }
        for (int i = 0; i < num3; i++) {
            for (int j = i + 1; j < num3; j++) {
                if (lowest[i] < lowest[j]) {
                    int temp = lowest[i];
                    lowest[i] = lowest[j];
                    lowest[j] = temp;
                }
            }
        }

        System.out.println("Floors chosen by the passengers: ");
        for (int i = 0; i < num; i++) {
            System.out.print(elevator.getPassengerDestinations(i) + " ");
        }
        System.out.println("\nFloors the elevator will go through, from 1 to " + maxFloors + " floors:");
        if (direction.equals("up")) {
            for (int i = 0; i < num2; i++) {
                if (highest[i] == currentFloor) {
                    continue;
                }
                System.out.print(highest[i] + " ");
            }
            for (int i = 0; i < num3; i++) {
                System.out.print(lowest[i] + " ");
            }
        } else {
            for (int i = 0; i < num3; i++) {
                if (lowest[i] == currentFloor) {
                    continue;
                }
                System.out.print(lowest[i] + " ");
            }
            for (int i = 0; i < num2; i++) {
                System.out.print(highest[i] + " ");
            }
        }
        System.out.println("\nCurrent Floor:" + currentFloor);
        System.out.println("Direction:" + direction);
    }
}
