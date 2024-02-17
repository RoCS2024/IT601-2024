package com.project.martinez;

public class PublicVehicle {
    private double fare;
    private double distance;

    public void setDistance(double dist) {
        distance = dist;
    }
    public void setFare(double fare) {
        this.fare = fare;
    }

    public double getFare() {
        return fare;
    }

    public double getDistance() {
        return distance;
    }
}

