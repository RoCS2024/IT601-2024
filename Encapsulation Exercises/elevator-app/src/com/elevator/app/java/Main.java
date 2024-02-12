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
            System.out.println("Enter passenger destination ('done' if finished): ");
            String input = scanner.nextLine();
            try {
                destination = Integer.parseInt(input);
                if(destination <= 0){
                    System.out.println("Please input a value between 1 to " + maxFloors + ":");
                } else if(destination > maxFloors) {
                    System.out.println("Please input a value between 1 to " + maxFloors + ":");
                } else {
                    elevator.setPassengerDestinations(destination,num);
                    num++;
                }
            } catch (NumberFormatException e) {
                if(input.toLowerCase().equals("done")){
                    validDestination = true;
                } else {
                    System.out.println("Invalid input! Please enter a valid number.");
                }
            }
        }
        int[] highest = new int[num];
        int[] lowest = new int[num];
        int num2 = 0;
        int num3 = 0;
        for (int i = 0; i < highest.length; i++) {
            if(currentFloor <= elevator.getPassengerDestinations(i)){
                highest[num2] = elevator.getPassengerDestinations(i);
                num2++;
            } else if(currentFloor >= elevator.getPassengerDestinations(i)){
                lowest[num3] = elevator.getPassengerDestinations(i);
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
        if(direction.equals("up")){
            System.out.println("Floors the elevator would go through:");
            for (int i = 0; i < num2; i++) {

                System.out.print(highest[i] + " ");
            }
            for (int i = 0; i < num3; i++) {
                System.out.print(lowest[i] + " ");
            }
        } else {
            System.out.println("Floors the elevator would go through:");
            for (int i = 0; i < num3; i++) {
                if(lowest[i] == currentFloor){
                    i++;
                }
                System.out.print(lowest[i] + " ");
            }
            for (int i = 0; i < num2; i++) {
                System.out.print(highest[i] + " ");
            }
        }
    }
}
