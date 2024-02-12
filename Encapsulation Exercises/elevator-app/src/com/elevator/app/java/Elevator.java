package com.elevator.app.java;

public class Elevator {
    private int maxFloors;
    private int currentFloor;
    private String direction;
    private boolean working;
    private int[] passengerDestinations = new int[10];


    public Elevator() {

    }

    public int getMaxFloors() {
        return maxFloors;
    }

    public void setMaxFloors(int maxFloors) {
        this.maxFloors = maxFloors;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public int getPassengerDestinations(int num) {
        int passengerDestination = this.passengerDestinations[num];
        return passengerDestination;
    }
    public void setPassengerDestinations(int passengerDestination, int num) {
        this.passengerDestinations[num] = passengerDestination;
    }
}

