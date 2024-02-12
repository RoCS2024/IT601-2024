import java.util.Scanner;

class MovieTheatre {
    private String movieTitle;
    private int capacity;
    private double ticketPrice;
    private int numberOfViewers;

    public MovieTheatre(String movieTitle, int capacity, double ticketPrice) {
        this.movieTitle = movieTitle;
        this.capacity = capacity;
        this.ticketPrice = ticketPrice;
        this.numberOfViewers = 0;
    }

    public void playMovie() {
        System.out.println("Now playing: " + movieTitle);
    }

    public void admitViewer() {
        if (numberOfViewers < capacity) {
            numberOfViewers++;
            System.out.println("Viewer admitted. Remaining seats: " + (capacity - numberOfViewers));
        } else {
            System.out.println("Sorry, the theatre is full. Cannot admit more viewers.");
        }
    }

    public double calculateRevenue() {
        return numberOfViewers * ticketPrice;
    }

    static int getValidIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid integer: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    static double getValidDoubleInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}

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
