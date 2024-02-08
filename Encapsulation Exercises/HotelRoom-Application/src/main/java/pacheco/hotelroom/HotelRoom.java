package main.java.pacheco.hotelroom;

public class HotelRoom {
    private boolean isBooked;
    private int costPerPerson;
    private int numberOfPerson;
    private int numberOfDay;
    private int totalAmount;

    public HotelRoom () {

    }

    public HotelRoom(boolean isBooked, int costPerPerson, int numberOfPerson, int numberOfDay, int totalAmount) {
        this.isBooked = isBooked;
        this.costPerPerson = costPerPerson;
        this.numberOfPerson = numberOfPerson;
        this.numberOfDay = numberOfDay;
        this.totalAmount = totalAmount;
    }

    public void setBooked(boolean isBooked) {
        if (isBooked) this.isBooked = true;
        else this.isBooked = false;
    }

    public boolean getIsBooked() {
        return this.isBooked;
    }

    public void setCostPerPerson (int costPerPerson) {
        this.costPerPerson = costPerPerson;
    }

    public int getCostPerPerson () {
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

    public void setTotalAmount (int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getTotalAmount () {
        return this.totalAmount;
    }

     public void cancelReservation () {
        this.isBooked = false;
     }

     public void calculateTotalAmount () {
        totalAmount = (this.numberOfPerson * this.costPerPerson) * this.numberOfDay;
    }
}
