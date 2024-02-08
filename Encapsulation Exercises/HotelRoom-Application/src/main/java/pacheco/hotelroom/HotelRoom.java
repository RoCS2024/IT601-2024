package main.java.pacheco.hotelroom;

public class HotelRoom {
    private boolean isBooked;
    private double costPerPerson;
    private int numberOfPerson;
    private int numberOfDay;

    public HotelRoom () {

    }

    public HotelRoom(boolean isBooked, double costPerPerson, int numberOfPerson, int numberOfDay) {
        this.isBooked = isBooked;
        this.costPerPerson = costPerPerson;
        this.numberOfPerson = numberOfPerson;
        this.numberOfDay = numberOfDay;
    }

    public void setBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    public boolean getIsBooked() {
        return this.isBooked;
    }

    public void setCostPerPerson (double costPerPerson) {
        this.costPerPerson = costPerPerson;
    }

    public double getCostPerPerson () {
        return this.costPerPerson;
    }

    public void setNumberOfPerson (int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public int getNumberOfPerson () {
        return this.numberOfPerson;
    }

    public void setNumberOfDay (int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public int getNumberOfDay () {
        return this.numberOfDay;
    }

     public void cancelReservation () {
        this.isBooked = false;
     }

    public double calculateTotalAmount() {
        return (this.numberOfPerson * this.costPerPerson) * this.numberOfDay;
    }
}
