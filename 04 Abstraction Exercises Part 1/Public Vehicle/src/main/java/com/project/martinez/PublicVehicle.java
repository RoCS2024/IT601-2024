package com.project.martinez;

public class PublicVehicle {
    private double distance;

    public PublicVehicle(double dist) {
        this.distance = dist;
    }

    public double fareComputation() {
        if (distance <= 5) {
            return 9.0;
        } else {
            double addKm = distance - 5;
            double fare = 9 + addKm;
            return fare;
        }
    }

}
