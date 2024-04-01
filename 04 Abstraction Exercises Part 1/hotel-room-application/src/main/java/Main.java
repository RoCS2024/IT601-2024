
import com.hotel.room.application.HotelRoom;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfGuests = 0;
        int numOfDays = 0;
        boolean isReserved = true;
        System.out.println("Welcome to Hotel De Luna!");

        int option;
        do {
            System.out.println("Choose an Option: ");
            System.out.println("1. Book Reservation: ");
            System.out.println("2. Cancel Reservation: ");
            System.out.println("3. Check-out Guest: ");
            System.out.println("0. Exit");
            System.out.print("Enter your Choice:");
            option = scanner.nextInt();
            int choice3;
            switch (option) {
                case 1:
                    System.out.println("Book a reservation: type (1)yes, (2)no");
                    choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        System.out.println("Enter Number of Guests: ");
                        numOfGuests = scanner.nextInt();
                        if (numOfGuests > 10 || numOfGuests == 0) {
                            System.out.println("Invalid Input. Maximum number of Guests is 10");
                            break;
                        }

                        System.out.println("Enter Number of Days: ");
                        numOfDays = scanner.nextInt();
                        if (numOfDays == 0) {
                            System.out.println("Invalid Input.");
                            break;
                        }
                    } else {
                        if (choice3 == 2) {
                            break;
                        }

                        System.out.println("Invalid Input.");
                    }

                    isReserved = true;
                    HotelRoom room1 = new HotelRoom(numOfGuests, numOfDays, isReserved);
                    double totalCharge = room1.computeTotalCharge();
                    System.out.println("Total Charge: " + totalCharge);
                    System.out.println("Reservation made!");
                    break;
                case 2:
                    System.out.println("Cancel reservation: type (1)yes, (2)no ");
                    choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        if (!isReserved) {
                            System.out.println("Cancelled Error, no reservation made!");
                        } else {
                            System.out.println("Cancelled Successfully!");
                            isReserved = false;
                        }
                    } else if (choice3 != 2) {
                        System.out.println("Invalid Input.");
                    }
                    break;
                case 3:
                    System.out.println("Check Out: type (1)yes, (2)no ");
                    choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        if (!isReserved) {
                            System.out.println("Cancelled Checkout, no reservation made!");
                        } else {
                            System.out.println("Checked Out Successfully!");
                            isReserved = false;
                        }
                    } else if (choice3 != 2) {
                        System.out.println("Invalid Input.");
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }
        } while(true);

    }
}