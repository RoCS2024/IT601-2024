import java.util.Scanner;

public class MovieTheatre {
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

    public static int getValidIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid integer: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double getValidDoubleInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid number: ₱");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}