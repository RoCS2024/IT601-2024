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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the movie title: ");
        String movieTitle = scanner.nextLine();

        System.out.print("Enter the capacity of the theatre: ");
        int capacity = scanner.nextInt();

        System.out.print("Enter the ticket price: ");
        double ticketPrice = scanner.nextDouble();

        MovieTheatre theatre = new MovieTheatre(movieTitle, capacity, ticketPrice);

        theatre.playMovie();

        System.out.print("Enter the number of viewers to admit: ");
        int numberOfViewersToAdmit = scanner.nextInt();

        for (int i = 0; i < numberOfViewersToAdmit; i++) {
            theatre.admitViewer();
        }

        double revenue = theatre.calculateRevenue();
        System.out.println("Total revenue for the show: $" + revenue);

        scanner.close();
    }
}
