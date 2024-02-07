package com.mercader.encapsulation.exercise.television;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        Television newTelevision = new Television();

        do {
            System.out.println("Choose from the options: ");
            System.out.println("1. Turn TV On");
            System.out.println("2. Turn TV Off");
            System.out.println("3. Change Channel");
            System.out.println("4. Change Volume");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("TV is ON");
                    newTelevision.turnOn();
                    break;
                case 2:
                    System.out.println("TV is OFF");
                    newTelevision.turnOff();
                    break;
                case 3:
                    System.out.println("Enter new channel:");
                    int newChannel = sc.nextInt();
                    if (newTelevision.isOn()) {
                        if (newChannel >= 1 && newChannel <= 100) {
                            newTelevision.setChannel(newChannel);
                        } else {
                            System.out.println("Invalid channel number.");
                        }
                    } else {
                        System.out.println("TV is off.");
                    }
                    break;
                case 4:
                    System.out.println("Enter volume:");
                    int newVolume = sc.nextInt();
                    if (newTelevision.isOn()) {
                        if (newVolume >= 0 && newVolume <= 100) {
                            newTelevision.setVolume(newVolume);
                        } else {
                            System.out.println("Invalid volume level.");
                        }
                    } else {
                        System.out.println("TV is off.");
                    }
                    break;
                case 0:
                    System.out.println("Quitting the application.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 0);

        sc.close();
    }
}
