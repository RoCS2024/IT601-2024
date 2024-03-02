public class MovieTheatre {
    private String movieTitle;
    private int capacity;
    private double ticketPrice;
    int numberOfViewers;

    public MovieTheatre(String movieTitle, int capacity, double ticketPrice) {
        this.movieTitle = movieTitle;
        this.capacity = capacity;
        this.ticketPrice = ticketPrice;
        this.numberOfViewers = 0;
    }

    public void playMovie() {
        System.out.println("Now playing: " + movieTitle);
    }

    public void setNumberOfViewers(int numberOfViewers) {
        this.numberOfViewers = numberOfViewers;
    }

    public int getCapacity() {
        return capacity;
    }

    public double calculateRevenue() {
        return numberOfViewers * ticketPrice;
    }
}