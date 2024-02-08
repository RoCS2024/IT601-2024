package main.java.pacheco.hotelroom;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        HotelRoom newReservation = new HotelRoom();
        newReservation.setCostPerPerson(1250);

        int option1;
        String option2;

        System.out.println("Choose from the options: ");
        System.out.println("1. Book Reservation");
        System.out.println("2. Display Reservation Record");
        System.out.println("3. Cancel Reservation");
        System.out.println("0. Quit");

        System.out.println("Enter your choice: ");
        try {
            option1 = src.nextInt();
            switch (option1) {
                case 1: {
                    System.out.println("Enter Number of Person: ");
                    int num1 = src.nextInt();
                    if (num1 <= 0) {
                        System.out.println("Number of persons should be greater than 0.");
                        return;
                    }
                    newReservation.setNumberOfPerson(num1);

                    System.out.println("Enter Number of Days: ");
                    int num2 = src.nextInt();
                    if (num2 <= 0) {
                        System.out.println("Number of days should be greater than 0.");
                        return;
                    }
                    newReservation.setNumberOfDay(num2);

                    System.out.println("Cost Per Head: " + newReservation.getCostPerPerson());
                    newReservation.calculateTotalAmount();
                    System.out.println("Total Amount: " + newReservation.getTotalAmount());

                    System.out.println("Reserved now: yes/no");
                    System.out.println("Enter your choice: ");
                    option2 = src.next().toLowerCase();

                    if (option2.equals("yes")) {
                        newReservation.setBooked(true);
                        System.out.println("Reservation Status: Room is Booked!");
                    } else if (option2.equals("no")) {
                        newReservation.setBooked(false);
                    } else {
                        System.out.println("Please choose from options 'yes' and 'no' only");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Number of Persons: " + newReservation.getNumberOfPerson());
                    System.out.println("Number of Days: " + newReservation.getNumberOfDay());
                    System.out.println("Total Amount: " + newReservation.getTotalAmount());
                    System.out.println("Reservation Status: " + (newReservation.getIsBooked() ? "Booked" : "Not Booked"));
                    break;
                }
                case 3: {
                    newReservation.cancelReservation();
                    System.out.println("Number of Persons: " + newReservation.getNumberOfPerson());
                    System.out.println("Number of Days: " + newReservation.getNumberOfDay());
                    System.out.println("Total Amount: " + newReservation.getTotalAmount());
                    System.out.println("Reservation Status: Cancelled");
                    break;
                }
                case 0: {
                    System.out.println("Quitting the app...");
                    break;
                }
                default: {
                    System.out.println("Please choose from options 1, 2, 3, 0 only");
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid option.");
        } finally {
            src.close();
        }
    }
}
