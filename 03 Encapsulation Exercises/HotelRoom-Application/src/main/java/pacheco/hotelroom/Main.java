package main.java.pacheco.hotelroom;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        HotelRoom newReservation = new HotelRoom();
        newReservation.setCostPerPerson(1250);

        int option1;

        do {
            System.out.println("Choose from the options: ");
            System.out.println("1. Book Reservation");
            System.out.println("2. Display Reservation Record");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Check Out");
            System.out.println("0. Quit");

            System.out.println("Enter your choice: ");
            try {
                option1 = src.nextInt();
                switch (option1) {
                    case 1: {
                        if (newReservation.getIsBooked()) {
                            System.out.println("This room is already booked. What would you like to do?");
                            System.out.println("1. Cancel existing reservation and book new one");
                            System.out.println("2. Keep existing reservation and return to main menu");
                            int option = src.nextInt();
                            if (option == 1) {
                                newReservation.cancelReservation();
                            } else if (option == 2) {
                                break;
                            } else {
                                System.out.println("Invalid option. Please choose 1 or 2.");
                                break;
                            }
                        } else {
                            System.out.println("This room is not booked. Do you want to make a reservation?");
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            int option = src.nextInt();
                            if (option == 1) {
                                newReservation.setBooked(true);
                                System.out.println("Enter Number of Person: ");
                                int num1 = src.nextInt();
                                if (num1 <= 0) {
                                    System.out.println("Number of persons should be greater than 0.");
                                    continue;
                                }
                                newReservation.setNumberOfPerson(num1);

                                System.out.println("Enter Number of Days: ");
                                int num2 = src.nextInt();
                                if (num2 <= 0) {
                                    System.out.println("Number of days should be greater than 0.");
                                    continue;
                                }
                                newReservation.setNumberOfDay(num2);

                                System.out.println("Cost Per Head: " + newReservation.getCostPerPerson());
                                double totalAmount = newReservation.calculateTotalAmount();
                                System.out.println("Total Amount: " + totalAmount);

                            } else if (option == 2) {
                                break;
                            } else {
                                System.out.println("Invalid option. Please choose 1 or 2.");
                                break;
                            }
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("Number of Persons: " + newReservation.getNumberOfPerson());
                        System.out.println("Number of Days: " + newReservation.getNumberOfDay());
                        double totalAmount = newReservation.calculateTotalAmount();
                        System.out.println("Total Amount: " + totalAmount);
                        System.out.println("Reservation Status: " + (newReservation.getIsBooked() ? "Booked" : "Not Booked"));
                        break;
                    }
                    case 3: {
                        if (newReservation.getIsBooked()) {
                            newReservation.cancelReservation();
                            System.out.println("Reservation cancelled successfully.");
                        } else {
                            System.out.println("There is no reservation to cancel for this room.");
                        }
                        break;
                    }
                    case 4: {
                        if (newReservation.getIsBooked()) {
                            double totalAmount = newReservation.calculateTotalAmount();
                            System.out.println("Total Amount: " + totalAmount);
                            newReservation.cancelReservation();
                            System.out.println("Checked out successfully.");
                        } else {
                            System.out.println("There is no reservation to check out for this room.");
                        }
                        break;
                    }
                    case 0: {
                        System.out.println("Quitting the app...");
                        break;
                    }
                    default: {
                        System.out.println("Please choose from options 1, 2, 3, 4, 0 only");
                        break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid option.");
                src.nextLine();
                option1 = -1;
            }
        } while (option1 != 0);

        src.close();
    }
}
