import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the movie title: ");
        String movieTitle = scanner.nextLine();


        System.out.print("Enter the capacity of the theatre: ");
        int capacity = getValidIntInput(scanner);

        System.out.print("Enter the ticket price: ₱");
        double ticketPrice = getValidDoubleInput(scanner);

        MovieTheatre theatre = new MovieTheatre(movieTitle, capacity, ticketPrice);

        theatre.playMovie();

        boolean continueAdmitting = true;
        while (continueAdmitting) {
            System.out.print("Enter the number of viewers to admit (enter a negative value or 0 to start the movie): ");
            int numberOfViewersToAdmit = getValidIntInput(scanner);

            if (numberOfViewersToAdmit <= 0) {
                continueAdmitting = false;
            } else {
                int remainingCapacity = theatre.getCapacity() - theatre.numberOfViewers;
                if (numberOfViewersToAdmit <= remainingCapacity) {
                    theatre.setNumberOfViewers(theatre.numberOfViewers + numberOfViewersToAdmit);
                    remainingCapacity -= numberOfViewersToAdmit;
                    System.out.println("Viewers admitted. Remaining seats: " + remainingCapacity);
                } else {
                    System.out.println("Sorry, the theatre is full. Cannot admit more viewers.");
                }
            }
        }

        double revenue = theatre.calculateRevenue();
        System.out.println("Total revenue for the show: ₱" + revenue);

        scanner.close();
    }

    private static int getValidIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid integer: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static double getValidDoubleInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid number: ₱");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}