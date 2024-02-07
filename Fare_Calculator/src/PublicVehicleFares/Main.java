package PublicVehicleFares;

import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
            int option = 0;

            System.out.println(" How many kilometers have you traveled from point A to B? : ");
            System.out.println("1. less than or exactly 5 Kilometers.");
            System.out.println("2. Is more than 5 Kilometers.");
            System.out.println("3. Quit the program.");
            System.out.println(" Input your Choice: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number.");
            sc.next();
        }
            option = sc.nextInt();


            switch(option) {
                case 1 : {
                    System.out.println(" Your fare is exactly 9 php.");
                    break ;
                }

                case 2 : {
                    System.out.println(" Enter how many kilometers: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number.");
                        sc.next();
                    }
                    int distance = sc.nextInt();

                    if (distance <= 5) {
                        System.out.println("Invalid distance. Distance must be more than 5 kilometers.");
                    } else {
                        int extraKilometers = distance - 5;
                        int fare = 9 + extraKilometers;
                        System.out.println("Your total fare is " + fare + " PHP");
                    }
                    break;
                    }

                case 3 : {
                    System.out.println(" Shutting down ");
                    break ;
                    }

                default: {
                    System.out.println("Invalid option. Please choose a valid option.");
                    }
                }


            }
    }

