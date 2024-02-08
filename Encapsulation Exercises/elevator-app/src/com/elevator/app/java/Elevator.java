package com.elevator.app.java;

public class Elevator {
    private int maxFloors;
    private int currentFloor;
    private String direction;
    private boolean working;
    private int[] passengerDestinations;

    public Elevator(int maxFloors, int currentFloor, String direction, boolean working, int[] passengerDestinations) {
        this.maxFloors = maxFloors;
        this.currentFloor = currentFloor;
        this.direction = direction;
        this.working = working;
        this.passengerDestinations = passengerDestinations;
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

    public int[] getPassengerDestinations() {
        return passengerDestinations;
    }

    public void setPassengerDestinations(int[] passengerDestinations) {
        this.passengerDestinations = passengerDestinations;
    }
}

