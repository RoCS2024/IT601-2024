import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the movie title: ");
        String movieTitle = scanner.nextLine();

        int capacity;
        do {
            System.out.print("Enter the capacity of the theatre: ");
            capacity = MovieTheatre.getValidIntInput(scanner);
        } while (capacity <= 0);

        double ticketPrice;
        do {
            System.out.print("Enter the ticket price: ₱");
            ticketPrice = MovieTheatre.getValidDoubleInput(scanner);
        } while (ticketPrice <= 0.0);

        MovieTheatre theatre = new MovieTheatre(movieTitle, capacity, ticketPrice);

        theatre.playMovie();

        boolean continueAdmitting = true;
        while (continueAdmitting) {
            System.out.print("Enter the number of viewers to admit (enter a negative value or 0 to start the movie): ");
            int numberOfViewersToAdmit = MovieTheatre.getValidIntInput(scanner);

            if (numberOfViewersToAdmit <= 0) {
                continueAdmitting = false;
            } else {
                for (int i = 0; i < numberOfViewersToAdmit; i++) {
                    theatre.admitViewer();
                }
            }
        }

        double revenue = theatre.calculateRevenue();
        System.out.println("Total revenue for the show: ₱" + revenue);

        scanner.close();
    }
}