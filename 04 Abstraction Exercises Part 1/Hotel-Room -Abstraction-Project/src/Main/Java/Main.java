import com.Hotel.Room.Project.HotelRoom;

import java.util.Scanner;

/**
 * This is the Main Class
 * */
public class Main {
    public static void main(String[] args){
        int NumOfAdults, NumOfChildren, NumOfDays;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Hotel De Luna!");

        int option;
        do {
            System.out.println("Choose an Option: ");
            System.out.println("1. Book Reservation: ");
            System.out.println("2. Cancel Reservation: ");
            System.out.println("0. Exit");
            System.out.print("Enter your Choice:");
            option = scanner.nextInt();

            switch (option) {
                    case 1: {
                        System.out.println("Enter Number of Adults: ");
                        NumOfAdults = scanner.nextInt();
                        if (NumOfAdults > HotelRoom.MaxNumOfAdult){
                            System.out.println("Invalid Input. Maximum number of Adult is 2");
                            break;
                        }

                        System.out.println("Enter Number of Children: ");
                        NumOfChildren = scanner.nextInt();
                        if (NumOfChildren > HotelRoom.MaxNumOfChildren){
                            System.out.println("Invalid Input. Maximum number of Children is 1");
                            break;
                        }

                        System.out.println("Enter Number of Days: ");
                        NumOfDays = scanner.nextInt();

                        HotelRoom room = new HotelRoom(NumOfAdults, NumOfChildren, NumOfDays);
                        double totalCharge = room.getTotalCharge();
                        System.out.println("Total Charge: " + totalCharge);
                        System.out.println("Room Reserved");
                            break;

                        }
                case 2: {
                    System.out.println("Are you sure you want to cancel the reservation? (yes/no)");
                    String cancelReservation = scanner.next();
                    if (cancelReservation.equals("yes")) {
                        System.out.println("Reservation Cancelled");
                    } else if (cancelReservation.equals("no")) {
                        System.out.println("Reservation not Cancelled");
                    } else {
                        System.out.println("Invalid input. Reservation not Cancelled");
                    }
                    break;
                }

            }



        }while(option !=0);

    }

}
