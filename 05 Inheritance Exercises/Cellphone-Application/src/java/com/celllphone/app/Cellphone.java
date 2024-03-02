package com.celllphone.app;
import java.util.Scanner;

/**
 * Cellphone class represents a basic mobile phone with load functionality.
 */
public class Cellphone {
    private double load;
    private String network;
    private String model;

    public Cellphone(double initialLoad, String network, String model) {
        this.load = initialLoad;
        this.network = network;
        this.model = model;
    }

    public void makeCall(int duration) {
        // Deduct load for the call based on the duration and network
        double callCost = calculateCallCost(duration, network);
        deductLoad(callCost);
        System.out.println("Call made for " + duration + " minutes. Load deducted: " + callCost);
    }

    public void sendText() {
        // Deduct load for sending a text
        double textCost = 1.0;  // Assume a fixed cost for sending a text
        deductLoad(textCost);
        System.out.println("Text sent. Load deducted: " + textCost);
    }

    public void useData(double dataUsage) {
        // Deduct load for data usage (not applicable for basic phones)
        System.out.println("Data usage not supported on basic phones.");
    }

    protected void deductLoad(double amount) {
        // Ensure there is enough load before deducting
        if (load >= amount) {
            load -= amount;
        } else {
            System.out.println("Insufficient load. Please recharge.");
        }
    }

    private double calculateCallCost(int duration, String network) {
        // Calculate call cost based on duration and network

        return duration * 0.5;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Network: " + network);
        System.out.println("Load Balance: " + load);
    }
}


