package com.project.martinez;

public class PublicVehicle {
    private double distance;
    private double fare;

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

    public static void fareComputation (PublicVehicle vehicle, double distance) {
        if (distance <= 5) {
            vehicle.setFare(9.0);
        } else {
            vehicle.setFare(9.0 + (distance - 5) * 1.5);
        }
    }
}

