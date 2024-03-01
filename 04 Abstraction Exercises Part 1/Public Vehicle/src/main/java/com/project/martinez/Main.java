package com.project.martinez;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance;

        do {
            System.out.print("Enter the distance traveled (in kilometers): ");
            while (!sc.hasNextDouble()) {

                    System.out.println("Invalid input. Please enter a valid distance: ");
                    sc.next();
                }
                distance = sc.nextDouble();

                if (distance <= 0) {
                    System.out.println("Negative number is invalid");
                }
            }
            while (distance <= 0) ;

            PublicVehicle totalFare = new PublicVehicle(distance);
            System.out.println("Total fare is: " + totalFare.fareComputation());
        }
    }